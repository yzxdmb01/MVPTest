package com.wdm.jr.mvptest.model;


/**
 * Created by Administrator on 2016-11-10.
 */

public class WeatherModel implements IWeatherModel {
    @Override
    public String getWeatherInfo(String cityCode) {
        //假装联网查询了
        return "天气：23度";
    }
}
