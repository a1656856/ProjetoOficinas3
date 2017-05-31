package br.com.oficinasprojetc3.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;



public class ModoLivre extends AppCompatActivity {

    private Button BotaoVolta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modo_livre);

        BotaoVolta = (Button) findViewById(R.id.ButtonVoltar);
        BotaoVolta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ModoLivre.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }

}
