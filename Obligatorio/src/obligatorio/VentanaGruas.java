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

public class VentanaGruas extends JInternalFrame{
    
    private static VentanaGruas instancia = null;
    
    
    public static VentanaGruas getInstancia(VentanaPrincipal ventanaPrincipal) {
        if (instancia == null) {
            instancia = new VentanaGruas(ventanaPrincipal);
        }
        
        return instancia;
    }
    
    
    protected VentanaPrincipal ventanaPrincipal;
    
    
    private VentanaGruas(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        
        inicializarComponentes();
    }
    
    protected void inicializarComponentes() {
        setTitle("Grúas");
        
        
        
        
        
        
        
        
        
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        
        setPreferredSize(new Dimension(700, 500));
        pack();
        setLocation(70, 70);
    }
    
    @Override
    public void dispose() {
        instancia = null;
        ventanaPrincipal.ventanaGruas = null;
    }
}
