package com.learn.fmtest4.component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-07-28 10:57
 **/
@WebListener
public class MyListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("MyListener>>>requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("MyListener>>>requestInitialized");
    }
}
