package com.example.abhinavp.sws_140101001;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class AboutBranches extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_branches);
        Button buttons[] = new Button[10];
        buttons[0] = (Button) findViewById(R.id.ce_btn);
        buttons[1] = (Button) findViewById(R.id.cse_btn);
        buttons[2] = (Button) findViewById(R.id.cst_btn);
        buttons[3] = (Button) findViewById(R.id.maths_btn);
        buttons[4] = (Button) findViewById(R.id.dod_btn);
        buttons[5] = (Button) findViewById(R.id.cl_btn);
        buttons[6] = (Button) findViewById(R.id.eee_btn);
        buttons[7] = (Button) findViewById(R.id.phy_btn);
        buttons[8] = (Button) findViewById(R.id.me_btn);
        buttons[9] = (Button) findViewById(R.id.hss_btn);


        buttons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), chemical.class);
                startActivity(i);
                Dialog d = new Dialog(AboutBranches.this);
                d.setContentView(R.layout.common_content);
                d.show();
            }
        });
        buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutBranches.this,cse.class);
                startActivity(i);
            }
        });
        buttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutBranches.this,cst.class);
                startActivity(i);
            }
        });
        buttons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutBranches.this,maths.class);
                startActivity(i);
            }
        });
        buttons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutBranches.this,cl.class);
                startActivity(i);
            }
        });
        buttons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutBranches.this,dod.class);
                startActivity(i);
            }
        });
        buttons[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutBranches.this,eee.class);
                startActivity(i);
            }
        });
        buttons[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutBranches.this,phy.class);
                startActivity(i);
            }
        });
        buttons[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutBranches.this,me.class);
                startActivity(i);
            }
        });
        buttons[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutBranches.this,hss.class);
                startActivity(i);
            }
        });

    }
}
