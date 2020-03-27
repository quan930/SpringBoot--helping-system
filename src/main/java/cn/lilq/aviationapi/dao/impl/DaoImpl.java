package cn.lilq.aviationapi.dao.impl;

import cn.lilq.aviationapi.dao.Dao;
import cn.lilq.aviationapi.pojo.BandFinding;
import cn.lilq.aviationapi.pojo.HelpAnd;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @auther: Li Liangquan
 * @date: 2020/3/26 22:51
 */
@Repository("dao")
public class DaoImpl implements Dao {
    private List<BandFinding> bandFindings;
    private List<HelpAnd> helpAnds;

    public DaoImpl() {
        bandFindings = new CopyOnWriteArrayList<>();
        helpAnds = new CopyOnWriteArrayList<>();
    }

    @Override
    public List<BandFinding> allBandFindings() {
        return bandFindings;
    }

    @Override
    public boolean addBandFinding(BandFinding bandFinding) {
        if (bandFinding==null)
            return false;
        if (bandFinding.getArr()==null||bandFinding.getDate()==null||bandFinding.getName()==null||bandFinding.getPlaceOfPurchase()==null||bandFinding.getTel()==null)
            return false;
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
//        String id, String name, String tel, String placeOfPurchase, String arr, String date, String state
        bandFindings.add(new BandFinding(uuid,bandFinding.getName(),bandFinding.getTel(),bandFinding.getPlaceOfPurchase(),bandFinding.getArr(),bandFinding.getDate(),"0"));
        return true;
    }

    @Override
    public boolean acceptOrders(BandFinding bandFinding) {
        if (bandFinding==null)
            return false;
        if (bandFinding.getId()==null)
            return false;
        //找到元素
        int m=-1;
        for (int i = 0; i < bandFindings.size(); i++) {
            if(bandFindings.get(i).getId().equals(bandFinding.getId())){
                m=i;
                break;
            }
        }
        if (m==-1)
            return false;
        bandFindings.get(m).setState("1");
        return true;
    }

    @Override
    public List<HelpAnd> allHelpAnds() {
        return helpAnds;
    }

    @Override
    public boolean addHelpAnd(HelpAnd helpAnd) {
        if (helpAnd==null)
            return false;
        if (helpAnd.getDatatime()==null||helpAnd.getName()==null||helpAnd.getTel()==null)
            return false;
        helpAnds.add(helpAnd);
        return true;
    }
}
