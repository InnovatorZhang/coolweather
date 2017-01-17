package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 张 on 2017/1/17.
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
