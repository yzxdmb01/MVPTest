package com.wdm.jr.mvptest.model;

import com.wdm.jr.mvptest.bean.UserBean;

/**
 * Created by Administrator on 2016-11-08.
 */

public interface IUserModel {
    void setID(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    int getID();

    UserBean load(int id);
}
