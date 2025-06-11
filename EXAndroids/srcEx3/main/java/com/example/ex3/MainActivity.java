package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText edtNumero1, edtNumero2;
    TextView txtMaior, txtSomaImpares;
    Button btnMaior, btnSomarImpares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero1 = findViewById(R.id.edtNumero1);
        edtNumero2 = findViewById(R.id.edtNumero2);
        txtMaior = findViewById(R.id.txtMaior);
        txtSomaImpares = findViewById(R.id.txtSomaImpares);
        btnMaior = findViewById(R.id.btnMaior);
        btnSomarImpares = findViewById(R.id.btnSomarImpares);

        btnMaior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int n1 = Integer.parseInt(edtNumero1.getText().toString());
                    int n2 = Integer.parseInt(edtNumero2.getText().toString());
                    int maior = Operacoes.maior(n1, n2);
                    txtMaior.setText(getString(R.string.maior_resultado) + ": " + maior);
                } catch (Exception e) {
                    txtMaior.setText(R.string.erro);
                }
            }
        });

        btnSomarImpares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int n1 = Integer.parseInt(edtNumero1.getText().toString());
                    int n2 = Integer.parseInt(edtNumero2.getText().toString());
                    int soma = Operacoes.somarImpares(n1, n2);
                    txtSomaImpares.setText(getString(R.string.soma_resultado) + ": " + soma);
                } catch (Exception e) {
                    txtSomaImpares.setText(R.string.erro);
                }
            }
        });
    }
}