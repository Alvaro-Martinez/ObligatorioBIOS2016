/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesCompartidas;

import java.util.Date;

/**
 *
 * @author DIEGO
 */
public class Recibo {
    private int NroSerie;
    private Date Fecha;
    private double Importe;
    private Cliente refCliente;

    public int getNroSerie() {
        return NroSerie;
    }

    public void setNroSerie(int NroSerie) {
        this.NroSerie = NroSerie;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public double getImporte() {
        return Importe;
    }

    public Cliente getRefCliente() {
        return refCliente;
    }

    public void setRefCliente(Cliente refCliente) {
        this.refCliente = refCliente;
    }

    public Recibo(int NroSerie, Date Fecha, Cliente refCliente) {
        this.NroSerie = NroSerie;
        this.Fecha = Fecha;        
        this.refCliente = refCliente;
        this.Importe = this.CalcularImporte();
    }
    
    private double CalcularImporte(){
        double importe = 0;
        /*Calcular importe*/
        return importe;
    }
    
}
