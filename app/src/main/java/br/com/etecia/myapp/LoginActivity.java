package br.com.etecia.myapp;

import static br.com.etecia.myapp.R.id.TextEmail;
import static br.com.etecia.myapp.R.id.TextSenha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    MaterialButton btorecuperar, btocadastro, btoentrar;
    TextInputEditText TxtEmail, TxtSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //apresentando a variavel java para o xml
        btocadastro = findViewById(R.id.btocadastro);
        btorecuperar = findViewById(R.id.btorecuperar);
        btoentrar = findViewById(R.id.btoentrar);
        TxtEmail = findViewById(R.id.TextEmail);
        TxtSenha = findViewById(R.id.TextSenha);

        //criando ações para os botões

        btoentrar.setOnClickListener(this::onClick);

        btocadastro.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), CadastrarActivity.class));
            finish();

        });

        btorecuperar.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), Recuperado_activity.class));
            finish();
        });
    }

        private void onClick(View v) {
        String email, senha;

        email = TxtEmail.getText().toString().trim();
        senha = TxtSenha.getText().toString().trim();

        if (email.equals("etecia") && senha.equals("etecia")) {
            startActivity(new Intent(getApplicationContext(), MenuActivity.class));
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Usuário ou Senha Inválidos",
                    Toast.LENGTH_LONG).show();
        }
    }
}