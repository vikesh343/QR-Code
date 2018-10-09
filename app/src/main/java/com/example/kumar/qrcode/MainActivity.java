package com.example.kumar.qrcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView QR,power;
    Button gen,scan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QR=(TextView)findViewById(R.id.QR);
        power=(TextView)findViewById(R.id.power);
        gen=(Button)findViewById(R.id.gen);
        scan=(Button)findViewById(R.id.scan);

        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),generator.class);
                startActivity(i);

            }
        });
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplicationContext(),scanner.class);
                startActivity(j);
            }
        });
    }
}
