package com.example.user.yellowridesafety;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ParentViewQr extends AppCompatActivity {
   EditText pt,pd,pa,dt,da;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_view_qr);

        pt= (EditText) findViewById(R.id.ptime);
        pd= (EditText) findViewById(R.id.pdate);
        pa= (EditText) findViewById(R.id.paddress);
        dt= (EditText) findViewById(R.id.dtime);
        da= (EditText) findViewById(R.id.daddress);

    }
}
