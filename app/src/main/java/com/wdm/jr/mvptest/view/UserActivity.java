package com.wdm.jr.mvptest.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.wdm.jr.mvptest.R;
import com.wdm.jr.mvptest.persenter.UserPersenter;

/**
 * Created by Administrator on 2016-11-08.
 */

public class UserActivity extends AppCompatActivity implements IUserView, View.OnClickListener {
    private EditText etFirstName, etLastName, etId;
    private Button btnSave, btnLoad;
    private UserPersenter userPersenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        initView();
        userPersenter = new UserPersenter(this);
    }

    private void initView() {
        etFirstName = (EditText) findViewById(R.id.et_first_name);
        etLastName = (EditText) findViewById(R.id.et_last_name);
        etId = (EditText) findViewById(R.id.et_id);
        btnSave = (Button) findViewById(R.id.btn_save);
        btnLoad = (Button) findViewById(R.id.btn_load);
        btnSave.setOnClickListener(this);
        btnLoad.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_save:
                //保存
                userPersenter.saveUser(getID(), getFirstName(), getLastName());
                break;
            case R.id.btn_load:
                //读取
                userPersenter.loadUser(getID());
                break;
        }
    }

    @Override
    public int getID() {
        return Integer.parseInt(etId.getText().toString());
    }

    @Override
    public String getFirstName() {
        return etFirstName.getText().toString();
    }

    @Override
    public String getLastName() {
        return etLastName.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        etFirstName.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        etLastName.setText(lastName);
    }

    @Override
    public Context getContext() {
        return this;
    }

}
