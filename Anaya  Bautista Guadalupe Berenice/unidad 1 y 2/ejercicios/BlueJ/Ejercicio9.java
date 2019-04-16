
package src.tareas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author 
 * pulir
 */
public class Ejercicio9 extends JFrame implements ItemListener {

    private JPanel ingredientes, tamanio;
    private JButton btnTotal;
    private JLabel etiResultado;
    private JCheckBox chkBacon, chkAnchoas, chkCebolla, chkPimiento;
    private JRadioButton optPequenia, optMediana, optFamiliar;
    private ButtonGroup tamanios;

    double precioTamanio, total, extraing;

    public Ejercicio9() {
        super();
        precioTamanio = 11; // Por defecto de la pizza familair
        extraing = 0;

        total = 0;

        configurarVentana();
        inicializarComponentes();

    }

    private void configurarVentana() {
        this.setTitle("Ejercicio 9");
        this.setSize(410, 410);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }

        });

    }

    private void close() {
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void inicializarComponentes() {

        optPequenia = new JRadioButton("Pequeña");
        optMediana = new JRadioButton("Mediana");
        optFamiliar = new JRadioButton("Familiar", true);
        tamanios = new ButtonGroup();
        tamanios.add(optPequenia);
        tamanios.add(optMediana);
        tamanios.add(optFamiliar);
        RadioListener escuchaRadio = new RadioListener();
        optPequenia.addActionListener(escuchaRadio);
        optMediana.addActionListener(escuchaRadio);
        optFamiliar.addActionListener(escuchaRadio);

        chkBacon = new JCheckBox("Bacon");
        chkBacon.addItemListener(this);
        chkAnchoas = new JCheckBox("Anchoas");
        chkAnchoas.addItemListener(this);
        chkCebolla = new JCheckBox("Cebolla");
        chkCebolla.addItemListener(this);
        chkPimiento = new JCheckBox("Pimiento");
        chkPimiento.addItemListener(this);

        btnTotal = new JButton("Total");
        etiResultado = new JLabel();

        ingredientes = new JPanel();
        tamanio = new JPanel();

        ingredientes.add(chkBacon);
        ingredientes.add(chkAnchoas);
        ingredientes.add(chkCebolla);
        ingredientes.add(chkPimiento);

        tamanio.add(optPequenia);
        tamanio.add(optMediana);
        tamanio.add(optFamiliar);

        tamanio.setVisible(true);
        ingredientes.setVisible(true);
//  (x, y, ancho, alto)

        ingredientes.setBounds(0, 0, 110, 210);
        tamanio.setBounds(150, 0, 100, 100);
        btnTotal.setBounds(50, 250, 150, 30);
        this.add(tamanio);
        this.add(ingredientes);
        this.add(btnTotal);
        etiResultado = new JLabel();
        etiResultado.setBounds(50, 300, 150, 30);
        this.add(etiResultado);

        btnTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                etiResultado.setText("$ " + (precioTamanio + extraing));
            }
        });

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (chkAnchoas.isSelected() == true) {
            extraing += 1.80;
        }
        if (chkBacon.isSelected() == true) {
            extraing += 1.50;
        }
        if (chkCebolla.isSelected() == true) {
            extraing += 1;
        }
        if (chkPimiento.isSelected() == true) {
            extraing += 1.20;

        }
    }

    public class RadioListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String seleccion = e.getActionCommand();
            switch (seleccion) {
                case "Mediana":
                    precioTamanio = 9;
                    break;
                case "Familiar":
                    precioTamanio = 11;
                    break;
                case "PequeÃ±a":
                    precioTamanio = 7;
                    break;
            }

        }
    }

    public static void main(String[] args) {
        Ejercicio9 V = new Ejercicio9();
        V.setVisible(true);
    }

}
