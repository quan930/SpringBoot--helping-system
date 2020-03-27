package cn.lilq.aviationapi.pojo;

/**
 * @auther: Li Liangquan
 * @date: 2020/3/26 14:20
 */
public class Parameter {
    //dep=BJS&arr=YTO&date=20200425
    private String dep;//开始城市
    private String arr;//结束城市
    private String date;//时间

    public Parameter() {
    }

    public Parameter(String dep, String arr, String date) {
        this.dep = dep;
        this.arr = arr;
        this.date = date;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
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

    @Override
    public String toString() {
        return "Parameter{" +
                "dep='" + dep + '\'' +
                ", arr='" + arr + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
