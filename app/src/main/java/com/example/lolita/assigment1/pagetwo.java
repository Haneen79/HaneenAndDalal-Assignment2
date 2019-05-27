package com.example.lolita.assigment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class pagetwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagetwo);

        TextView t1 =findViewById(R.id.textView2);
        TextView t2 =findViewById(R.id.textView3);
        TextView t3 =findViewById(R.id.textView7);

        Bundle bundle =getIntent().getExtras();
        String first =bundle.getString("first");
        String last =bundle.getString("last");
        String Date =bundle.getString("Date");


        t1.setText(first);
        t2.setText(last);
        t3.setText(Date);

    }
}
