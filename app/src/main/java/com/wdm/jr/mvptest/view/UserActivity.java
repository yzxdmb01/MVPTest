package com.wdm.jr.mvptest.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2016-11-08.
 */

public class UserActivity extends Activity implements IUserView, View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public void setFirstName(String firstName) {

    }

    @Override
    public void setLastName(String lastName) {

    }

}
