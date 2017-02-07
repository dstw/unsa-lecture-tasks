// Created by: Didik Setiawan - 201422102
// Universitas Surakarta

package com.example.didik.menuapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText Edit1, Edit2;
    Button Tambah, Kurang, Kali, Bagi;
    TextView Hasil;
    Double nilai1, nilai2, hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Hitung();
    }

    public void Hitung(){
        Edit1 = (EditText)findViewById(R.id.editText1);
        Edit2 = (EditText)findViewById(R.id.editText2);
        Tambah = (Button)findViewById(R.id.btnPlus);
        Kurang = (Button)findViewById(R.id.btnMin);
        Kali = (Button)findViewById(R.id.btnMultiply);
        Bagi = (Button)findViewById(R.id.btnDivide);
        Hasil = (TextView)findViewById(R.id.hasil);

        Tambah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nilai1 = Double.parseDouble(Edit1.getText().toString());
                nilai2 = Double.parseDouble(Edit2.getText().toString());
                hitung = nilai1 + nilai2;
                Hasil.setText(Double.toString(hitung));
            }
        });

        Kurang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nilai1 = Double.parseDouble(Edit1.getText().toString());
                nilai2 = Double.parseDouble(Edit2.getText().toString());
                hitung = nilai1 - nilai2;
                Hasil.setText(Double.toString(hitung));
            }
        });

        Kali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nilai1 = Double.parseDouble(Edit1.getText().toString());
                nilai2 = Double.parseDouble(Edit2.getText().toString());
                hitung = nilai1 * nilai2;
                Hasil.setText(Double.toString(hitung));
            }
        });

        Bagi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nilai1 = Double.parseDouble(Edit1.getText().toString());
                nilai2 = Double.parseDouble(Edit2.getText().toString());
                hitung = nilai1 / nilai2;
                Hasil.setText(Double.toString(hitung));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())   {
            case R.id.firstactivity:
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                return true;
            case R.id.secondactivity:
                Toast.makeText(getApplicationContext(), "Anda sudah berada di Activity yang sama", Toast.LENGTH_LONG).show();
                return true;
            case R.id.thirdactivity:
                Intent intent2 = new Intent(this, ThirdActivity.class);
                startActivity(intent2);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}