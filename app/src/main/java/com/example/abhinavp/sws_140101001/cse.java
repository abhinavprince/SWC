package com.example.abhinavp.sws_140101001;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class cse extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_content_cse);
        TextView t = (TextView) findViewById(R.id.cse);
        t.setText("The Department of Computer Science and Engineering at the Indian Institute of Technology Guwahati was formed in the year 1995 and provides an outstanding research environment complemented by excellence in teaching.\n" +
                "Various student organizations like Association for Computing Machinery (ACM) Chapter, ACS Chapter, Computer Science and Engineering Association (CSEA), Google Developer Group (GDG) Linux and Open Solaris Community are active throughout the year.\n" +
                "Computer Science and Engineering Association (CSEA) is a very active student body which conducts lectures and workshops on trending topics in Computer Science and Information Technology. It organizes activities like Competitive Programming Contest, lecture series by distinguished practitioners from the industry, etc. The association is also involved in publications with its annual magazine - 'Linked List’ which provides concise information about the upcoming technologies which are likely to have a strong impact on the future of the industry, alumni interviews and the various activities going on in the department.\n" +
                "\n" +
                "Head of Department: Prof. Diganta Goswami");
    }
}
