package com.example.didik.mycheckboxapp;

//Didik Setiawan - 201422102
//Surakarta University

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox GadoGado, Bakso, MieAyam, EsTeh;
    Button Jumlah;
    TextView Notif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JumlahMenuMakanan();
    }

    public void JumlahMenuMakanan()
    {
        GadoGado = (CheckBox)findViewById(R.id.gadogado);
        Bakso = (CheckBox)findViewById(R.id.bakso);
        MieAyam = (CheckBox)findViewById(R.id.mieayam);
        EsTeh = (CheckBox)findViewById(R.id.esteh);
        Jumlah = (Button)findViewById(R.id.totalharga);
        Notif = (TextView)findViewById(R.id.notif);

        GadoGado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder harga = new StringBuilder();

                harga.append("Gado-gado Rp 8000");

                Toast.makeText(getApplicationContext(),harga.toString(),Toast.LENGTH_LONG).show();
            }
        });

        Bakso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder harga = new StringBuilder();

                harga.append("Bakso Rp 10000");

                Toast.makeText(getApplicationContext(),harga.toString(),Toast.LENGTH_LONG).show();
            }
        });

        MieAyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder harga = new StringBuilder();

                harga.append("Mie Ayam Rp 15000");

                Toast.makeText(getApplicationContext(),harga.toString(),Toast.LENGTH_LONG).show();
            }
        });

        EsTeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder harga = new StringBuilder();

                harga.append("Es Teh 4500");

                Toast.makeText(getApplicationContext(),harga.toString(),Toast.LENGTH_LONG).show();
            }
        });

        Jumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalpembelian = 0;

                StringBuilder hasil = new StringBuilder();

                hasil.append("Menu Pilihan:");

                if(GadoGado.isChecked()){
                    hasil.append("\nGado-Gado Rp 8000");
                    totalpembelian += 8000;
                }

                if(Bakso.isChecked()){
                    hasil.append("\nBakso Rp 10000");
                    totalpembelian += 10000;
                }

                if(MieAyam.isChecked()){
                    hasil.append("\nMie Ayam Rp 15000");
                    totalpembelian += 15000;
                }

                if(EsTeh.isChecked()){
                    hasil.append("\nEs Teh Rp 4500");
                    totalpembelian += 4500;
                }

                hasil.append("\nTotal Pembelian: Rp").append(totalpembelian);

                Notif.setText(hasil);
            }
        });
    }
}