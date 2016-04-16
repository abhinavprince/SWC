package com.example.abhinavp.sws_140101001;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class cl extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_content_cl);

        TextView t = (TextView) findViewById(R.id.cl);
        t.setText("Civil Engineering is considered to be the most versatile branch among all the engineering branches. Department of Civil Engineering at IIT Guwahati was established in 1997 and has continually upgraded itself in terms of academic programs and research infrastructure including state-of-the-art laboratories.\n" +
                "IIT Guwahati is also actively involved in the outreach and training activities undertaken by different Government and Non-Government organizations (NDMA, MHA, NPEEE, UNDP, etc).\n" +
                "Association of Civil Engineers (popularly known as ACE) is a voluntary body of students and faculty of Department of Civil Engineering at IIT Guwahati. ACE is providing practical exposure to its members through its various regular activities like lectures on technical writing, symposium, lecture series by distinguished practitioners of the trade, talks on ongoing research practices and developments around the world in the field of Civil Engineering and many other related topics. The association is also involved in publications with its annual magazine - 'EDIFICE', with an informal newsletter, a technical research letter and a section highlighting the latest civil engineering innovations.\n" +
                "\n" +
                "Head of Department: Prof.Subashisa Dutta");
    }
}
