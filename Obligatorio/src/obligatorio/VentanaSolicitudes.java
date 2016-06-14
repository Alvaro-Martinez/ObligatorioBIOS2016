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

public class VentanaSolicitudes extends JInternalFrame{
    
    private static VentanaSolicitudes instancia = null;
    
    
    public static VentanaSolicitudes getInstancia(VentanaPrincipal ventanaPrincipal) {
        if (instancia == null) {
            instancia = new VentanaSolicitudes(ventanaPrincipal);
        }
        
        return instancia;
    }
    
    
    protected VentanaPrincipal ventanaPrincipal;
    
    
    private VentanaSolicitudes(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        
        inicializarComponentes();
    }
    
    protected void inicializarComponentes() {
        setTitle("Solicitudes");
        
        
        
        
        
        
        
        
        
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        
        setPreferredSize(new Dimension(700, 500));
        pack();
        setLocation(50, 50);
    }
    
    @Override
    public void dispose() {
        instancia = null;
        ventanaPrincipal.ventanaSolicitudes = null;
    }
}
