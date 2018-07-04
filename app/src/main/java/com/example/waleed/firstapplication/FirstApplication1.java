package com.example.waleed.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FirstApplication1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_application1);

        String[] names = new String[5];
        LinearLayout ll = (LinearLayout) findViewById(R.id.root);
        names[0] = "Fizza";
        names[1] = "Waleed";
        names[2] = "Waqas";
        names[3] = "Ahmad";
        names[4] = "Omer";

        for(int i=0; i<names.length; i++){
            TextView view = new TextView(this);
            view.setText(names[i]);
            ll.addView(view);
        }

    }
}
