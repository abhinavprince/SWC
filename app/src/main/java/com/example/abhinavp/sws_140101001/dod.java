package com.example.abhinavp.sws_140101001;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class dod extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_content_dod);
        TextView t = (TextView) findViewById(R.id.dod);
        t.setText("The Department of Design (DoD), was set up with a vision to enkindle some of the brightest technical minds of the country a passion for innovation in technology driven by a firm understanding, appreciation and celebration of design.\n" +
                "The focus of the program is on the study, invention, and creative use of technologies to create effective, usable, enjoyable experiences with technology through interdisciplinary research in engineering, design, behavioral and social sciences, and to understand the impact of technology on individuals, groups, and organizations.\n" +
                "Due to the multidisciplinary nature of the program, there are hardly any domains in the Industry to which the students at the Department of Design haven't been exposed to. This is evident from the diverse job profiles held by the Alumni of DoD over the past years covering a whole spectrum of specializations.\n" +
                "The department has conducted various workshops and taken other initiatives to address the requirements of industry, notable among them being Rich Interactive Narrative (RIN) workshop by Microsoft Research, Toolbox, Video Workshop, Robotics, Space Design etc.\n" +
                "\n" +
                "Head of Department: Prof. Utpal Barua");
    }
}
