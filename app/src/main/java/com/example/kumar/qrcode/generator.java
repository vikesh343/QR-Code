package com.example.kumar.qrcode;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class generator extends AppCompatActivity {

    TextView qrgen1;
    EditText qrgen;
    Button generate;
    ImageView imageview;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generator);

        qrgen=(EditText)findViewById(R.id.qrgen);
        qrgen1=(TextView)findViewById(R.id.qrgen1);
        generate=(Button)findViewById(R.id.generate);
        imageview=(ImageView)findViewById(R.id.imageview);


        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text=qrgen.getText().toString().trim();
                MultiFormatWriter mf=new MultiFormatWriter();

                try{
                    BitMatrix bitMatrix=mf.encode(text, BarcodeFormat.QR_CODE,200,200);
                    BarcodeEncoder barcodeEncoder=new BarcodeEncoder();
                    Bitmap bitmap= barcodeEncoder.createBitmap(bitMatrix);
                    imageview.setImageBitmap(bitmap);
                } catch (WriterException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
