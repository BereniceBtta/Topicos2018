
/**
 * Write a description of class DialogoPresentacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JDialog;
import javax.swing.*; 
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.BoxLayout;

public class DialogoPresentacion extends JDialog 
{
  JPanel contenedor;
  JLabel etiNombrePrograma,etiVersion,etiNombreProgramador;
  JButton btnEmpezar;
  Border blackline;
    
  public DialogoPresentacion(){
 setTitle("Tarea 2");
 setSize(400, 400);
 setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
 addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }

        });
 setLayout((new BoxLayout(getContentPane(),BoxLayout.Y_AXIS)));
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
        contenedor = new JPanel();
        contenedor.setSize(400,400);	
        contenedor.setAlignmentX(contenedor.CENTER_ALIGNMENT);	
        add(contenedor);
        etiNombrePrograma= new JLabel();
        blackline = BorderFactory.createLineBorder(Color.BLACK);
        etiNombrePrograma.setBorder(blackline);
        etiNombrePrograma.setPreferredSize(new Dimension(100,20));
        contenedor.add(etiNombrePrograma);
        etiVersion= new JLabel();
        blackline = BorderFactory.createLineBorder(Color.BLACK);
        etiVersion.setBorder(blackline);	
        etiVersion.setPreferredSize(new Dimension(100,20));	
        contenedor.add(etiVersion);
        JLabel texto = new JLabel("Programado por");
        contenedor.add(texto);
        etiNombreProgramador= new JLabel();
        blackline = BorderFactory.createLineBorder(Color.BLACK);
        etiNombreProgramador.setBorder(blackline);
        etiNombreProgramador.setPreferredSize(new Dimension(300,20));
        contenedor.add(etiNombreProgramador);
        btnEmpezar = new JButton("Empezar");
        btnEmpezar.setPreferredSize(new Dimension(100,20));
        contenedor.add(btnEmpezar);
        
        
        btnEmpezar.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
    System.exit(0);
    }
    });
}
  
    public void setNombrePrograma(String nombre){
        etiNombrePrograma.setText(nombre);
    }
    public void setVersion(String Version){
        etiVersion.setText(Version);
        
    }
    public void setNombreProgramador(String nombreprograma){
        etiNombreProgramador.setText(nombreprograma);
   }
   
  
}