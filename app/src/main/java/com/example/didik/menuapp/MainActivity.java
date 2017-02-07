// Created by: Didik Setiawan - 201422102
// Universitas Surakarta

package com.example.didik.menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox Seratus, DuaRatus, TigaRatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Terbilang();
    }

    public void Terbilang() {
        Seratus = (CheckBox)findViewById(R.id.checkBox2);
        DuaRatus = (CheckBox)findViewById(R.id.checkBox2);
        TigaRatus = (CheckBox)findViewById(R.id.checkBox3);

        Seratus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Terbilang: Seratus",Toast.LENGTH_LONG).show();
            }
        });

        DuaRatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Terbilang: Dua Ratus",Toast.LENGTH_LONG).show();
            }
        });

        TigaRatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                StringBuilder nilai = new StringBuilder();
//                nilai.append("Terbilang: Tiga Ratus");
                Toast.makeText(getApplicationContext(),"Terbilang: Tiga Ratus",Toast.LENGTH_LONG).show();
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
                Toast.makeText(getApplicationContext(), "Anda sudah berada di Activity yang sama", Toast.LENGTH_LONG).show();
                return true;
            case R.id.secondactivity:
                Intent intent1 = new Intent(this, SecondActivity.class);
                startActivity(intent1);
                return true;
            case R.id.thirdactivity:
                Intent intent2 = new Intent(this, ThirdActivity.class);
                startActivity(intent2);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
