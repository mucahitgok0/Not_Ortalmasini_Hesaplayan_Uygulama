package com.mucahit.notortalamasnhesaplayanuygulama;

import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        resultText=findViewById(R.id.textView);
    }
    public void hesapla(View view) {
        int puan1 = Integer.parseInt(editText1.getText().toString());
        int puan2 = Integer.parseInt(editText2.getText().toString());
        double sonuc=((puan1*0.4)+(puan2*0.6));
        if(sonuc>=90&&sonuc<=100)
            resultText.setText("Ders başarı puanınız:"+sonuc+"\nAA harf notu ile dersi geçtiniz");
        if(sonuc>=85&&sonuc<=89)
            resultText.setText("Ders başarı puanınız:"+sonuc+"\nBA harf notu ile dersi geçtiniz");
        if(sonuc>=80&&sonuc<=84)
            resultText.setText("Ders başarı puanınız:"+sonuc+"\nBB harf notu ile dersi geçtiniz");
        if(sonuc>=75&&sonuc<79)
            resultText.setText("Ders başarı puanınız:"+sonuc+"\nCB harf notu ile dersi geçtiniz");
        if(sonuc>=65&&sonuc<74)
            resultText.setText("Ders başarı puanınız:"+sonuc+"\nCC harf notu ile dersi geçtiniz");
        if(sonuc>=60&&sonuc<64)
            resultText.setText("Ders başarı puanınız:"+sonuc+"\nDC harf notu ile dersi geçtiniz");
        if(sonuc>=55&&sonuc<59)
            resultText.setText("Ders başarı puanınız:"+sonuc+"\nDD harf notu ile dersi geçtiniz");
        if(sonuc>=50&&sonuc<54)
            resultText.setText("Ders başarı puanınız:"+sonuc+"\nFD harf notu ile dersi geçtiniz");
        if(sonuc>=0&&sonuc<=49)
            resultText.setText("Ders başarı puanınız:"+sonuc+"\nFF harf notu ile dersten kaldınız");

    }
}