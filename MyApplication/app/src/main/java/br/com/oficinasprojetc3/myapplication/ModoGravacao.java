package br.com.oficinasprojetc3.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ModoGravacao extends AppCompatActivity {


    private Button BotaoGravar;
    private Button BotaoPausar;
    private Button BotaoReproduzir;
    private Button BotaoSalvar;
    private Button BotaoVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modo_gravacao);

        BotaoGravar = (Button) findViewById(R.id.ButtonGravar);
        BotaoGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //AQUI YAS, VAI O CÓDIGO DO BOTAO GRAVAR!!!!!!
            }
        });

        BotaoPausar = (Button) findViewById(R.id.ButtonPausar);
        BotaoGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //AQUI YAS, VAI O CÓDIGO DO BOTAO PAUSAR!!!!!!

            }
        });

        BotaoReproduzir = (Button) findViewById(R.id.ButtonReproduzir);
        BotaoReproduzir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //AQUI YAS, VAI O CÓDIGO DO BOTAO REPRODUZIR!!!!!!

            }
        });

        BotaoSalvar = (Button) findViewById(R.id.ButtonSalvar);
        BotaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //AQUI YAS, VAI O CÓDIGO DO SALVAR!!!!!!

            }
        });

        BotaoVoltar = (Button) findViewById(R.id.ButtonVoltar);
        BotaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ModoGravacao.this, ModoAprendizagem.class);
                startActivity(intent);
                finish();

            }
        });

    }

}
