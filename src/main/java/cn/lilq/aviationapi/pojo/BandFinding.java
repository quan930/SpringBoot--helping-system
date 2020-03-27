package cn.lilq.aviationapi.pojo;

/**
 * @auther: Li Liangquan
 * @date: 2020/3/26 22:37
 * 求带pojo类
 */
public class BandFinding {
    private String id;
    private String name;//物品名称
    private String tel;//联系电话
    private String placeOfPurchase;//购买地点
    private String arr;//物品到达地点
    private String date;//需求时间
    private String state;//状态 0为待接受 1为已经接受

    public BandFinding() {
    }

    public BandFinding(String id, String name, String tel, String placeOfPurchase, String arr, String date, String state) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.placeOfPurchase = placeOfPurchase;
        this.arr = arr;
        this.date = date;
        this.state = state;
    }

    @Override
    public String toString() {
        return "BandFinding{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", placeOfPurchase='" + placeOfPurchase + '\'' +
                ", arr='" + arr + '\'' +
                ", date='" + date + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPlaceOfPurchase() {
        return placeOfPurchase;
    }

    public void setPlaceOfPurchase(String placeOfPurchase) {
        this.placeOfPurchase = placeOfPurchase;
    }

    public String getArr() {
        return arr;
    }

    public void setArr(String arr) {
        this.arr = arr;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
