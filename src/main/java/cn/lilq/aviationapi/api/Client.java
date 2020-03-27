package cn.lilq.aviationapi.api;

import cn.lilq.aviationapi.pojo.RoutesAPI;
import cn.lilq.aviationapi.util.GsonUtils;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Repository;

import java.io.IOException;

/**
 * @auther: Li Liangquan
 * @date: 2020/3/26 14:45
 */
@Repository
public class Client {
    private static String API_KEY = "0bff870a00214e35acb6cb9c31c3a727";
    private OkHttpClient client;

    public Client() {
        client = new OkHttpClient();
    }

    public RoutesAPI queryFlight(String dep, String arr, String date){
        Request request = new Request.Builder()
                .url("http://apis.haoservice.com/plan/InternationalFlightQueryByCity?dep="+dep+"&arr="+arr+"&date="+date+"&pageNum=1&key="+API_KEY)
                .get()
                .build();
        try {
            Response response = client.newCall(request).execute();
            String m = response.body().string();
            return GsonUtils.fromJson(m,RoutesAPI.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new RoutesAPI();
    }
}
