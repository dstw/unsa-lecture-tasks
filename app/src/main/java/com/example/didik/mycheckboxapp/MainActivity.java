package com.example.didik.mycheckboxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox GadoGado, Bakso, MieAyam, EsTeh;
    Button Jumlah;

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

        Jumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalpembelian = 0;

                StringBuilder hasil = new StringBuilder();

                hasil.append("Menu Pilihan:");

                if(GadoGado.isChecked()){
                    hasil.append("\nGado-Gado Rp 8.000");
                    totalpembelian += 8000;
                }

                if(Bakso.isChecked()){
                    hasil.append("\nBakso Rp 10.000");
                    totalpembelian += 10000;
                }

                if(MieAyam.isChecked()){
                    hasil.append("\nMie Ayam Rp 15.000");
                    totalpembelian += 15000;
                }

                if(EsTeh.isChecked()){
                    hasil.append("\nEs Teh Rp 4.500");
                    totalpembelian += 4500;
                }

                hasil.append("\nTotal Pembelian: Rp").append(totalpembelian);

                Toast.makeText(getApplicationContext(),hasil.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
