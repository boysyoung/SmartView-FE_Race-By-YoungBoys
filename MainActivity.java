package com.example.abhin.smartviewfe_race;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
     WebView wv;
   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv= (WebView) findViewById(R.id.wv);
        WebSettings webSettings = wv.getSettings();
        wv.getSettings() .setJavaScriptEnabled(true);
        wv.setFocusable(true);
        wv.setFocusableInTouchMode(true);
        wv.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wv.getSettings().setDomStorageEnabled(true);
        wv.getSettings().setDatabaseEnabled(true);
        wv.getSettings().setAppCacheEnabled(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://awzm.000webhostapp.com");
        wv.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if(wv.canGoBack()) {
            wv.goBack();
        }else {
            super.onBackPressed();

        }
    }
}
