package cn.lilq.aviationapi.dao;

import cn.lilq.aviationapi.pojo.BandFinding;
import cn.lilq.aviationapi.pojo.HelpAnd;

import java.util.List;

/**
 * @auther: Li Liangquan
 * @date: 2020/3/26 22:45
 */
public interface Dao {
    /**
     * 返回全部求带订单
     * @return
     */
    List<BandFinding> allBandFindings();

    /**
     * 增加求带订单
     * @param bandFinding  订单
     * @return 成功返回true 否则返回false
     */
    boolean addBandFinding(BandFinding bandFinding);

    /**
     * 接受订单
     * @param bandFinding id订单id
     * @return 成功返回true 否则返回false
     */
    boolean acceptOrders(BandFinding bandFinding);

    /**
     * 返回全部帮带订单
     * @return
     */
    List<HelpAnd> allHelpAnds();

    /**
     * 添加帮带订单
     * @param helpAnd 帮带订单
     * @return 成功返回true 否则 false
     */
    boolean addHelpAnd(HelpAnd helpAnd);
}
