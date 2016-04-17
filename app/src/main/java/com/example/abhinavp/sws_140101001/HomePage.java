package com.example.abhinavp.sws_140101001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class HomePage extends Activity{

    private String USERNAME, NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        Intent intent = getIntent();
        USERNAME = intent.getExtras().getString("username");
        NAME = intent.getExtras().getString("name");

        TextView homepagetv = (TextView) findViewById(R.id.homepage_tv);
        homepagetv.setText("Hello " + NAME);

        Button announcements_btn = (Button) findViewById(R.id.announcements_btn);
        Button documents_req_btn = (Button) findViewById((R.id.documents_required_btn));
        Button about_branches_btn = (Button) findViewById(R.id.about_branches_btn);



        announcements_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this,Announcements.class);
                startActivity(i);
            }
        });

        documents_req_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this,DocumentsRequired.class);
                startActivity(i);
            }
        });

        about_branches_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this,AboutBranches.class);
                startActivity(i);
            }
        });
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
