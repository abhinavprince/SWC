package com.example.abhinavp.sws_140101001;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class eee extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_content_eee);
        TextView t = (TextView) findViewById(R.id.eee);
        t.setText("Since its inception in 1995, the department now has over 700 students and 38 faculty members, supported by 17 laboratories. Besides the core courses, the faculties also offer projects, both course and self-interest ones, which not only turn theory into practise, but also turn enthusiasm into achievement.\n" +
                "The department has previously hosted successful workshops on: Medical Image and Signal Processing, Optoelectronics and Optical Communication, Xilinx FPGA Architecture, Speaker verification, etc.\n" +
                "The department has an active student body called CEPSTRUM (, which, with its yearlong activities keeps the EEE community a close knitted one It plays a pivotal role in enhancing the soft-skills, helping students identify their interests and achieve their goals. This student body is responsible for organizing interactive lectures, talks, workshops on topics which are necessary for surviving the core courses. An annual e-magazine In-Phase aims to achieve the vision of Cepstrum of bringing students in phase with the latest developments in the field of electronics and other related areas.\n" +
                "Recently, the Institute of Electrical and Electronics Engineers, Inc. (IEEE) witnessed its onset into IIT Guwahati. It not only stays abreast with the happenings in the IEEE community worldwide, but also organizes yearly lecture series, conferences and workshops on technical issues.\n" +
                "\n" +
                "Head of Department: Prof. Chitralekha Mahanta");
    }
}
