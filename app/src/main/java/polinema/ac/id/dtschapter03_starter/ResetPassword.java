package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    private EditText resetCode, password, confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        Button changePassword = findViewById(R.id.btn_change_password);
        resetCode = findViewById(R.id.edt_reset_code);
        password = findViewById(R.id.edt_new_password);
        confirmPassword = findViewById(R.id.edt_confirm_password);

        changePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(resetCode.getText().toString().trim()) && TextUtils.isEmpty(password.getText().toString().trim()) && TextUtils.isEmpty(confirmPassword.getText().toString().trim())) {
                    Toast.makeText(ResetPassword.this, "Lengkapi semua data !", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(resetCode.getText().toString().trim())) {
                    Toast.makeText(ResetPassword.this, "Reset Code tidak boleh kosong !", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(password.getText().toString().trim())) {
                    Toast.makeText(ResetPassword.this, "Password tidak boleh kosong !", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(confirmPassword.getText().toString().trim())) {
                    Toast.makeText(ResetPassword.this, "Confirm Password tidak boleh kosong !", Toast.LENGTH_SHORT).show();
                } else if (!password.getText().toString().equals(confirmPassword.getText().toString())) {
                    Toast.makeText(ResetPassword.this, "Password tidak boleh berbeda !", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(ResetPassword.this, SuccessActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
