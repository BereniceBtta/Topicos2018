/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.tareas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author
 */
public class Ejercicio3 extends JFrame {

    private JLabel etiTexto;
    private JTextField txtTexto;
    private JButton btnVaciar;

    public Ejercicio3() {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {
        this.setTitle("Ejercicio 3");
        this.setSize(310, 210);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
        etiTexto = new JLabel();
        txtTexto = new JTextField();
        btnVaciar = new JButton();
        etiTexto.setBounds(50, 50, 100, 25);
        txtTexto.setBounds(150, 10, 100, 25);
        btnVaciar.setText("Vaciar");
        //  (x, y, ancho, alto)
        btnVaciar.setBounds(50, 100, 100, 30);
        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                etiTexto.setText(null);
                txtTexto.setText(null);
            }
        });
        
        txtTexto.addKeyListener( new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                etiTexto.setText(etiTexto.getText() + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        this.add(etiTexto);
        this.add(txtTexto);
        this.add(btnVaciar);

    }

    public static void main(String[] args) {
        Ejercicio3 V = new Ejercicio3();
        V.setVisible(true);
    }

}
