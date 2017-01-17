package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 张 on 2017/1/17.
 */

public class Basic {
    @SerializedName("city")
    public String cityname;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
