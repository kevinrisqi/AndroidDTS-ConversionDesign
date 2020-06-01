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

public class ForgotPassword extends AppCompatActivity {

    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        Button sendRequest = findViewById(R.id.btn_send);
        username = findViewById(R.id.edt_username);


        sendRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(username.getText().toString().trim())) {
                    Toast.makeText(ForgotPassword.this, "Email tidak boleh kosong !", Toast.LENGTH_SHORT).show();
                } else if (!isValidEmail(username.getText().toString().trim())) {
                    Toast.makeText(ForgotPassword.this, "Email tidak valid !", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(ForgotPassword.this, ResetPassword.class);
                    startActivity(intent);
                }
            }
        });
    }

    public static boolean isValidEmail(CharSequence email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
