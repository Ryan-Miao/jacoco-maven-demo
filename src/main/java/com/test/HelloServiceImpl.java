package com.test;

/**
 * @author Ryan Miao at 2018-08-06 10:48
 **/
public class HelloServiceImpl implements HelloService {

    public String hi(String msg) {
        if (msg == null) {
            return "null";
        }

        if (msg.equalsIgnoreCase("asdf")) {
            return "随便输入的不行";
        }

        if (msg.length() < 2) {
            return "长度不够";
        }

        return msg;
    }
}
