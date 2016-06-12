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

public class VentanaGruas extends JFrame{
    
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
    
    private void inicializarComponentes() {
    
    setTitle("Grúas");
    
        
        
        
        
    
    setPreferredSize(new Dimension(400, 300));
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
    }
    
    @Override
    public void dispose() {
        instancia = null;
        ventanaPrincipal.ventanaGruas = null;
    }
}
