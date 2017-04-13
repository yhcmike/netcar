package netCar.httpclient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

/**
 * Created by ffd on 2017/4/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/spring-application.xml"}) //加载配置文件
public class TaskHttpClient {

    @Test
    public void test() throws Exception {
        BufferedReader in = null;
        String content = null;
        try {
            // 定义HttpClient
            DefaultHttpClient client = new DefaultHttpClient(new PoolingClientConnectionManager());

            String username = "admin";// 登录用户
            String password = "0192023a7bbd73250516f069df18b500";// 登录密码
            // 需要提交登录的信息
            String urlLogin = "http://bike.chinalbs.org/login/login.do?username=" + username + "&password=" + password;
            HttpPost post = new HttpPost(urlLogin);
            HttpResponse response = client.execute(post);
            CookieStore cookieStore = client.getCookieStore();

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