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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    protected JDesktopPane escritorio;
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
        
        escritorio = new JDesktopPane();
        setContentPane(escritorio);
        
        barraMenus = new JMenuBar();
        setJMenuBar(barraMenus);
        
        menuClientes = new JMenu("Clientes");
//        menuClientes.setMnemonic('C');
        barraMenus.add(menuClientes);
        
        itemABMClientes = new JMenuItem("ABM Clientes");
//        itemABMClientes.setMnemonic('L');
//        itemABMClientes.setAccelerator(KeyStroke.getKeyStroke('L', InputEvent.CTRL_MASK + InputEvent.ALT_MASK));
        itemABMClientes.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                clicMenuClientes(e);
            }
            
        });
        menuClientes.add(itemABMClientes);
        
        menuClientes.add(new JSeparator());  
        
        // VEHICULOS ...........................................................
        
        itemVehiculos = new JMenuItem("Vehículos");
//        itemVehiculos.setMnemonic('V');
//        itemVehiculos.setAccelerator(KeyStroke.getKeyStroke('V', InputEvent.CTRL_MASK + InputEvent.ALT_MASK));
        itemVehiculos.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                clicMenuVehiculos(e);
            }
            
        });
        menuClientes.add(itemVehiculos);
        
        // SOLICITUDES .........................................................        
        
        menuSolicitudes = new JMenu("Solicitudes");
//        menuSolicitudes.setMnemonic('S');
        barraMenus.add(menuSolicitudes);
        
        itemAlgo = new JMenuItem("Algo");
//        itemAlgo.setMnemonic('A');
//        itemAlgo.setAccelerator(KeyStroke.getKeyStroke('A', InputEvent.CTRL_MASK + InputEvent.ALT_MASK));
        itemAlgo.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                clicMenuSolicitudes(e);
            }
            
        });
        menuSolicitudes.add(itemAlgo);
        
        // SERVICIOS............................................................
        
        menuServicios = new JMenu("Servicios");
//        menuServicios.setMnemonic('E');
        barraMenus.add(menuServicios);
        
        itemOperarios = new JMenuItem("Operarios");
////        itemOperarios.setMnemonic('P');
////        itemOperarios.setAccelerator(KeyStroke.getKeyStroke('P', InputEvent.CTRL_MASK + InputEvent.ALT_MASK));
        itemOperarios.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                clicMenuOperarios(e);
            }
            
        });
        menuServicios.add(itemOperarios);
        
        menuServicios.add(new JSeparator());
        
        itemGruas = new JMenuItem("Gruas");
//        itemGruas.setMnemonic('G');
//        itemGruas.setAccelerator(KeyStroke.getKeyStroke('G', InputEvent.CTRL_MASK + InputEvent.ALT_MASK));
        itemGruas.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                clicMenuGruas(e);
            }
            
        });
        menuServicios.add(itemGruas);
        
               
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    // .........................................................................
    
    protected void clicMenuClientes(ActionEvent e) {
        try {
            if (ventanaClientes == null) {
                ventanaClientes = VentanaClientes.getInstancia(this);
                escritorio.add(ventanaClientes);
                ventanaClientes.setVisible(true);
        }

            ventanaClientes.setSelected(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "¡Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    protected void clicMenuVehiculos(ActionEvent e) {
        try {
            if (ventanaVehiculos == null) {
                ventanaVehiculos = VentanaVehiculos.getInstancia(this);
                escritorio.add(ventanaVehiculos);
                ventanaVehiculos.setVisible(true);
        }
            
            ventanaVehiculos.setSelected(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "¡Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    protected void clicMenuSolicitudes(ActionEvent e) {
        try {
            if (ventanaSolicitudes == null) {
                ventanaSolicitudes = VentanaSolicitudes.getInstancia(this);
                escritorio.add(ventanaSolicitudes);
                ventanaSolicitudes.setVisible(true);
            }

            ventanaSolicitudes.setSelected(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "¡Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    protected void clicMenuOperarios(ActionEvent e) {
        try {
            if (ventanaOperarios == null) {
                ventanaOperarios = VentanaOperarios.getInstancia(this);
                escritorio.add(ventanaOperarios);
                ventanaOperarios.setVisible(true);
            }
            
                ventanaOperarios.setSelected(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "¡Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    protected void clicMenuGruas(ActionEvent e) {
        try {
            if (ventanaGruas == null) {
                ventanaGruas = VentanaGruas.getInstancia(this);
                escritorio.add(ventanaGruas);
                ventanaGruas.setVisible(true);
            }
            
                ventanaGruas.setSelected(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "¡Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
