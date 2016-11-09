package com.wdm.jr.mvptest.model;

import android.util.SparseArray;

import com.wdm.jr.mvptest.bean.UserBean;

/**
 * Created by Administrator on 2016-11-08.
 */

public class UserModel implements IUserModel {
    private String firstName;
    private String lastName;
    private int mId;
    private SparseArray<UserBean> users = new SparseArray<>();

    @Override
    public void setID(int id) {
        mId = id;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
        UserBean user = new UserBean(this.firstName, this.lastName);
        users.append(mId, user);
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public UserBean load(int id) {
        return users.get(id);
    }

}
