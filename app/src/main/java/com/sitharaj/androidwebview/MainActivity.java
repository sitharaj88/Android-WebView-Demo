package com.sitharaj.androidwebview;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.sitharaj.androidwebview.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.webviewActivityDemo).setOnClickListener(this);
        findViewById(R.id.webviewFragmentDemo).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.webviewActivityDemo:
                launchWebViewActivity();
                break;
            case R.id.webviewFragmentDemo:
                launchWebViewFragmentActivity();
                break;
        }
    }

    private void launchWebViewActivity() {
        startActivity(new Intent(this, WebViewActivity.class));
    }

    private void launchWebViewFragmentActivity() {
        startActivity(new Intent(this, FragmentWebViewDemoActivity.class));
    }
}