package com.cbalt.desafiopassword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PasswordCallback {

    private TextView passwordTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText passwordEt = findViewById(R.id.passwordEt);
        passwordTv = findViewById(R.id.passTv);
        Button button = findViewById(R.id.submitBtn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = passwordEt.getText().toString();
                new PasswordValidator(MainActivity.this).validatePassword(password);

            }
        });

    }

    @Override
    public void inputBlank() {
        passwordTv.setText("Debe ingresar una contraseña");
    }

    @Override
    public void insuficientCharacters() {
        passwordTv.setText("Su contraseña debe tener al menos 8 caracteres");
    }

    @Override
    public void success() {
        passwordTv.setText("Su contraseña ha sido cambiada con éxito");
    }
}
