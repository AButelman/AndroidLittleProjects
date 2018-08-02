package com.example.andres.block09;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tomá el mensaje (que es un editable) y pasalo a String
                String mensaje = editText.getText().toString();

                Uri destino = Uri.parse("smsto:1541992632");

                Intent smsIntent = new Intent(Intent.ACTION_SENDTO, destino);
                smsIntent.putExtra("sms_body", mensaje);

                startActivity(smsIntent);
            }
        });
    }
}
