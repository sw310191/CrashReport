package com.jyue.crashreport;

import android.os.Bundle;

public class MainActivity extends BaseActivity {
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(s.equals("any string"));

    }
}
