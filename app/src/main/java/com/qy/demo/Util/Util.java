package com.qy.demo.Util;

import com.facebook.rebound.Spring;
import com.facebook.rebound.SpringConfig;
import com.facebook.rebound.SpringSystem;

/**
 * Created by lwq on 2018/4/28.
 */
public class Util {
    public static Spring spring;

    static {
        spring = SpringSystem.create().createSpring();
        spring.setSpringConfig(new SpringConfig(50, 5));
    }
}
