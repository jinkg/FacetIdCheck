package com.yalin.facetidcheck;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by YaLin
 * On 2016/10/23.
 */
public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("facet_id-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void checkFacetId(View view) {
        boolean result = FacetIdHelper.checkCurrentFacetId(getApplicationContext());
        TextView tv = (TextView) findViewById(R.id.sample_text);
        if (result) {
            tv.setText("valid");
        } else {
            tv.setText("invalid");
        }
    }
}
