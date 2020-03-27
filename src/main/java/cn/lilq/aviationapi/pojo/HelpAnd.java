package cn.lilq.aviationapi.pojo;

/**
 * @auther: Li Liangquan
 * @date: 2020/3/27 14:52
 */
public class HelpAnd {
    private String tel;
    private String name;
    private String datatime;

    public HelpAnd(String tel, String name, String datatime) {
        this.tel = tel;
        this.name = name;
        this.datatime = datatime;
    }

    public HelpAnd() {
    }

    @Override
    public String toString() {
        return "HelpAnd{" +
                "tel='" + tel + '\'' +
                ", name='" + name + '\'' +
                ", datatime='" + datatime + '\'' +
                '}';
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }
}
