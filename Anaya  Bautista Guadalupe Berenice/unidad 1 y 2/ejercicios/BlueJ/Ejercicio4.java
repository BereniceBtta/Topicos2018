/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.tareas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 
 */
public class Ejercicio4 extends JFrame {
    
    private JLabel txtFrase;
    private JTextField txtNombre, txtCiudad;
    private JButton btnAceptar, btnDesactivar, btnActivar;
    
    public Ejercicio4() {
        super();
        configurarVentana();
        inicializarComponentes();
    }
    
    private void configurarVentana() {
        this.setTitle("Ejercicio 4");
        this.setSize(410, 210);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void inicializarComponentes() {
        txtFrase = new JLabel();
        txtNombre = new JTextField();
        txtCiudad = new JTextField();
        btnAceptar = new JButton("Aceptar");
        btnActivar = new JButton("Activar");
        btnDesactivar = new JButton("Desactivar");
        
        txtFrase.setBounds(50, 50, 200, 25);
        txtNombre.setBounds(150, 10, 100, 25);
        txtCiudad.setBounds(250, 10, 100, 25);

        //  (x, y, ancho, alto)
        btnAceptar.setBounds(50, 100, 100, 30);
        btnDesactivar.setBounds(150, 100, 100, 30);
        btnActivar.setBounds(250, 100, 100, 30);
        
        this.add(txtFrase);
        this.add(txtCiudad);
        this.add(txtNombre);
        this.add(btnAceptar);
        this.add(btnActivar);
        this.add(btnDesactivar);
        
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtFrase.setText("Usted se llama " + txtNombre.getText() + " y vive en " + txtCiudad.getText());
            }
        });
        
        btnActivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCiudad.setEnabled(true);
                txtNombre.setEnabled(true);
            }
        });
        
        btnDesactivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCiudad.setEnabled(false);
                txtNombre.setEnabled(false);
            }
        });
        
    }
    
    public static void main(String[] args) {
        Ejercicio4 V = new Ejercicio4();
        V.setVisible(true);
    }
    
}
