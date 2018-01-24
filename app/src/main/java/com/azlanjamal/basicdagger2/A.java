package com.azlanjamal.basicdagger2;

/**
 * Created by akmalazlan on 24/01/2018.
 */

public class A {

    public A() {
    }

    public void constructMsg(B b) {
        System.out.println(b.showMessage());
    }
}
