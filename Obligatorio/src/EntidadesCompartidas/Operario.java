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
public class Operario {
    private int Id;
    private String Nombre;
    private Date FechaIngreso;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public Operario(int Id, String Nombre, Date FechaIngreso) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.FechaIngreso = FechaIngreso;
    }    
    
}
