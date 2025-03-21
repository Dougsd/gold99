package com.mycompany.gold99;

public class Cliente {
    private String Idcliente;
    private String Nomecliente;
    private String celular;
    private String IdCc;

    public Cliente(String Nomecliente, String celular) {
        this.Nomecliente = Nomecliente;
        this.celular = celular;
    }

    public Cliente(String Idcliente, String Nomecliente, String celular, String IdCc) {
        this.Idcliente = Idcliente;
        this.Nomecliente = Nomecliente;
        this.celular = celular;
        this.IdCc = IdCc;
    }

    public String getIdcliente() {
        return Idcliente;
    }

    public void setIdcliente(String Idcliente) {
        this.Idcliente = Idcliente;
    }

    public String getNomecliente() {
        return Nomecliente;
    }

    public void setNomecliente(String Nomecliente) {
        this.Nomecliente = Nomecliente;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getIdCc() {
        return IdCc;
    }

    public void setIdCc(String IdCc) {
        this.IdCc = IdCc;
    }    
} 
