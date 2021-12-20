package co.usa.ciclo4.reto1v2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {

    private TextView tvTitulo;
    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

    tvTitulo = (TextView) findViewById(R.id.tvTitulo);
    Intent intent = getIntent();
    name = intent.getStringExtra("name");


    tvTitulo.setText(name);
    }
}