package com.example.teladelogin;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private Button loginButton, googleLoginButton, facebookLoginButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inicializando os componentes de UI
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.login_button);
        googleLoginButton = findViewById(R.id.google_login_button);
        facebookLoginButton = findViewById(R.id.facebook_login_button);

        // Configurando o evento do botão de login tradicional
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performLogin();
            }
        });

        // Configurando o evento do botão de login com Google
        googleLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performGoogleLogin();
            }
        });

        // Configurando o evento do botão de login com Facebook
        facebookLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performFacebookLogin();
            }
        });
    }
        // Método para realizar o login tradicional
        private void performLogin() {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

        // Verificando se os campos estão preenchidos
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(LoginActivity.java, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show();
            } else {
        // Aqui você pode implementar a lógica de autenticação
                Toast.makeText(LoginActivity.java, "Login realizado com sucesso!", Toast.LENGTH_SHORT).show();
            }
        }
        // Método para realizar o login com Google
    private void performGoogleLogin() {
        // Aqui você pode integrar o login com Google
        Toast.makeText(LoginActivity.java, "Login com Google!", Toast.LENGTH_SHORT).show();
    }
        // Método para realizar o login com Facebook
    private void performFacebookLogin() {
        // Aqui você pode integrar o login com Facebook
        Toast.makeText(LoginActivity.java, "Login com Facebook!", Toast.LENGTH_SHORT).show();
    }
}
