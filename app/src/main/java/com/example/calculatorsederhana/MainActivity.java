package com.example.calculatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etAngka1;
    EditText etAngka2;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAngka1 = findViewById(R.id.angka1);
        etAngka2 = findViewById(R.id.angka2);
        tvHasil = findViewById(R.id.tvhasil);
    }

    public void btntambah(View view) {
        String inputan1 = etAngka1.getText().toString();
        String inputan2 = etAngka2.getText().toString();

        if (inputan1.isEmpty() || inputan2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Inputan gak boleh kosong...",
                    Toast.LENGTH_LONG).show();
        } else {
            double hasil = Double.parseDouble(inputan1) + Double.parseDouble(inputan2);
            tvHasil.setText(String.valueOf(hasil));
        }
        hideKeyboard(MainActivity.this);
    }

    public void btnkurang(View view) {
        String inputan1 = etAngka1.getText().toString();
        String inputan2 = etAngka2.getText().toString();

        if (inputan1.isEmpty() || inputan2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Inputan gak boleh kosong...",
                    Toast.LENGTH_LONG).show();
        } else {
            double hasil = Double.parseDouble(inputan1) - Double.parseDouble(inputan2);
            tvHasil.setText(String.valueOf(hasil));
        }
        hideKeyboard(MainActivity.this);
    }

    public void btnbagi(View view) {
        String inputan1 = etAngka1.getText().toString();
        String inputan2 = etAngka2.getText().toString();

        if (inputan1.isEmpty() || inputan2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Inputan gak boleh kosong...",
                    Toast.LENGTH_LONG).show();
        } else {
            double hasil = Double.parseDouble(inputan1) / Double.parseDouble(inputan2);
            tvHasil.setText(String.valueOf(hasil));
        }
        hideKeyboard(MainActivity.this);
    }

    public void btnkali(View view) {
        String inputan1 = etAngka1.getText().toString();
        String inputan2 = etAngka2.getText().toString();

        if (inputan1.isEmpty() || inputan2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Inputan gak boleh kosong...",
                    Toast.LENGTH_LONG).show();
        } else {
            double hasil = Double.parseDouble(inputan1) * Double.parseDouble(inputan2);
            tvHasil.setText(String.valueOf(hasil));
        }

        hideKeyboard(MainActivity.this);
    }

    public static void hideKeyboard(Activity activity)
    {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void tombolreset(View view) {
        tvHasil.setText("0");
    }
}
