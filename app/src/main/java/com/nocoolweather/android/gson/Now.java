package com.nocoolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PanDiwen on 2017/5/13.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
