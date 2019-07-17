package com.example.micha.alc4phaseone;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALCActivity extends AppCompatActivity {

    WebView aboutALC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        getSupportActionBar().setTitle(R.string.about_alc);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();
        loadWebView();

    }
    public void init(){
        aboutALC = findViewById(R.id.web_view_alc);
    }
    public void loadWebView(){
        aboutALC.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        aboutALC.loadUrl("https://andela.com/alc/");
        WebSettings webSettings = aboutALC.getSettings();
    }
}
