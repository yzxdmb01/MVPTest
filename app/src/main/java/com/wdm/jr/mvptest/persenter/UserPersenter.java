package com.wdm.jr.mvptest.persenter;

import android.util.Log;
import android.widget.Toast;

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

    /**
     * 通过model保存数据
     *
     * @param id
     * @param firstName
     * @param lastName
     */
    public void saveUser(int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
        Toast.makeText(mUserView.getContext(), "已保存", Toast.LENGTH_SHORT).show();
    }

    /**
     * 通过调用IUserView的方法来更新显示
     *
     * @param id
     */
    public void loadUser(int id) {
        Log.i("P", "id:" + id);
        try {
            UserBean user = mUserModel.load(id);
            mUserView.setFirstName(user.getFirstName());
            mUserView.setLastName(user.getLastName());
            Toast.makeText(mUserView.getContext(), "id:" + id + "," + user.toString(), Toast.LENGTH_SHORT).show();
        } catch (NullPointerException e) {
            Toast.makeText(mUserView.getContext(), "无数据", Toast.LENGTH_SHORT).show();
        }

    }
}
