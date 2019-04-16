package src.tareas;


/**
 * Write a description of class ejercicio10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * ya está (ponerle diseño)
 */
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.*; 

public class ejercicio10 extends JFrame //implements ActionListener
{
    private JPanel text;
    private JPanel botones;
    private JLabel seleccion;
    private JList lista;
    private JLabel inicio;
    private JTextField txtinicio;
    private JLabel fin;
    private JTextField txtfin;
    private JLabel intervalo;
    private JTextField txtintervalo;
    private JButton btnRellenar;
    private JButton btnVaciar;
    
    

    public ejercicio10(){
 setTitle("Ejercicio10");
 setSize(600, 400);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setLayout((new BoxLayout(getContentPane(),BoxLayout.Y_AXIS)));
 createContents();
 setVisible(true);
}
    private void createContents(){
        JComboBox progresion = new JComboBox();
        progresion.setPreferredSize(new Dimension(50,50));
        add(progresion);
        JLabel seleccion = new JLabel("Seleccion");
        add(seleccion);
        JPanel text = new JPanel();
        text.setSize(200,200);
        text.setAlignmentX(Component.CENTER_ALIGNMENT);	
        text.setVisible(true);
        add(text);
        JPanel botones = new JPanel();
        botones.setSize(200,200);
        botones.setAlignmentX(Component.CENTER_ALIGNMENT);	
        botones.setVisible(true);
        add(botones);
        JLabel inicio =new JLabel("Inicio");
        inicio.setVisible(true);
        text.add(inicio);
        JTextField txtinicio = new JTextField(10);
        txtinicio.setVisible(true);
        text.add(txtinicio);
        JLabel fin = new JLabel("Fin");
        txtinicio.setVisible(true);
        text.add(fin);
        JTextField txtfin= new JTextField(10);
        txtfin.setVisible(true);
        text.add(txtfin);
        JLabel intervalo = new JLabel("Intervalo");
        intervalo.setVisible(true);
        text.add(intervalo);
        JTextField txtintervalo = new JTextField(10);
        txtintervalo.setVisible(true);
        text.add(txtintervalo);
        JButton btnRellenar = new JButton("Rellenar");
        btnRellenar.setVisible(true);
        botones.add(btnRellenar);
        JButton btnVaciar = new JButton("Vaciar");
        btnVaciar.setVisible(true);
        botones.add(btnVaciar);
    
    btnRellenar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
         int ini=Integer.parseInt(txtinicio.getText());
        int fin=Integer.parseInt(txtfin.getText());
        int intervalo=Integer.parseInt(txtintervalo.getText());
        try{
        if(fin <= ini){
            JOptionPane.showMessageDialog(null, "El valor final no puede ser menor");
        }else{
            for (int i=ini;i <= fin;){
                progresion.addItem(""+i);
                i+=intervalo;
            }
        }
        seleccion.setText("");
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Sólo números");
        }         
    }});
    btnVaciar.addActionListener(new ActionListener(){   
        @Override
        public void actionPerformed(ActionEvent e) {
        progresion.removeAllItems();
        txtinicio.setText("");
        txtfin.setText("");
        txtintervalo.setText("");
        seleccion.setText("");
        
    }});
    
    progresion.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == progresion){
           seleccion.setText(""+progresion.getSelectedItem());
        }}
    });
}
 
  }