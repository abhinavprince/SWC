package com.example.abhinavp.sws_140101001;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class LogIn{

    private String username, password;

    private WebView webView;

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
    }
    };

    protected LogIn(EditText usernameET, EditText passwordET, WebView webview) {
        username = usernameET.getText().toString();
        password = passwordET.getText().toString();
        webView = webview;
    }

    protected int isLoginCredentialTrue() throws IOException {
        String  url = "http://pabhinav.byethost7.com/ce03/reg.php?username="+ username + "&password=" + password;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new MyWebViewClient());
        webView.loadUrl(url);
        return 1;
    }
}
