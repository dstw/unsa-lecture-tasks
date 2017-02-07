// Created by: Didik Setiawan - 201422102
// Universitas Surakarta

package com.example.didik.menuapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//import static android.R.attr.duration;

public class ThirdActivity extends AppCompatActivity {

    Button Popup1, Popup2, Popup3;
//    private char stringId;
//    private View viewId;
//    Snackbar mySnackbar = Snackbar.make(viewId, stringId, duration);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Tampil();
    }

    public void Tampil() {
        Popup1 = (Button)findViewById(R.id.button1);
        Popup2 = (Button)findViewById(R.id.button2);
        Popup3 = (Button)findViewById(R.id.button3);

        Popup1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Snackbar.make(findViewById(R.id.myCoordinatorLayout), R.string.pesan,
                Snackbar.LENGTH_SHORT).show();
            }
        });

        Popup2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(ThirdActivity.this).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("Ini adalah sebuah alert dialog!");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

        Popup3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                StringBuilder pesantoast = new StringBuilder();
                pesantoast.append("Ini adalah sebuah pesan toast");
                Toast.makeText(getApplicationContext(),pesantoast.toString(),Toast.LENGTH_LONG).show();
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
                Intent intent2 = new Intent(this, SecondActivity.class);
                startActivity(intent2);
                return true;
            case R.id.thirdactivity:
                Toast.makeText(getApplicationContext(), "Anda sudah berada di Activity yang sama", Toast.LENGTH_LONG).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}