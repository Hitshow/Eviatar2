package com.example.a.eviatar2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eviatar2 extends AppCompatActivity {
Button btn;
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eviatar2);
        btn=(Button) findViewById(R.id.btn);
    }

    public void sofer(View view) {
        i++;
        btn.setText("this is click number"+i);
    }
}
