package br.com.oficinasprojetc3.myapplication;

/**
 * Created by Gordo on 28/05/2017.
 */

public class Instrumento {

    private String nome;
    private int id;


    public Instrumento(String nome, int id) {
        super();
        this.nome = nome;
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return  nome;
    }


}
