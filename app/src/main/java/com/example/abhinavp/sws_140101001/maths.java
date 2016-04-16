package com.example.abhinavp.sws_140101001;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class maths extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_content_maths);
        TextView t = (TextView) findViewById(R.id.maths);
        t.setText("The 4-year programme, B.Tech. in Mathematics and Computing, is a unique programme and the first of its kind in the country. The curriculum for this program is designed to meet the need of sophisticated mathematics in modern scientific investigations and technological innovations. The programme has three components: mathematics, computing and financial engineering. This helps the students of the department to play a multidimensional role in both academia and industry.\n" +
                "The department recently hosted International Conference on Numerical Linear Algebra and its Applications, International Conference on Environmental Fluid Mechanics, International Conference on Geometric Group Theory and numerous other workshops. In addition the Mathematics Seminar Series conducted by the department has attracted speakers from leading national and international organizations.\n" +
                "The department has state-of-art computing facilities and a department library housing various higher texts in the field of higher order mathematics. The institute also hosts the regional chapter of Society for Industrial and Applied Mathematics (SIAM) which is an international organization for ensuring cooperation among mathematical and other scientific and technological communities.\n" +
                "\n" +
                "Head of Department: Prof. Swarup Nandan Bora");
    }
}
