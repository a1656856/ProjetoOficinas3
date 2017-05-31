package br.com.oficinasprojetc3.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModoAprendizagem extends AppCompatActivity {


    private Button BotaoNormal;
    private Button BotaoComRitmo;
    private Button BotaoVolta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modo_aprendizagem);


        BotaoNormal = (Button) findViewById(R.id.ButtonNormal);
        BotaoNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //AQUI VAI O Código do MODO APRENDIZAGEM MODO NORMAL

            }
        });

        BotaoComRitmo = (Button) findViewById(R.id.ButtonComRitmo);
        BotaoComRitmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //AQUI VAI O Código do MODO APRENDIZAGEM MODO COM RITMO

            }
        });

        BotaoVolta = (Button) findViewById(R.id.ButtonVoltar);
        BotaoVolta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ModoAprendizagem.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
