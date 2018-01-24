package com.azlanjamal.basicdagger2.di;

import com.azlanjamal.basicdagger2.MainActivity;

import dagger.Component;

/**
 * Created by akmalazlan on 24/01/2018.
 */

@Component(modules = AModule.class)
public interface AComponent {
    void giveTo(MainActivity mainActivity);
}
