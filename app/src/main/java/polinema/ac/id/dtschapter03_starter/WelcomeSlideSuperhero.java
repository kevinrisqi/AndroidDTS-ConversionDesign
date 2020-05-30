package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeSlideSuperhero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_superhero);

        TextView login = findViewById(R.id.login_text);
        Button getStarted = findViewById(R.id.btn_get_started);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeSlideSuperhero.this, WelcomeBack.class);
                startActivity(intent);
            }
        });

        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeSlideSuperhero.this, WelcomeSlideAssign.class);
                startActivity(intent);
            }
        });
    }
}
