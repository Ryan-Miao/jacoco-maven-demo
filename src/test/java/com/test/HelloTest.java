package com.test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HelloTest {

    @InjectMocks
    private Hello hello;
    @Mock
    private HelloService helloService;

    @org.junit.Test
    public void hi() {
        when(helloService.hi(anyString()))
            .thenReturn("Hi World!");

        String msg = hello.hi("Hi");
        assertEquals(msg, "Hi World!");
    }
}