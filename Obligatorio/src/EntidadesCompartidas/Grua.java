/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesCompartidas;

/**
 *
 * @author DIEGO
 */
public class Grua {
    private int Numero;
    private int PesoMax;

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getPesoMax() {
        return PesoMax;
    }

    public void setPesoMax(int PesoMax) {
        this.PesoMax = PesoMax;
    }

    public Grua(int Numero, int PesoMax) {
        this.Numero = Numero;
        this.PesoMax = PesoMax;
    }    
    
}
