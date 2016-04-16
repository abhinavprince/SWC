package com.example.abhinavp.sws_140101001;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class hss extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_content_hss);
        TextView t = (TextView) findViewById(R.id.hss);
        t.setText("The undergraduate programs/courses in HSS are designed to provide an understanding of various perspectives of development issues, through rigorous course works and guided research.\n" +
                "At the BTech level, the courses in English are aimed at exposing students to Literature and Culture, Cognition and Social issues. The courses also help students in developing communication and language skills. The HSS Department is multidisciplinary in its orientation and has expertise in eight disciplines: Economics, English, Linguistics, Philosophy, Psychology, Sociology, History & Archeology and Political Science.\n" +
                "Besides the annual lecture series, which are graced by eminent professors and researchers from well-known universities, a few successful workshops as well as sponsored courses are conducted by the department. A few successful ones are: an International Conference on ‘Climate Change and Water’ (2011), a Workshop on Tone and Intonation 2012, a workshop on “Children and Women’s Rights and Issues”, etc.\n" +
                "\n" +
                "Head of Department: Dr. Arupjyoti Saikia ");
    }
}
