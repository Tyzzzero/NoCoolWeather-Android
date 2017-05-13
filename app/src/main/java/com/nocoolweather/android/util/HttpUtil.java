package com.nocoolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by PanDiwen on 2017/5/13.
 */

public class HttpUtil {
    public static void sendOkHttpRequsent(String adress, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(adress).build();
        client.newCall(request).enqueue(callback);
    }
}
