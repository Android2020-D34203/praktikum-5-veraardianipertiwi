package id.ac.id.telkomuniversity.tass.praktikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button login, lupa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login  = findViewById(R.id.login);
        lupa = findViewById(R.id.lupa);
        username = findViewById(R.id.uname);
        password = findViewById(R.id.pass);
    }
    public void login (View v){
        Intent intent = new Intent(MainActivity.this, activity_kedua.class);
        Bundle b = new Bundle();

        b.putString("Uname", username.getText().toString());
        b.putString("Password", password.getText().toString());

        intent.putExtras(b);
        startActivity(intent);

    }
    public void ResetPassword(View v){
        Intent intent = new Intent(MainActivity.this, activity_ketiga.class);
        Bundle b = new Bundle();

        b.putString("Uname", username.getText().toString());
        b.putString("Password", password.getText().toString());

        intent.putExtras(b);
        startActivity(intent);
    }
}