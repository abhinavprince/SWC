package com.example.abhinavp.sws_140101001;

import android.app.Activity;
import android.os.Bundle;

import java.util.concurrent.ExecutionException;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class Announcements extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.announcements);
       /* HtmlParser parser = new HtmlParser();
        try {
            parser.execute().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/


    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
