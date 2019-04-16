package src.tareas;


/**
 * Write a description of class ejercicio11 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * terminado
 * ponerle diseño
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.*; // for FlowLayout


public class ejercicio11 extends JFrame
{
 private JPanel oficina1;
 private JPanel oficina2;
 private JPanel oficina3;
 private JMenu menu1;
 private JMenu menu2;
 private JMenuBar menuFinal;
 private JMenuItem mi1, mi2, mi3, mi4,mi5;
 private JMenuItem mi6, mi7, mi8, mi9,mi10;
 private JMenuItem mi11, mi12, mi13, mi14,mi15;
 private JMenuItem mi16, mi17,menudia,menunoche;
 private JCheckBox luzprincipaloficina1;
 private JCheckBox luzsecundariaoficina1;
 private JCheckBox luzseguridadoficina1;
 private JCheckBox luzprincipaloficina2;
 private JCheckBox luzsecundariaoficina2;
 private JCheckBox luzseguridadoficina2;
 private JCheckBox luzprincipaloficina3;
 private JCheckBox luzsecundariaoficina3;
 private JCheckBox luzseguridadoficina3;
 
 public ejercicio11(){
 setTitle("Ejercicio11");
 setSize(450, 250);
 setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }

        });
 setLayout(new FlowLayout());
 createContents();
 setVisible(true);
    }
    private void close() {
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    private void createContents(){
JPanel oficina1 = new JPanel();
 oficina1.setSize(200,200);
 oficina1.setLayout(new FlowLayout());
 oficina1.setVisible(true);
 add(oficina1);
 JLabel nomofi1=new JLabel("oficina 1");
 oficina1.add(nomofi1);
 JCheckBox luzprincipaloficina1= new JCheckBox("Luz Principal");
 luzprincipaloficina1.setVisible(true);
 oficina1.add(luzprincipaloficina1);
 JCheckBox luzsecundariaoficina1= new JCheckBox("Luz Secundaria");
 luzsecundariaoficina1.setVisible(true);
 oficina1.add(luzsecundariaoficina1);
 JCheckBox luzseguridadoficina1= new JCheckBox("Luz de Seguridad");
 luzseguridadoficina1.setVisible(true);
 oficina1.add(luzseguridadoficina1);
 JPanel oficina2 = new JPanel();
 oficina2.setSize(300,200);
 oficina2.setLayout(new FlowLayout());
 oficina2.setVisible(true);
 add(oficina2);
 JLabel nomofi2=new JLabel("oficina 2");
 oficina2.add(nomofi2);
 JCheckBox luzprincipaloficina2= new JCheckBox("Luz Principal");
 luzprincipaloficina2.setVisible(true);
 oficina2.add(luzprincipaloficina2);
 JCheckBox luzsecundariaoficina2= new JCheckBox("Luz Secundaria");
 luzsecundariaoficina2.setVisible(true);
 oficina2.add(luzsecundariaoficina2);
 JCheckBox luzseguridadoficina2= new JCheckBox("Luz de Seguridad");
 luzseguridadoficina2.setVisible(true);
 oficina2.add(luzseguridadoficina2);
 JPanel oficina3 = new JPanel();
 oficina3.setSize(200,200);
 oficina3.setLayout(new FlowLayout());
 oficina3.setVisible(true);
 add(oficina3);
 JLabel nomofi3=new JLabel("oficina 3");
 oficina3.add(nomofi3);
 JCheckBox luzprincipaloficina3= new JCheckBox("Luz Principal");
 luzprincipaloficina3.setVisible(true);
 oficina3.add(luzprincipaloficina3);
 JCheckBox luzsecundariaoficina3= new JCheckBox("Luz Secundaria");
 luzsecundariaoficina3.setVisible(true);
 oficina3.add(luzsecundariaoficina3);
 JCheckBox luzseguridadoficina3= new JCheckBox("Luz de Seguridad");
 luzseguridadoficina3.setVisible(true);
 oficina3.add(luzseguridadoficina3);
 menu1 = new JMenu("Activacion");
 mi1= new JMenuItem("Apagar Todas");
 menu1.add(mi1);
 mi2= new JMenuItem("Encender Todas");
 menu1.add(mi2);
//es un menu 
 menudia= new JMenu("Día");
 menu1.add(menudia);
 mi6= new JMenuItem("Oficina 1");
 menudia.add(mi6);
 mi7= new JMenuItem("Oficina 2");
 menudia.add(mi7);
 mi8= new JMenuItem("Oficina 3");
 menudia.add(mi8);
 mi9= new JMenuItem("Todas");
 menudia.add(mi9);
//Es un menu
 menunoche= new JMenu("Noche");
 menu1.add(menunoche);
 mi10= new JMenuItem("Oficina 1");
 menunoche.add(mi10);
 mi11= new JMenuItem("Oficina 2");
 menunoche.add(mi11);
 mi12= new JMenuItem("Oficina 3");
 menunoche.add(mi12);
 mi13= new JMenuItem("Todas");
 menunoche.add(mi13);
 mi5= new JMenuItem("Salir");
 menu1.add(mi5);
 menu2 = new JMenu("Info");
 mi14= new JMenuItem("Principales");
 menu2.add(mi14);
 mi15= new JMenuItem("Secundarias");
 menu2.add(mi15);
 mi16= new JMenuItem("Seguridad");
 menu2.add(mi16);
 mi17= new JMenuItem("Acerca de...");
 menu2.add(mi17);
 menuFinal = new JMenuBar();
 menuFinal.add(menu1);
 menuFinal.add(menu2);
 setJMenuBar(menuFinal);
 setVisible(true);

 mi1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi1){
           luzprincipaloficina1.setSelected(false);
            luzprincipaloficina2.setSelected(false);
             luzprincipaloficina3.setSelected(false);
             luzsecundariaoficina1.setSelected(false);
            luzsecundariaoficina2.setSelected(false);
             luzsecundariaoficina3.setSelected(false);
             luzseguridadoficina1.setSelected(false);
            luzseguridadoficina2.setSelected(false);
             luzseguridadoficina3.setSelected(false);
        }}
    });
    
    mi2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi2){
           luzprincipaloficina1.setSelected(true);
            luzprincipaloficina2.setSelected(true);
             luzprincipaloficina3.setSelected(true);
             luzsecundariaoficina1.setSelected(true);
            luzsecundariaoficina2.setSelected(true);
             luzsecundariaoficina3.setSelected(true);
             luzseguridadoficina1.setSelected(true);
            luzseguridadoficina2.setSelected(true);
             luzseguridadoficina3.setSelected(true);
        }}
    });

    mi5.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            System.exit(0);
    }});
    
     mi6.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi6){
                luzprincipaloficina1.setSelected(true);
                luzsecundariaoficina1.setSelected(true);
                luzseguridadoficina1.setSelected(false);
        }}
    });
    
     mi7.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi7){
                luzprincipaloficina2.setSelected(true);
                luzsecundariaoficina2.setSelected(true);
                luzseguridadoficina2.setSelected(false);
        }}
    });
    
     mi8.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi8){
                luzprincipaloficina3.setSelected(true);
                luzsecundariaoficina3.setSelected(true);
                luzseguridadoficina3.setSelected(false);
        }}
    });
    
     mi9.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi9){
                luzprincipaloficina1.setSelected(true);
                luzsecundariaoficina1.setSelected(true);
                luzseguridadoficina1.setSelected(false);
                luzprincipaloficina2.setSelected(true);
                luzsecundariaoficina2.setSelected(true);
                luzseguridadoficina2.setSelected(false);
                luzprincipaloficina3.setSelected(true);
                luzsecundariaoficina3.setSelected(true);
                luzseguridadoficina3.setSelected(false);
        }}
    });
    
     mi10.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi10){
                luzprincipaloficina1.setSelected(false);
                luzsecundariaoficina1.setSelected(false);
                luzseguridadoficina1.setSelected(true);
        }}
    });
    
     mi11.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi11){
                luzprincipaloficina2.setSelected(false);
                luzsecundariaoficina2.setSelected(false);
                luzseguridadoficina2.setSelected(true);
        }}
    });
    
     mi12.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi12){
                luzprincipaloficina3.setSelected(false);
                luzsecundariaoficina3.setSelected(false);
                luzseguridadoficina3.setSelected(true);
        }}
    });
    
     mi13.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi13){
                luzprincipaloficina1.setSelected(false);
                luzsecundariaoficina1.setSelected(false);
                luzseguridadoficina1.setSelected(true);
                luzprincipaloficina2.setSelected(false);
                luzsecundariaoficina2.setSelected(false);
                luzseguridadoficina2.setSelected(true);
                luzprincipaloficina3.setSelected(false);
                luzsecundariaoficina3.setSelected(false);
                luzseguridadoficina3.setSelected(true);
        }}
    });
    
     mi14.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi14){
                int a = 0;
      int b = 0;
        if(luzprincipaloficina1.isSelected()){a++; }
        else{b++;}
          if(luzprincipaloficina2.isSelected()){a++; }
          else{b++;}
               if(luzprincipaloficina3.isSelected()){a++; }
          else{b++;}
         JOptionPane.showMessageDialog(null, "luces activas "+a+"\n luces apagadas "+b);
     
        }}
    });
    
     mi15.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi15){
                 int a = 0;
      int b = 0;
        if(luzsecundariaoficina1.isSelected()){a++; }
        else{b++;}
          if(luzsecundariaoficina2.isSelected()){a++; }
          else{b++;}
               if(luzsecundariaoficina3.isSelected()){a++; }
          else{b++;}
         JOptionPane.showMessageDialog(null, "luces activas "+a+"\n luces apagadas "+b);
     
        }}
    });
    
     mi16.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi16){
                 int a = 0;
      int b = 0;
        if(luzseguridadoficina1.isSelected()){a++; }
        else{b++;}
          if(luzseguridadoficina2.isSelected()){a++; }
          else{b++;}
               if(luzseguridadoficina3.isSelected()){a++; }
          else{b++;}
         JOptionPane.showMessageDialog(null, "luces activas "+a+"\n luces apagadas "+b);
     
        }}
    });
    
     mi17.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == mi17){      
JOptionPane.showMessageDialog(null,"CONTROL DE LUCES \n CREADO POR: ANAYA BAUTISTA GUADALUPE BERENICE" );
     
        }}
    });
 
}}
    
    
    
    
    
    
    
    
    
