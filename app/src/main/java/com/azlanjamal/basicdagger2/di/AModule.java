package com.azlanjamal.basicdagger2.di;

import com.azlanjamal.basicdagger2.A;

import dagger.Module;
import dagger.Provides;

/**
 * Created by akmalazlan on 24/01/2018.
 */

@Module
public class AModule {

    @Provides
    A provideA() {
        return new A();
    }
}
