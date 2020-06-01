package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class WelcomeBack extends AppCompatActivity {

    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back);

        TextView forgotPassword = findViewById(R.id.forgot_password);
        Button postLogin = findViewById(R.id.btn_login);
        username = findViewById(R.id.edt_username);
        password = findViewById(R.id.edt_password);

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeBack.this, ForgotPassword.class);
                startActivity(intent);
            }
        });

        postLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(username.getText().toString().trim()) && TextUtils.isEmpty(password.getText().toString().trim())) {
                    Toast.makeText(WelcomeBack.this, "Email dan Password tidak boleh kosong !", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(password.getText().toString().trim())) {
                    Toast.makeText(WelcomeBack.this, "Password tidak boleh kosong !", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(username.getText().toString().trim())) {
                    Toast.makeText(WelcomeBack.this, "Email tidak boleh kosong !", Toast.LENGTH_SHORT).show();
                } else if (!isValidEmail(username.getText().toString().trim())) {
                    Toast.makeText(WelcomeBack.this, "Email tidak valid !", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(WelcomeBack.this, SuccessActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    public static boolean isValidEmail(CharSequence email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
