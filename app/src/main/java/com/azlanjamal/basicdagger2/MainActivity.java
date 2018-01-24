package com.azlanjamal.basicdagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.azlanjamal.basicdagger2.di.AComponent;
import com.azlanjamal.basicdagger2.di.AModule;
import com.azlanjamal.basicdagger2.di.BComponent;
import com.azlanjamal.basicdagger2.di.BModule;
import com.azlanjamal.basicdagger2.di.DaggerAComponent;
import com.azlanjamal.basicdagger2.di.DaggerBComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    A a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AComponent component = DaggerAComponent
                .builder()
                .aModule(new AModule())
                .build();
        component.giveTo(this);

        a.constructMsg();
    }
}
