package com.mycompany.gold99;
import java.sql.Date;

public class Vendas {
    private String id;
    private float  lucro;
    private float  qtd;
    private Date   data = new Date(System.currentTimeMillis());

    public Vendas() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
