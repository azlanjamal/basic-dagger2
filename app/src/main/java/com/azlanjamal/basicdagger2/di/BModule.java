package com.azlanjamal.basicdagger2.di;

import com.azlanjamal.basicdagger2.B;

import dagger.Module;
import dagger.Provides;

/**
 * Created by akmalazlan on 24/01/2018.
 */

@Module
public class BModule {

    @Provides
    B provideB() {
        return new B();
    }
}
