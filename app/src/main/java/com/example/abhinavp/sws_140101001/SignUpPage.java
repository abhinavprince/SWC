package com.example.abhinavp.sws_140101001;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by AbhinavP on 4/17/2016.
 */
public class SignUpPage extends Activity{

    private String name, email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.signup_page);
        final EditText nameET = (EditText) findViewById(R.id.username_edit_text);
        final EditText emailET = (EditText) findViewById(R.id.email_edit_text);
        final EditText passwordET = (EditText) findViewById(R.id.password_edit_text);
        Button signup_btn = (Button) findViewById(R.id.signup_button);

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameET.getText().toString();
                email = emailET.getText().toString();
                password = passwordET.getText().toString();

                Signup signup = new Signup(name,email,password,getApplicationContext());
                signup.execute();
            }
        });
    }
}
