package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Kalkulator extends AppCompatActivity {

    EditText txtAngkapertama, txtAngkakedua;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        txtAngkapertama = (EditText) findViewById(R.id.txtAngkapertama);
        txtAngkakedua = (EditText) findViewById(R.id.txtAngkakedua);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1Text = txtAngkapertama.getText().toString();
                String angka2Text = txtAngkakedua.getText().toString();

                if (angka1Text.isEmpty() || angka2Text.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Silahkan Masukkan Angka Dahulu:)", Toast.LENGTH_SHORT).show();
                }else{
                    int angkaPertama = Integer.parseInt(txtAngkapertama.getText().toString());
                    int angkaKedua = Integer.parseInt(txtAngkakedua.getText().toString());
                    int hasil = angkaPertama + angkaKedua;
                    txtHasil.setText(String.valueOf(hasil));

                    Toast.makeText(getApplicationContext(), "Hasil : "+ hasil, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1Text = txtAngkapertama.getText().toString();
                String angka2Text = txtAngkakedua.getText().toString();

                if (angka1Text.isEmpty() || angka2Text.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Silahkan Masukkan Angka Dahulu:)", Toast.LENGTH_SHORT).show();
                }else{
                    int angkaPertama = Integer.parseInt(txtAngkapertama.getText().toString());
                    int angkaKedua = Integer.parseInt(txtAngkakedua.getText().toString());
                    int hasil = angkaPertama - angkaKedua;
                    txtHasil.setText(String.valueOf(hasil));

                    Toast.makeText(getApplicationContext(), "Hasil : "+ hasil, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1Text = txtAngkapertama.getText().toString();
                String angka2Text = txtAngkakedua.getText().toString();

                if (angka1Text.isEmpty() || angka2Text.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Silahkan Masukkan Angka Dahulu:)", Toast.LENGTH_SHORT).show();
                }else{
                    int angkaPertama = Integer.parseInt(txtAngkapertama.getText().toString());
                    int angkaKedua = Integer.parseInt(txtAngkakedua.getText().toString());
                    int hasil = angkaPertama * angkaKedua;
                    txtHasil.setText(String.valueOf(hasil));

                    Toast.makeText(getApplicationContext(), "Hasil : "+ hasil, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1Text = txtAngkapertama.getText().toString();
                String angka2Text = txtAngkakedua.getText().toString();

                if (angka1Text.isEmpty() || angka2Text.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Silahkan Masukkan Angka Dahulu:)", Toast.LENGTH_SHORT).show();
                }else{
                    Float angkaPertama = Float.parseFloat(txtAngkapertama.getText().toString());
                    Float angkaKedua = Float.parseFloat(txtAngkakedua.getText().toString());
                    Float hasil = angkaPertama / angkaKedua;
                    txtHasil.setText(new DecimalFormat("##.##").format(hasil));

                    Toast.makeText(getApplicationContext(), "Hasil : "+ (new DecimalFormat("##.##").format(hasil)), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}