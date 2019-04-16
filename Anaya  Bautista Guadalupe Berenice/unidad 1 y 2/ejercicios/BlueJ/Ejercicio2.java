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
public class Ejercicio2 extends JFrame {

    private JLabel etiTexto1, etiTexto2;
    private JTextField txtTexto;
    private JButton btnTraspasa1, btnTraspasa2;

    public Ejercicio2() {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {
        this.setTitle("Ejercicio 2");
        this.setSize(310, 210);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {

        etiTexto1 = new JLabel();
        etiTexto2 = new JLabel();
        txtTexto = new JTextField();
        btnTraspasa1 = new JButton();
        btnTraspasa2 = new JButton();

        etiTexto1.setBounds(50, 50, 100, 25);
        etiTexto2.setBounds(150, 50, 100, 25);

        txtTexto.setBounds(150, 10, 100, 25);
        btnTraspasa1.setText("Traspasa 1");
        btnTraspasa2.setText("Traspasa 2");
        //  (x, y, ancho, alto)
        btnTraspasa1.setBounds(50, 100, 100, 30);
        btnTraspasa2.setBounds(150, 100, 100, 30);
        btnTraspasa1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                etiTexto1.setText(txtTexto.getText());
            }
        });
        btnTraspasa2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                etiTexto2.setText(txtTexto.getText());
            }
        });

        this.add(etiTexto1);
        this.add(etiTexto2);
        this.add(txtTexto);
        this.add(btnTraspasa1);
        this.add(btnTraspasa2);
    }

    public static void main(String[] args) {
        Ejercicio2 V = new Ejercicio2();
        V.setVisible(true);
    }

}
