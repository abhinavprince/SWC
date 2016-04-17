package com.example.abhinavp.sws_140101001;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class SignIn extends AsyncTask<Void, Void, Boolean> {

    private String username, password, NAME;

    JSONObject object = null;

    private boolean isCredentiaTrue = false;

    protected String get_name(){
        return NAME;
    }

    public SignIn(EditText usernameET, EditText passwordET) {
        username = usernameET.getText().toString();
        password = passwordET.getText().toString();
    }

    protected boolean isLoginCredentialTrue() throws IOException, JSONException {

        URL url = new URL("http://pabhinav.atwebpages.com/SWC/login_SWC_140101001.php");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(10000);
        conn.setConnectTimeout(15000);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("USER-AGENT", "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:45.0) Gecko/20100101 Firefox/45.0");
        conn.setRequestProperty("ACCEPT-LANGUAGE", "en-US,en;0.5");
        conn.setDoInput(true);
        conn.setDoOutput(true);

        String data = URLEncoder.encode("username", "UTF-8")
                + "=" + URLEncoder.encode(username, "UTF-8");
        data += "&" + URLEncoder.encode("password", "UTF-8") + "="
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

        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
            InputStream is = conn.getInputStream();
            InputStreamReader isReader = new InputStreamReader(is, "UTF-8");
            BufferedReader reader = new BufferedReader(isReader);
            String result = "";
            String line = "";
            while ((line = reader.readLine()) != null) {
                result += line;
            }
            String result2 = result.substring(result.lastIndexOf("{"));
            Log.e("JSON result : ",result2);
            if (result.trim().length() > 2) {
                object = new JSONObject(result2);
                String success = object.getString("success");
                String message = object.getString("message");
                NAME = object.getString("name");
                Log.e("Object[success] =  : ",success);
                Log.e("Object[name] =  : ",NAME);
                if(message.equals("Username and password foud in Database :) :)"))
                    isCredentiaTrue = true;
            }
        }

        conn.connect();
        Log.e("Abhinav conn: ", conn.getResponseCode() + " response code is :" + conn.getResponseCode());
        return isCredentiaTrue;
    }

    @Override
    protected Boolean doInBackground(Void... params) {
        try {
            return isLoginCredentialTrue();
        } catch (IOException e) {
            Log.e("AbhinavIOException : ", e.toString());
            e.printStackTrace();
        } catch (JSONException e){
            Log.e("Abhinav JSON exception:", e.toString());
            e.printStackTrace();
        }
        return false;
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        Log.e("onpostexecute", Boolean.toString(aBoolean));
        super.onPostExecute(aBoolean);
    }
}
