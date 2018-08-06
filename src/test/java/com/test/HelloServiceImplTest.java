package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HelloServiceImplTest {

    private HelloServiceImpl service;

    @Before
    public void setUp() {
        service = new HelloServiceImpl();
    }


    @Test
    public void hiNull() {
        String msg = service.hi(null);
        assertEquals("null", msg);
    }

    @Test
    public void hiRandom() {
        String msg = service.hi("asdf");
        assertEquals("随便输入的不行", msg);
    }
}