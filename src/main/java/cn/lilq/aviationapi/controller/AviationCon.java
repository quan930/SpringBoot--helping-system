package cn.lilq.aviationapi.controller;

import cn.lilq.aviationapi.api.Client;
import cn.lilq.aviationapi.dao.Dao;
import cn.lilq.aviationapi.pojo.BandFinding;
import cn.lilq.aviationapi.pojo.HelpAnd;
import cn.lilq.aviationapi.pojo.Response;
import cn.lilq.aviationapi.pojo.RoutesAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @auther: Li Liangquan
 * @date: 2020/3/26 13:44
 */
@RestController
public class AviationCon {
    @Autowired
    private Client client;
    @Autowired
    private Dao dao;

    /**
     * //dep=BJS&arr=YTO&date=20200425 ok!
     * 查询航线
     * @param dep
     * @param arr
     * @param date
     * @return
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/query")
    public RoutesAPI queryFlight(@RequestParam(name = "dep") String dep, @RequestParam(name = "arr") String arr, @RequestParam(name = "date") String date){
        return client.queryFlight(dep, arr, date);
    }

    /**
     * 全部求带订单
     * @return
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/bandfindings")
    public Response allBandFindings(){
        return new Response("SUCCESS",dao.allBandFindings(),null);
    }

    /**
     * ok
     * 注册订单
     * @param bandFinding 订单
     * @return
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/bandfinding",method = RequestMethod.POST)
    public Response addBandFinding(@RequestBody BandFinding bandFinding){
        if (dao.addBandFinding(bandFinding))
            return new Response("SUCCESS",null,null);
        return new Response("ERROR",null,null);
    }

    /**
     * ok
     * 接受订单
     * @param bandFinding
     * @return
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/accept",method = RequestMethod.POST)
    public Response acceptOrders(@RequestBody BandFinding bandFinding){
        if (dao.acceptOrders(bandFinding))
            return new Response("SUCCESS",null,null);
        return new Response("ERROR",null,null);
    }

    /**
     * 提交帮带订单
     * @param helpAnd
     * @return
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/helpand",method = RequestMethod.POST)
    public Response addHelpAnd(@RequestBody HelpAnd helpAnd){
        if (dao.addHelpAnd(helpAnd))
            return new Response("SUCCESS",null,null);
        return new Response("ERROR",null,null);
    }


    /**
     * 全部帮带订单
     * @return
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/helpands")
    public Response allHelpAnds(){
        return new Response("SUCCESS",null,dao.allHelpAnds());
    }
}
