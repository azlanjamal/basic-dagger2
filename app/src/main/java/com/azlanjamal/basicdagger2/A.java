package com.azlanjamal.basicdagger2;

import com.azlanjamal.basicdagger2.di.BComponent;
import com.azlanjamal.basicdagger2.di.BModule;
import com.azlanjamal.basicdagger2.di.DaggerBComponent;

import javax.inject.Inject;

/**
 * Created by akmalazlan on 24/01/2018.
 */

public class A {

    @Inject
    B b;

    public A() {
        BComponent component = DaggerBComponent
                .builder()
                .bModule(new BModule())
                .build();
        component.giveTo(this);
    }

    public void constructMsg() {
        System.out.println(b.showMessage());
    }
}
