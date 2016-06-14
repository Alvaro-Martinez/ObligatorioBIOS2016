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

public class VentanaOperarios extends JInternalFrame{
    
    private static VentanaOperarios instancia = null;
    
    
    public static VentanaOperarios getInstancia(VentanaPrincipal ventanaPrincipal) {
        if (instancia == null) {
            instancia = new VentanaOperarios(ventanaPrincipal);
        }
        
        return instancia;
    }
    
    
    protected VentanaPrincipal ventanaPrincipal;
    
    
    private VentanaOperarios(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        
        inicializarComponentes();
    }
    
    protected void inicializarComponentes() {
        setTitle("Operarios");
        
        
        
        
        
        
        
        
        
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
        ventanaPrincipal.ventanaOperarios = null;
    }
}
