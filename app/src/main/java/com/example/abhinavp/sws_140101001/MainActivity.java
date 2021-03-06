package com.example.abhinavp.sws_140101001;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    public  boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        Log.e("lollll: ",netInfo.toString());
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }

    protected boolean isCredentialsTrue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText usernameET = (EditText) findViewById(R.id.username_edit_text);
        final EditText passwordET = (EditText) findViewById(R.id.password_edit_text);
        final WebView webView = (WebView) findViewById(R.id.webView);
        Button loginBtn = (Button) findViewById(R.id.login_button);
        Button CreateTV = (Button) findViewById(R.id.create_btn);
        CreateTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isOnline()==false){
                    Toast.makeText(MainActivity.this, "Check your Internet Connection!", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent i = new Intent(MainActivity.this, SignUpPage.class);
                    startActivity(i);
                }
            }
        });

        final int[] isLoginCredentialTrue = new int[1];
        loginBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(isOnline()==false){
                    Toast.makeText(MainActivity.this, "Check your Internet Connection!", Toast.LENGTH_LONG).show();
                }
                else {
                    SignIn signin = new SignIn(usernameET, passwordET);
                    try {
                        isCredentialsTrue = signin.execute().get();
                        Log.e("islogincred true : ", Boolean.toString(isCredentialsTrue));
                        if (Boolean.toString(isCredentialsTrue).equals("true")) {
                            Toast.makeText(MainActivity.this, "Booya!", Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(MainActivity.this, HomePage.class);
                            i.putExtra("username", usernameET.getText().toString());
                            i.putExtra("name",signin.get_name());
                            startActivity(i);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "Please enter correct username and password!", Toast.LENGTH_LONG).show();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
