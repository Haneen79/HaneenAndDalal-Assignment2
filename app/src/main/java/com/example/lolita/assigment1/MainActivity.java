package com.example.lolita.assigment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText e1 = findViewById(R.id.editText);
                EditText e2 = findViewById(R.id.editText2);
                EditText e3 = findViewById(R.id.editText3);

                Intent i = new Intent(MainActivity.this,pagetwo.class);
                Bundle b = new Bundle();
                b.putString("first",e1.getText().toString());
                b.putString("last" ,e2.getText().toString());
                b.putString("Date ",e3.getText().toString());
                i.putExtras(b);
                startActivity(i);

            }
        });

    }
}
