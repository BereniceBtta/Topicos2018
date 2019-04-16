
/**
 * Write a description of class ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*; // for JFrame, JLabel
import java.awt.*; // for FlowLayout
import java.awt.event.*;//para el ActionListener
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio1 extends JFrame 
{
 private static final int WIDTH = 550;
 private static final int HEIGHT = 200;
 private JLabel namePrompt;
 private JLabel CiudadPrompt;
 private JButton OcNom;
 private JButton OcCiu;
 private JButton MosNom;
 private JButton MosCiu;
//tarea (1,2,3,4),(9,10,11) pura interfaz
//tarea terminar funcionalidad del 1 (este)
 public ejercicio1(){
 setTitle("Ejercicio1");
 setSize(WIDTH, HEIGHT);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setLayout(new FlowLayout());
 createContents();
 setVisible(true);
    }
    private void createContents()
 {
 JLabel namePrompt = new JLabel("Berenice");
 add(namePrompt);
 JLabel CiudadPrompt = new JLabel("Oaxaca");
 add(CiudadPrompt);
 //en un jpanel
 JPanel contenedor= new JPanel();
 contenedor.setBounds(200,350,200,300);
 add(contenedor);
 contenedor.setVisible(true);
 JButton OcNom = new JButton("Ocultar nombre");
 contenedor.add(OcNom);
 OcNom.setBounds(250,300,200,150);
 JButton OcCiu = new JButton("Ocultar Ciudad");
 contenedor.add(OcCiu);
 OcCiu.setBounds(250,300,200,150);
 JButton MosNom = new JButton("Mostrar nombre");
 contenedor.add(MosNom);
 MosNom.setBounds(250,300,200,150);
 JButton MosCiu = new JButton("Mostrar Ciudad");
 contenedor.add(MosCiu);
 MosCiu.setBounds(250,300,200,150);
 /*
  
  OcNom.addActionListener(this);                                       
 OcCiu.addActionListener(this);                                               
 MosNom.addActionListener(this); 
 MosCiu.addActionListener(this);
} 
public class evento implement ActionListener{

  public void actionPerformed(ActionEvent e) { 
      if(e.getSource() == OcNom){
         namePrompt.setVisible(false);}
         if(e.getSource() == OcCiu){
             CiudadPrompt.setVisible(false);}
              if(e.getSource() == MosNom){
                namePrompt.setVisible(true);}
                 if(e.getSource() == MosCiu){
                    CiudadPrompt.setVisible(true);}}}*/
         OcCiu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 CiudadPrompt.setVisible(false);
            }
        });
         OcNom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               namePrompt.setVisible(false);
            }
        });
         MosNom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               namePrompt.setVisible(true);
            }
        });
         MosCiu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               CiudadPrompt.setVisible(true);
            }
        });
   
}}

