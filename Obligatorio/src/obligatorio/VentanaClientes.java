/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Álvaro
 */
public class VentanaClientes extends JInternalFrame {
    
    protected JLabel lblTitulo;
    protected JLabel lblCedula;
    protected JLabel lblNombre;
    protected JLabel lblDireccion;
    protected JLabel lblTelefono;
    protected JLabel lblMensaje;
    
    protected JTextField txtCedula;
    protected JTextField txtNombre;
    protected JTextField txtDireccion;
    protected JTextField txtTelefono;
    
    protected JButton btnAgregar;
    protected JButton btnEliminar;
    protected JButton btnModificar;
    protected JButton btnBuscar;
    protected JButton btnLimpiar;
    
    private static VentanaClientes instancia = null;
    
    
    public static VentanaClientes getInstancia(VentanaPrincipal ventanaPrincipal) {
        if (instancia == null) {
            instancia = new VentanaClientes(ventanaPrincipal);
        }
        
        return instancia;
    }
    
    protected VentanaPrincipal ventanaPrincipal;
    
    
    private VentanaClientes(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        
        inicializarComponentes();
    }
    
    protected void inicializarComponentes() {
        setTitle("Clientes");
        
        
        
        
        
        
        
        
        
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        
        setPreferredSize(new Dimension(700, 500));
        pack();
        setLocation(10, 10);
    }
    
    @Override
    public void dispose() {
        instancia = null;
        ventanaPrincipal.ventanaClientes = null;
    }
}
