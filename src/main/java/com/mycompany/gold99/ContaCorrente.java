package com.mycompany.gold99;

public class ContaCorrente {
    private String IDCC;
    private String IDCliente;
    private double Saldo ;
    private String NomeCliente;

    public ContaCorrente(String IDCC, String IDCliente, double Saldo, String NomeCliente) {
        this.IDCC = IDCC;
        this.IDCliente = IDCliente;
        this.Saldo = Saldo;
        this.NomeCliente = NomeCliente;
    }

    public String getIDCC() {
        return IDCC;
    }

    public void setIDCC(String IDCC) {
        this.IDCC = IDCC;
    }

    public String getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(String IDCliente) {
        this.IDCliente = IDCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    } 
}
