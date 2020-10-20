package id.ac.id.telkomuniversity.tass.praktikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_kedua extends AppCompatActivity {
    TextView username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);


        Bundle b = getIntent().getExtras();
        username = findViewById(R.id.uname);
        password = findViewById(R.id.pass);

        username.setText(b.getCharSequence("Uname"));
        password.setText(b.getCharSequence("Password"));

    }
}