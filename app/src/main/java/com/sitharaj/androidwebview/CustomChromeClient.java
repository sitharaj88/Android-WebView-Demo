package com.sitharaj.androidwebview;

import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class CustomChromeClient extends WebChromeClient {
    private static final String TAG = "CustomChromeClient";

    @Override
    public void onProgressChanged(WebView view, int newProgress) {
        super.onProgressChanged(view, newProgress);
        Log.i(TAG, "onProgressChanged is called");

    }

    @Override
    public void onReceivedTitle(WebView view, String title) {
        super.onReceivedTitle(view, title);
        Log.i(TAG, "onReceivedTitle is called");
    }
}
