package cn.lilq.aviationapi.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @auther: Li Liangquan
 * @date: 2020/3/26 14:34
 */
public class RoutesAPI {
    @SerializedName("error_code")
    private Integer errorCode;//错误代码
    private String reason;//string 为成功即为成功
    @SerializedName("result")
    private List<Route> routes;

    public RoutesAPI() {
    }

    public RoutesAPI(Integer errorCode, String reason, List<Route> routes) {
        this.errorCode = errorCode;
        this.reason = reason;
        this.routes = routes;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "RoutesAPI{" +
                "errorCode=" + errorCode +
                ", reason='" + reason + '\'' +
                ", routes=" + routes +
                '}';
    }

    public static class Route{
        private String name;//航班
        private String date;//日期
        private String company;//航空公司
        private String dep;//起飞机场
        private String arr;//到达机场
        @SerializedName("dep_time")
        private String depTime;
        @SerializedName("arr_time")
        private String arrTime;

        public Route() {
        }

        public Route(String name, String date, String company, String dep, String arr, String depTime, String arrTime) {
            this.name = name;
            this.date = date;
            this.company = company;
            this.dep = dep;
            this.arr = arr;
            this.depTime = depTime;
            this.arrTime = arrTime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
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

        public String getDepTime() {
            return depTime;
        }

        public void setDepTime(String depTime) {
            this.depTime = depTime;
        }

        public String getArrTime() {
            return arrTime;
        }

        public void setArrTime(String arrTime) {
            this.arrTime = arrTime;
        }

        @Override
        public String toString() {
            return "Route{" +
                    "name='" + name + '\'' +
                    ", date='" + date + '\'' +
                    ", company='" + company + '\'' +
                    ", dep='" + dep + '\'' +
                    ", arr='" + arr + '\'' +
                    ", depTime='" + depTime + '\'' +
                    ", arrTime='" + arrTime + '\'' +
                    '}';
        }
    }
}
