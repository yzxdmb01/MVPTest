package com.wdm.jr.mvptest.persenter;

import com.wdm.jr.mvptest.bean.UserBean;
import com.wdm.jr.mvptest.model.IUserModel;
import com.wdm.jr.mvptest.model.UserModel;
import com.wdm.jr.mvptest.view.IUserView;

/**
 * Created by Administrator on 2016-11-08.
 */

public class UserPersenter {
    private IUserView mUserView;
    private IUserModel mUserModel;

    public UserPersenter(IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser(int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id) {
        UserBean user = mUserModel.load(id);
        mUserView.setFirstName(user.getFirstName());//通过调用IUserView的方法来更新显示
        mUserView.setLastName(user.getLastName());
    }
}
