package id.ac.id.telkomuniversity.tass.praktikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_ketiga extends AppCompatActivity {
    EditText username, password;
    Button lupa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketiga);

        username = findViewById(R.id.uname);
        password = findViewById(R.id.passlama);
        lupa = findViewById(R.id.reset);

        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity_ketiga.this, "Password "+ username.getText() + " Berhasil Diubah!", Toast.LENGTH_LONG).show();
            }
        });
    }
}