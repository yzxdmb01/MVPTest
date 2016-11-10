package com.wdm.jr.mvptest.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.wdm.jr.mvptest.R;
import com.wdm.jr.mvptest.persenter.WeatherPersenter;

public class WeatherActivity extends AppCompatActivity implements IWeatherView, View.OnClickListener {
    TextView tvWeatherInfo;
    EditText etCityCode;
    WeatherPersenter weatherPersenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        weatherPersenter = new WeatherPersenter(this);

        initView();
    }

    private void initView() {
        tvWeatherInfo = (TextView) findViewById(R.id.tv_weather_info);
        Button btnSearch = (Button) findViewById(R.id.btn_search);
        btnSearch.setOnClickListener(this);
        etCityCode = (EditText) findViewById(R.id.et_city_code);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_search:
                //调用Persenter的查询方法
                weatherPersenter.searchWeather(getCityCode());
                break;
        }

    }

    public String getCityCode() {
        return etCityCode.getText().toString();
    }

    @Override
    public void setWeatherInfo(String info) {
        tvWeatherInfo.setText(info);
    }
}
