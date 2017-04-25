package org.netCar.task;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.netCar.service.VehiclepositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

/**
 * Created by ffd on 2017/4/12.
 */

public class TaskJob {

    @Autowired
    private VehiclepositionService vehiclepositionService;

    public static int  id = 3;

    //@Scheduled(cron = "0/1 * * * * ?")
    public void job1() throws Exception {
        id++;
        vehiclepositionService.operationPostion(id);
    }
}