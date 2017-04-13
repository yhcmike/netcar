package org.netCar.task;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

/**
 * Created by ffd on 2017/4/12.
 */
@Component("taskJob")
public class TaskJob {
    @Scheduled(cron = "0/5 * * * * ?")
    public void job1() throws Exception {
        BufferedReader in = null;
        String content = null;
        try {
            // 定义HttpClient
            DefaultHttpClient client = new DefaultHttpClient(new PoolingClientConnectionManager());

            String username = "admin";// 登录用户
            String password = "admin123";// 登录密码
            // 需要提交登录的信息
            String urlLogin = "http://bike.chinalbs.org/html/login.html?username=" + username + "&password=" + password;
            HttpPost post = new HttpPost(urlLogin);
            HttpResponse response = client.execute(post);
            HttpEntity entity = response.getEntity();
            CookieStore cookieStore = client.getCookieStore();
            System.out.println("====="+cookieStore.getCookies().size());
            for (Cookie cookie : cookieStore.getCookies()){
                System.out.println(cookie.getName()+"    "+cookie.getValue());
            }
            client.setCookieStore(cookieStore);

            // 实例化HTTP方法
            HttpGet request = new HttpGet();
            request.setURI(new URI("http://bike.chinalbs.org/sceniccompany/findPageAll.do?type=1&type=1&page=1&rows=10"));

            response = client.execute(request);

            in = new BufferedReader(new InputStreamReader(response.getEntity()
                    .getContent()));
            StringBuffer sb = new StringBuffer("");
            String line = "";
            String NL = System.getProperty("line.separator");
            while ((line = in.readLine()) != null) {
                sb.append(line + NL);
            }
            in.close();
            content = sb.toString();
        } finally {
            if (in != null) {
                try {
                    in.close();// 最后要关闭BufferedReader
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(content);
        }
    }
}