package br.com.oficinasprojetc3.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.bluetooth.BluetoothAdapter;

import android.content.Intent;

import android.media.AudioManager;

import android.media.SoundPool;

import android.os.Handler;

import android.os.Message;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.AdapterView;

import android.widget.ArrayAdapter;

import android.widget.Spinner;

import android.widget.TextView;

import android.widget.Toast;



import java.util.ArrayList;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button BotaoModoLivre;
    private Button BotaoModoGravacao;
    private Button BotaoModoAprendizagem;
    private Button BotaoEscolherInstrumento;
// inicio parte editada
    Spinner spinner;

    int id;

    static SoundPool sp;

    static int counter = 0;

    static private int soundIDp1;

    static boolean plays = false, loaded = false;

    static float actVolume, maxVolume, volume;

    static TextView statusMessage;

    AudioManager audioManager;

    ConnectionThread connect;

//fim parte editada


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INICIO parte editada YAS
        connect = new ConnectionThread("98:D3:31:90:60:7A");

        connect.start();



        try {

            Thread.sleep(1000);

        } catch (Exception E) {

            E.printStackTrace();

        }

        BluetoothAdapter btAdapter = BluetoothAdapter.getDefaultAdapter();



        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

        actVolume = (float) audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        maxVolume = (float) audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);

        volume = actVolume / maxVolume;



        sp = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);

        sp.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {

            @Override

            public void onLoadComplete(SoundPool sp, int sampleId, int status) {

                loaded = true;

            }

        });


        //FIM parte EDITADA

        BotaoModoLivre = (Button) findViewById(R.id.ButtonLivre);
        BotaoModoLivre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModoLivre.class);
                startActivity(intent);
                finish();
            }
        });

        BotaoModoGravacao = (Button) findViewById(R.id.ButtonGravacao);
        BotaoModoGravacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModoGravacao.class);
                startActivity(intent);
                finish();
            }
        });

        BotaoModoAprendizagem = (Button) findViewById(R.id.ButtonAprendizagem);
        BotaoModoAprendizagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModoAprendizagem.class);
                startActivity(intent);
                finish();
            }
        });



        BotaoEscolherInstrumento = (Button) findViewById(R.id.ButtonEscolher);
        BotaoEscolherInstrumento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TrocaInstrumento.class);
                startActivity(intent);
                finish();
            }
        });


    }
    public static Handler handler = new Handler() {

        @Override

        public void handleMessage(Message msg) {



            Bundle bundle = msg.getData();

            byte[] data = bundle.getByteArray("data");

            String dataString = new String(data);





            if (dataString.equals("---N"))

                statusMessage.setText("Ocorreu um erro durante a conexão D:");

            if (dataString.equals("---S"))

                statusMessage.setText("Conectado :D");



            /* Esse método é invocado na Activity principal

                sempre que a thread de conexão Bluetooth recebe

                uma mensagem.

             */



            if (dataString.equals("t2")) {

                if (loaded && !plays) {

                    sp.play(soundIDp1, volume, volume, 1, 0, 1f);

                    counter = counter++;

                    plays = true;

                }

                plays = false;

            }

        }

    };
}
