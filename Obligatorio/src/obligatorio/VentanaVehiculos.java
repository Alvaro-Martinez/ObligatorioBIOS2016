/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;

/**
 *
 * @author Álvaro
 */
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;

public class VentanaVehiculos extends JInternalFrame{
    
    private static VentanaVehiculos instancia = null;
    
    
    public static VentanaVehiculos getInstancia(VentanaPrincipal ventanaPrincipal) {
        if (instancia == null) {
            instancia = new VentanaVehiculos(ventanaPrincipal);
        }
        
        return instancia;
    }
    
    
    protected VentanaPrincipal ventanaPrincipal;
    
    
    private VentanaVehiculos(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        
        inicializarComponentes();
    }
    
    protected void inicializarComponentes() {
        setTitle("Vehículos");
        
        
        
        
        
        
        
        
        
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        
        setPreferredSize(new Dimension(700, 500));
        pack();
        setLocation(30, 30);
    }
    
    @Override
    public void dispose() {
        instancia = null;
        ventanaPrincipal.ventanaVehiculos = null;
    }
}
