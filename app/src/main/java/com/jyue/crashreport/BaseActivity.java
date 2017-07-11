package com.jyue.crashreport;

import android.app.Activity;
import android.os.Bundle;

/**
 * BaseActivity
 * Created by Jyue on 2017/7/11.
 */

public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(BaseActivity.this);
    }
}
