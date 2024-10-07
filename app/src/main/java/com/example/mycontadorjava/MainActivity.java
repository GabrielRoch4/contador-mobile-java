package com.example.mycontadorjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button btnAumentar;
    private Button btnDiminuir;
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        btnAumentar = findViewById(R.id.activity_main_btn_aumentar);
        btnDiminuir = findViewById(R.id.activity_main_btn_diminuir);

        btnDiminuir.setEnabled(false);

        btnAumentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                textView.setText(String.valueOf(contador));
                btnDiminuir.setEnabled(true);
            }
        });

        btnDiminuir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contador > 0) {
                    contador--;
                    textView.setText(String.valueOf(contador));
                    if (contador == 0) {
                        btnDiminuir.setEnabled(false);
                    }
                }
            }
        });
    }
}