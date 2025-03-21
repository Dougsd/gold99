
package com.mycompany.gold99;

import javax.swing.GroupLayout;
import javax.swing.WindowConstants;

public class Estoque {
    private float Gramas;
    private float CcustoMedio;

    public Estoque(float Gramas, float CcustoMedio) {
        this.Gramas = Gramas;
        this.CcustoMedio = CcustoMedio;
    }

    public Estoque() {
    }

    public float getGramas() {
        return Gramas;
    }

    public void setGramas(float Gramas) {
        this.Gramas = Gramas;
    }

    public float getCcustoMedio() {
        return CcustoMedio;
    }

    public void setCcustoMedio(float CcustoMedio) {
        this.CcustoMedio = CcustoMedio;
    }

   
  
}
