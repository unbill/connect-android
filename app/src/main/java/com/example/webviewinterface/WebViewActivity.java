package com.example.webviewinterface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView.setWebContentsDebuggingEnabled(true);

        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("https://connect.q2open.io");
        webView.clearCache(true);
        webView.addJavascriptInterface(new WebAppInterface(this), "Q2Events");
        
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled((true));
    }
}
