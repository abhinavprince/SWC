package com.example.abhinavp.sws_140101001;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class chemical extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_content);
        TextView t = (TextView) findViewById(R.id.chemical);
        t.setText("Started in 2002, currently the department is has 36 faculty members and 13 staff members, supported by 8 laboratories.\n" +
                "\" +\n" +
                "                \"The Department supports IIChE – SC (Indian Institute of Chemical Engineers –Student Chapter), IIT Guwahati. It provides them with a platform for exchange of information regarding the profession and to encourage discussions and views about the latest technical advancements taking place around the world in the field of Chemical Engineering.\\n\" +\n" +
                "                \"REFLUX, is the annual technical festival of Chemical Engineering Department. The aim of the fest is to bring together academicians, students and industrialists associated with Chemical Engineering. Several events are organized that bring to the students some of the most fascinating and mind-boggling phenomena of Chemical Engineering.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Head of Department: Prof. Bishnupada Mandal");
    }
}
