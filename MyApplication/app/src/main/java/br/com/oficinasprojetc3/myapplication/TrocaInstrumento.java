package br.com.oficinasprojetc3.myapplication;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yasmin on 16/05/2017.
 */

public class TrocaInstrumento extends ListActivity {

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Instrumento> instrumentoList = gerarLista();

        ArrayAdapter<Instrumento> zombiesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, instrumentoList);
        setListAdapter(zombiesAdapter);

        ListView listView = getListView();

        LayoutInflater inflater = getLayoutInflater();
        View header = inflater.inflate(R.layout.text_header, listView, false);
        ((TextView) header.findViewById(R.id.textView)).setText("\nEscolha um instrumento:\n");
        listView.addHeaderView(header, null, false);

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // ListView Clicked item index
                //int itemPosition = position;

                // ListView Clicked item value
                String  itemValue = (String) instrumentoList.getItemAtPosition(position);

                int insEscolhido = position;
                Bundle b = new Bundle();
                int insEscolhidoMain = insEscolhido;
                b.putInt("insEscolhido", insEscolhidoMain);

                Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                MainActivity.putExtras(b);
                startActivity(MainActivity);
            }
        });
    }
    @Override
    protected void onListItemClick(ListView listView, View v, int position, long id){

        //int insEscolhido = position;
        Bundle b = new Bundle();
        //int insEscolhidoMain = insEscolhido;
        b.putInt("insEscolhido", position);

        Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
        MainActivity.putExtras(b);
        startActivity(MainActivity);
    }


    private List<Instrumento> gerarLista() {

        List<Instrumento> instrumentoList = new ArrayList<Instrumento>();

        instrumentoList.add(criarInstrumento("Piano", 0));
        instrumentoList.add(criarInstrumento("Acordeon", 1));
        instrumentoList.add(criarInstrumento("Guitarra", 2));
        instrumentoList.add(criarInstrumento("Sax", 3));
        instrumentoList.add(criarInstrumento("Violino", 4));
        instrumentoList.add(criarInstrumento("Xilofone", 5));

        return instrumentoList;
    }

    private Instrumento criarInstrumento(String nome, int id) {
        Instrumento instrumento = new Instrumento(nome, id);
        return instrumento;
    }*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        List<Instrumento> instrumentoList = gerarLista();

        ArrayAdapter<Instrumento> zombiesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, instrumentoList);
        setListAdapter(zombiesAdapter);

        ListView listView = getListView();

        LayoutInflater inflater = getLayoutInflater();
      //  View header = inflater.inflate(R.layout.text_header, listView, false);    //arrumar
     // ((TextView) header.findViewById(R.id.textView)).setText("\nEscolha um instrumento:\n");  //arrumar
       // listView.addHeaderView(header, null, false);

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // ListView Clicked item index
                //int itemPosition = position;

                // ListView Clicked item value
               // String  itemValue = (String) listView.getItemAtPosition(position);

               // String item = (String) getListAdapter().getItem(position-1);
                statusMessage.setText(position);

                //Bundle b = new Bundle();
                //int insEscolhidoMain = position;
                //b.putInt("insEscolhido", insEscolhidoMain);

                //Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                //MainActivity.putExtras(b);
                //startActivity(MainActivity);
            }
        });*/

    }

    @Override
    protected void onListItemClick(ListView listView, View v, int position, long id){
        // int insEscolhido = position;


        super.onListItemClick(listView, v, position, id);
        Object o = this.getListAdapter().getItem(position-1);
        //Bundle b = new Bundle();
        //   int insEscolhidoMain = insEscolhido;
        //  b.putInt("insEscolhido", insEscolhidoMain);
        //b.putInt("instrumento", position);
        String insEscolhido = o.toString();
        //String insEscolhido = position+"";
        //String insEscolhidoMain = insEscolhido;
        //b.putString("instrumento", insEscolhido);

        //int insEscolhido = position;
        //int insEscolhidoMain = insEscolhido;
        // b.putInt("instrumento", insEscolhidoMain);

        Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);

        MainActivity.putExtra("instrumento", insEscolhido);

        // b.putInt("instrumento", insEscolhido);

        //MainActivity.putExtras(b);
        startActivity(MainActivity);
    }

    private List<Instrumento> gerarLista() {

        List<Instrumento> instrumentoList = new ArrayList<>();

        instrumentoList.add(criarInstrumento("Piano", 0));
        instrumentoList.add(criarInstrumento("Acordeon", 1));
        instrumentoList.add(criarInstrumento("Guitarra", 2));
        instrumentoList.add(criarInstrumento("Sax", 3));
        instrumentoList.add(criarInstrumento("Violino", 4));
        instrumentoList.add(criarInstrumento("Xilofone", 5));

        return instrumentoList;
    }

    private Instrumento criarInstrumento(String nome, int id) {
        Instrumento instrumento = new Instrumento(nome, id);
        return instrumento;
    }
}