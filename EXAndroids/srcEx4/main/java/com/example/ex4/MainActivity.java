package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText edtNumero1, edtNumero2;
    TextView txtResultado;
    Button btnCalcularPrimos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero1 = findViewById(R.id.edtNumero1);
        edtNumero2 = findViewById(R.id.edtNumero2);
        txtResultado = findViewById(R.id.txtResultado);
        btnCalcularPrimos = findViewById(R.id.btnCalcularPrimos);

        btnCalcularPrimos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int num1 = Integer.parseInt(edtNumero1.getText().toString());
                    int num2 = Integer.parseInt(edtNumero2.getText().toString());

                    int menor = Math.min(num1, num2);
                    int maior = Math.max(num1, num2);

                    if (menor < 0 || maior > 50) {
                        txtResultado.setText(R.string.erro_validacao);
                        edtNumero1.setText("");
                        edtNumero2.setText("");
                        return;
                    }

                    String primos = NumeroUtils.encontrarPrimosNoIntervalo(menor, maior);
                    txtResultado.setText(getString(R.string.resultado) + ": " + primos);

                } catch (Exception e) {
                    txtResultado.setText(R.string.erro);
                }
            }
        });
    }
}