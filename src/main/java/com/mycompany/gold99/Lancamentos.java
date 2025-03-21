package com.mycompany.gold99;
import java.sql.Date;

public class Lancamentos {
    private String Id;
    private String Idcliente;
    private String TipoOP;
    private float Valor;
    private Date data = new Date(System.currentTimeMillis());
    private String Descricao;
    private String IDCC;

    public Lancamentos(String Id, String Idcliente, String TipoOP, float Valor, String Descricao, String IDCC) {
        this.Id = Id;
        this.Idcliente = Idcliente;
        this.TipoOP = TipoOP;
        this.Valor = Valor;
        this.Descricao = Descricao;
        this.IDCC = IDCC;
    }
        
    

    public Lancamentos() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getIdcliente() {
        return Idcliente;
    }

    public void setIdcliente(String Idcliente) {
        this.Idcliente = Idcliente;
    }

    public String getTipoOP() {
        return TipoOP;
    }

    public void setTipoOP(String TipoOP) {
        this.TipoOP = TipoOP;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getIDCC() {
        return IDCC;
    }

    public void setIDCC(String IDCC) {
        this.IDCC = IDCC;
    }

    
    
}
