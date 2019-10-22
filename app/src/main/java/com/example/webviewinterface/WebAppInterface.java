package com.example.webviewinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    Context mContext;

    // Instantiate the interface and set the context
    WebAppInterface(Context c) {
        mContext = c;
    }

    // Show a toast from the web page
    @JavascriptInterface
    public void postMessage(String event) {
        Toast.makeText(mContext, event, Toast.LENGTH_SHORT).show();
    }
}