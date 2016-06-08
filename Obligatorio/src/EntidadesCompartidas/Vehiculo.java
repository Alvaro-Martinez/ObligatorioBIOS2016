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
public class Vehiculo {
    private String Matricula;
    private String Marca;
    private String Modelo;
    private int Peso;
    private Cliente refCliente;

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public Cliente getRefCliente() {
        return refCliente;
    }

    public void setRefCliente(Cliente refCliente) {
        this.refCliente = refCliente;
    }

    public Vehiculo(String Matricula, String Marca, String Modelo, int Peso, Cliente refCliente) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Peso = Peso;
        this.refCliente = refCliente;
    }   
    
}
