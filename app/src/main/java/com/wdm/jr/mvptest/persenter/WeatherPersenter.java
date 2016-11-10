package com.wdm.jr.mvptest.persenter;

import com.wdm.jr.mvptest.model.IWeatherModel;
import com.wdm.jr.mvptest.model.WeatherModel;
import com.wdm.jr.mvptest.view.IWeatherView;

/**
 * Created by Administrator on 2016-11-10.
 */

public class WeatherPersenter {
    IWeatherView weatherView;
    IWeatherModel weatherModel;

    public WeatherPersenter(IWeatherView weatherView) {
        this.weatherView = weatherView;
        weatherModel = new WeatherModel();
    }

    public void searchWeather(String cityCode) {
        String info = weatherModel.getWeatherInfo(cityCode);
        weatherView.setWeatherInfo(info);
    }
}
