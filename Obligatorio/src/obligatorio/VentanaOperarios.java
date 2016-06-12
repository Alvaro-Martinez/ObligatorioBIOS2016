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

public class VentanaOperarios extends JFrame{
    
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
    
    private void inicializarComponentes() {
        
    setTitle("Operarios");
        
        
        
        
    
    setPreferredSize(new Dimension(400, 300));
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
    }
    
    @Override
    public void dispose() {
        instancia = null;
        ventanaPrincipal.ventanaOperarios = null;
    }
}
