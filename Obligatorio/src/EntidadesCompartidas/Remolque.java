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
public class Remolque extends Servicio{
    private int Kilometros;

    public int getKilometros() {
        return Kilometros;
    }

    public void setKilometros(int Kilometros) {
        this.Kilometros = Kilometros;
    }

    public Remolque(int Kilometros, int NroSerie, SolicitudDeServicio refSolicitud) {
        super(NroSerie, refSolicitud);
        this.Kilometros = Kilometros;
    }
    
    @Override 
    protected double CalcularImporte(){
        double importe = 0;
        return importe;
    }
}
