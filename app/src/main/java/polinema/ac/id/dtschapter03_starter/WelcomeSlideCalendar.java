package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeSlideCalendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_calendar);

//        getSupportActionBar().hide();

        Button getStarted = findViewById(R.id.btn_get_started);
        TextView login = findViewById(R.id.login_text);
        TextView contactUs = findViewById(R.id.contact_us);

        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeSlideCalendar.this, WelcomeSlideSuperhero.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeSlideCalendar.this, WelcomeBack.class);
                startActivity(intent);
            }
        });

        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"kevinrisqi22@gmail.com","lidyawijayanti26@gmail.com"});
                intent.putExtra(Intent.EXTRA_CC, new String[]{"kevinrisqi22@gmail.com"});
                intent.putExtra(Intent.EXTRA_BCC, new String[]{"lidyawijayanti26@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Email Test");
                intent.putExtra(Intent.EXTRA_TEXT, "Welcome to DTS 2019");
                startActivity(intent.createChooser(intent, "Pilih Email Client"));
            }
        });
    }


}
