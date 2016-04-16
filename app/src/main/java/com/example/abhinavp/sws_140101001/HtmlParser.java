package com.example.abhinavp.sws_140101001;

import android.os.AsyncTask;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.File;
import java.io.IOException;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class HtmlParser extends AsyncTask<Void, Void, String> {

    private NodeList title;
    private String url = "http://www.iitg.ac.in/home/newsmore/news";

    @Override
    protected String doInBackground(Void... params) {
        try {
            // Connect to the web site
            Document document = (Document) Jsoup.connect(url).get();
            Element links = (Element) document.getElementsByTagName("div");
            Log.e("links  : ",links.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
