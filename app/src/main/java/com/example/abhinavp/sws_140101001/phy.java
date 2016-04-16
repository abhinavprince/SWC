package com.example.abhinavp.sws_140101001;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by AbhinavP on 4/16/2016.
 */
public class phy extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_content_phy);
        TextView t = (TextView) findViewById(R.id.phy);
        t.setText("The Department of Physics at the Indian Institute of Technology Guwahati, was formed in 1995. The Department has highly active and vibrant faculty members committed to impart high quality research standards in pure and applied areas of physics and also trains students to become competent and motivated physicists. The research interests of the faculty members cover broad range of physics: Condensed Matter Physics, Lasers and Photonics, High Energy, Theoretical, Mathematical Physics and Astrophysics.\n" +
                "The curricula of its Under Graduate programme is a perfect blend of theory and experimentation with research areas focusing on the latest developments in the field of experimental physics. The alumni of the department are working in leading engineering and research organizations specializing in diverse domains of physics like Optics, Photo Electronics, Semiconductor, High-Energy Physics etc. At the same time many graduates of the department have pursued higher studies in leading Universities of the world in Theoretical and Experimental Physics.\n" +
                "\n" +
                "Head of Department: Dr. P Poulose");
    }
}
