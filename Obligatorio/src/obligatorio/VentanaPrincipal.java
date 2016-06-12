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
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Event.*;

public class VentanaPrincipal extends JFrame {

    protected JPanel panel;
    protected JMenuBar barra;
    protected JMenu menuClientes;
    protected JMenu menuSolicitudes;
    protected JMenu menuServicios;
    protected JMenuItem itemClientes;
    protected JMenuItem itemVehiculos; //declarar los demás componentes para los menús.
    protected JMenuItem itemOperarios;
    protected JMenuItem itemGruas;

    public VentanaPrincipal() {
        inicializarComponentes();
    }

    public void inicializarComponentes() {

        panel = new JPanel(new BorderLayout());
        setContentPane(panel);

        barra = new JMenuBar(); //Hay que setear la JMenuBar al Norte (border layout)
        setJMenuBar(barra);

        panel.add(barra, BorderLayout.NORTH);

        menuClientes = new JMenu("Clientes");
        barra.add(menuClientes);

        menuSolicitudes = new JMenu("Solicitudes");
        barra.add(menuSolicitudes);
        
        menuServicios = new JMenu("Servicios");
        barra.add(menuServicios);

        //Creo el contenido de cada menú.
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
