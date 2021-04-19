package com.sitharaj.androidwebview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentWebViewDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_web_view_demo_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, WebViewDemoFragment.newInstance())
                    .commitNow();
        }
    }
}