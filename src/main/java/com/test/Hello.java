package com.test;

/**
 * @author Ryan Miao at 2018-08-06 10:44
 **/
public class Hello {

    private final HelloService helloService;

    public Hello(HelloService helloService) {
        this.helloService = helloService;
    }

    public String hi(String msg) {
        return helloService.hi(msg);
    }

}
