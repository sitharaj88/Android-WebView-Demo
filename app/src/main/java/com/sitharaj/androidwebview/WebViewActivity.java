package com.sitharaj.androidwebview;

import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class WebViewActivity extends AppCompatActivity {
    private WebView webView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_web_view);
        webView = findViewById(R.id.webView);

        initWebView(webView);

        webView.loadUrl("http://google.com");
    }

    private void initWebView(WebView webView) {
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        webSettings.setDisplayZoomControls(false);
        webSettings.setSupportZoom(false);
        webView.setWebViewClient(new CustomWebViewClient());
        webView.setWebChromeClient(new CustomChromeClient());
    }
}