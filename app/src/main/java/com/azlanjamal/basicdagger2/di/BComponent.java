package com.azlanjamal.basicdagger2.di;

import com.azlanjamal.basicdagger2.A;

import dagger.Component;

/**
 * Created by akmalazlan on 24/01/2018.
 */

@Component(modules = BModule.class)
public interface BComponent {
    void giveTo(A a);
}
