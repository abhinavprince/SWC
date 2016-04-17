package com.example.abhinavp.sws_140101001;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by AbhinavP on 4/17/2016.
 */
public class Signup extends AsyncTask<Void, Void, Void>{
    private String name, email, password;
    private Context appcontext;
    protected Signup(String Name, String Email, String Password, Context applicationContext) {
        name = Name;
        email = Email;
        password = Password;
        appcontext = applicationContext;
    }

    public void send_data() throws IOException {
        URL url = new URL("http://pabhinav.atwebpages.com/SWC/signup_SWC_140101001.php");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(10000);
        conn.setConnectTimeout(15000);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("USER-AGENT", "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:45.0) Gecko/20100101 Firefox/45.0");
        conn.setRequestProperty("ACCEPT-LANGUAGE", "en-US,en;0.5");
        conn.setDoInput(true);
        conn.setDoOutput(true);
        String data = URLEncoder.encode("username", "UTF-8")
                + "=" + URLEncoder.encode(email, "UTF-8");
        data += "&" + URLEncoder.encode("name", "UTF-8") + "="
                + URLEncoder.encode(name, "UTF-8");
        data +=  "&" + URLEncoder.encode("password", "UTF-8") + "="
                + URLEncoder.encode(password, "UTF-8");
        if(data!=null) {
            Log.e("Abhinav data: ", data);
            OutputStream os = conn.getOutputStream();
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(os, "UTF-8"));
            writer.write(data);
            writer.flush();
            writer.close();
            os.close();
        }
        conn.connect();
        Log.e("Abhinav conn: ", conn.getResponseCode() + " response code is :" + conn.getResponseCode());
    }

    @Override
    protected Void doInBackground(Void... params) {
        try {
            send_data();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Toast.makeText(appcontext, "You are registered! Login with your email and password", Toast.LENGTH_SHORT).show();
    }
}
