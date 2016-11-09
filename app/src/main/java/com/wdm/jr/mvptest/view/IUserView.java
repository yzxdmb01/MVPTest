package com.wdm.jr.mvptest.view;

import android.content.Context;

/**
 * Created by Administrator on 2016-11-08.
 */

public interface IUserView {
    int getID();

    String getFirstName();

    String getLastName();

    void setFirstName(String firstName);

    void setLastName(String lastName);

    Context getContext();
}
