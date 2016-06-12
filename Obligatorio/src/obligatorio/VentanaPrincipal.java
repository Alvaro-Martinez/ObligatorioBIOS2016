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
import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame{
    protected JMenuBar barraMenus;
    
    protected JMenu menuClientes;
    protected JMenuItem itemABMClientes;
    protected JMenuItem itemVehiculos;
    
    protected JMenu menuSolicitudes;
    protected JMenuItem itemAlgo; //?
    
    protected JMenu menuServicios;
    protected JMenuItem itemOperarios;
    protected JMenuItem itemGruas;
    
    protected VentanaClientes ventanaClientes;
    protected VentanaVehiculos ventanaVehiculos;
    protected VentanaSolicitudes ventanaSolicitudes;
    protected VentanaOperarios ventanaOperarios;
    protected VentanaGruas ventanaGruas;
    
    
    public VentanaPrincipal() {
        inicializarComponentes();
    }    
    
    protected void inicializarComponentes() {
        setTitle("Obligatorio");    
        
        barraMenus = new JMenuBar();
        setJMenuBar(barraMenus);
        
        menuClientes = new JMenu("Clientes");
        menuClientes.setMnemonic('C');
        barraMenus.add(menuClientes);
        
        itemABMClientes = new JMenuItem("ABM Clientes");
        itemABMClientes.setMnemonic('L');
        itemABMClientes.setAccelerator(KeyStroke.getKeyStroke('L', InputEvent.CTRL_MASK + InputEvent.ALT_MASK));
        itemABMClientes.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            try {
                if (ventanaClientes == null) {
                    ventanaClientes = VentanaClientes.getInstancia(VentanaPrincipal.this);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(VentanaPrincipal.this, ex.getMessage(), "¡Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        });
        menuClientes.add(itemABMClientes);
        
        menuClientes.add(new JSeparator());  
        
        itemVehiculos = new JMenuItem("Vehículos");
        itemVehiculos.setMnemonic('V');
        itemVehiculos.setAccelerator(KeyStroke.getKeyStroke('V', InputEvent.CTRL_MASK + InputEvent.ALT_MASK));
        itemVehiculos.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                if (ventanaVehiculos == null) {
                    ventanaVehiculos = VentanaVehiculos.getInstancia(VentanaPrincipal.this);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(VentanaPrincipal.this, ex.getMessage(), "¡Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        });
        menuClientes.add(itemVehiculos);
        
        // SOLICITUDES ....................................................        
        
        menuSolicitudes = new JMenu("Solicitudes");
        menuSolicitudes.setMnemonic('S');
        barraMenus.add(menuSolicitudes);
        
        itemAlgo = new JMenuItem("Algo");
        itemAlgo.setMnemonic('A');
        itemAlgo.setAccelerator(KeyStroke.getKeyStroke('A', InputEvent.CTRL_MASK + InputEvent.ALT_MASK));
        itemAlgo.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                if (ventanaSolicitudes == null) {
                    ventanaSolicitudes = VentanaSolicitudes.getInstancia(VentanaPrincipal.this);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(VentanaPrincipal.this, ex.getMessage(), "¡Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        });
        menuSolicitudes.add(itemAlgo);
        
        // SERVICIOS............................................................
        
        menuServicios = new JMenu("Servicios");
        menuServicios.setMnemonic('E');
        barraMenus.add(menuServicios);
        
        itemOperarios = new JMenuItem("Operarios");
        itemOperarios.setMnemonic('P');
        itemOperarios.setAccelerator(KeyStroke.getKeyStroke('P', InputEvent.CTRL_MASK + InputEvent.ALT_MASK));
        itemOperarios.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                if (ventanaOperarios == null) {
                    ventanaOperarios = VentanaOperarios.getInstancia(VentanaPrincipal.this);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(VentanaPrincipal.this, ex.getMessage(), "¡Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        });
        menuServicios.add(itemOperarios);
        
        menuServicios.add(new JSeparator());
        
        itemGruas = new JMenuItem("Gruas");
        itemGruas.setMnemonic('G');
        itemGruas.setAccelerator(KeyStroke.getKeyStroke('G', InputEvent.CTRL_MASK + InputEvent.ALT_MASK));
        itemGruas.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                if (ventanaGruas == null) {
                    ventanaGruas = VentanaGruas.getInstancia(VentanaPrincipal.this);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(VentanaPrincipal.this, ex.getMessage(), "¡Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        });
        menuServicios.add(itemGruas);
        
               
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 400));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
