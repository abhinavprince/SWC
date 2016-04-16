package com.example.abhinavp.sws_140101001;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class me extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_content_me);

        TextView t = (TextView) findViewById(R.id.me);
        t.setText("The department of mechanical engineering, being one of the largest and oldest departments of the institute. Academic coursework and projects are designed to endow students with the ability to apply knowledge of science, mathematics, and engineering, and the capability to work effectively in multidisciplinary teams, providing leadership and technical expertise.\n" +
                "MESA, Mechanical Engineering Students' Association was founded in 2001.The objectives of the association are: to focus on the cutting edge technology and present it to the students in an interesting manner by means of lectures/talk, articles and workshops, to bridge the gap between theoretical and practical/field knowledge, providing students of the department with relevant knowledge of other fields, given the interdisciplinary nature of ME, interacting with other technical societies, within and outside the institute to promote flow of knowledge and interest etc.\n" +
                "\n" +
                "Head of Department: Prof. Anoop K. Dass");
    }
}
