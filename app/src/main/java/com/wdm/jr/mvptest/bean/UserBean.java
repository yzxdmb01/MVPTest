package com.wdm.jr.mvptest.bean;

/**
 * Created by Administrator on 2016-11-08.
 */

public class UserBean {
    private String firstName;
    private String lastName;

    public UserBean(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
