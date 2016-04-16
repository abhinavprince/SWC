package com.example.abhinavp.sws_140101001;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class cst extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_content_cst);
        TextView t = (TextView) findViewById(R.id.cst);
        t.setText("Department of Chemistry, is one of the globally recognized, emerging and leading department in science and technology with a growing list of accolades earned nationally and internationally. The Department started in 1995, covers all the major areas of Chemistry.\n" +
                "The UG programme prepares the students for the emerging need of qualified persons with adequate knowledge in both Chemistry and its technology related issues, in both academics and industry. It also provides students practical training in basic science and engineering.During the course, the students will be trained to do frontline research in interdisciplinary areas, which include materials science, environmental science and molecular biology.\n" +
                "CheSTA (Chemical Science & Technology Association) is an organization of students of B.Tech Chemical Science and Technology, established to look after various departmental activities of chemistry department and providing a forum of interaction among all the people of the department. Not only the students but the faculty also a form a important part of it to guide the students which is one of the primary cause of CheSTA being an active organization since its establishment. The students also find a common platform to communicate and discuss on common and individual problems encountered in academics etc.\n" +
                "\n" +
                "Head of Department: Prof. Bhisma Kumar Patel");
    }
}
