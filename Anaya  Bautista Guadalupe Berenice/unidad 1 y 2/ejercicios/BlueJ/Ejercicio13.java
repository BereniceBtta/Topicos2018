import javax.swing.*; 
import java.awt.*; 
import java.awt.Container;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.Border;
public class Ejercicio13 extends JFrame implements ActionListener
{

    private static final int WIDTH = 450; 
    private static final int HEIGHT = 300;
    private JRadioButton rb1,rb2,rb3,rb4;
    private ButtonGroup pared;
    private JPanel r,m;
    private JLabel ancho,alto;
    private JTextField txt1,txt2;
    private JButton asignar,area,perimetro;
    private JPanel tam,pare,e,a,b;
    BorderLayout borderLayout=new BorderLayout();
    Rectangulo rectangulo;

    public Ejercicio13(){
        setTitle("Ejercicio 13");
        setSize(WIDTH, HEIGHT);
        this.setLocationRelativeTo(null);
        initComponents();

    } 

    public void initComponents(){

        TitledBorder tamaño = BorderFactory.createTitledBorder("Tamaño");
        TitledBorder paredes = BorderFactory.createTitledBorder("Rectangulo");

        tam=new JPanel(new GridLayout(4,1));
        pare=new JPanel(new GridLayout(3,2));
        e=new JPanel();
        a=new JPanel();
        b=new JPanel(new GridLayout(2,1));

        add(b,BorderLayout.SOUTH);
        add(a,BorderLayout.EAST);
        tam.setBorder(tamaño);
        pare.setBorder(tamaño);
        add(e,BorderLayout.WEST);

        pared= new ButtonGroup();
        
        rb1=new JRadioButton("Pared Norte");
        rb1.setSelected(true);
        rb2=new JRadioButton("Pared Sur");
        rb3=new JRadioButton("Pared Este");
        rb4=new JRadioButton("Pared Oeste");
        pared.add(rb1);
        pared.add(rb2);
        pared.add(rb3);
        pared.add(rb4);

        ancho=new JLabel("Ancho");
        alto=new JLabel("Alto");
        txt1=new JTextField();
        txt2=new JTextField();
        asignar=new JButton("Asignar");
        area=new JButton("Área");
        perimetro=new JButton("Perímetro");
        pare.add(ancho);
        pare.add(txt1);
        pare.add(alto);
        pare.add(txt2);
        pare.add(asignar);

        e.add(tam,BorderLayout.CENTER);
        a.add(pare,BorderLayout.CENTER);
        tam.add(rb1);
        tam.add(rb2);
        tam.add(rb3);
        tam.add(rb4);
        b.add(area);
        b.add(perimetro);

        asignar.addActionListener(this);
        area.addActionListener(this);
        perimetro.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double ancho=0;
        double alto=0;
        rectangulo = new Rectangulo();
        if(e.getSource()==asignar){

            if(rb1.isSelected()){

                ancho=Double.parseDouble(txt1.getText());
                alto=Double.parseDouble(txt2.getText());

                
            }
            if(rb2.isSelected()){

                ancho=Double.parseDouble(txt1.getText());
                alto=Double.parseDouble(txt2.getText());

            }
            if(rb3.isSelected()){

                ancho=Double.parseDouble(txt1.getText());
                alto=Double.parseDouble(txt2.getText());

            }
            if(rb4.isSelected()){

                ancho=Double.parseDouble(txt1.getText());
                alto=Double.parseDouble(txt2.getText());

            }
        }else if(e.getSource()==area){
            if(rb1.isSelected()){
                double m=0;
                ancho=Double.parseDouble(txt1.getText());
                alto=Double.parseDouble(txt2.getText());

                rectangulo.setBase(ancho);
                rectangulo.setAltura(alto);

                JOptionPane.showMessageDialog(null," El area de la Pared Norte es:"+rectangulo.getArea());
            }
            if(rb2.isSelected()){
                double m=0;
                ancho=Double.parseDouble(txt1.getText());
                alto=Double.parseDouble(txt2.getText());

                rectangulo.setBase(ancho);
                rectangulo.setAltura(alto);

                JOptionPane.showMessageDialog(null," El area de la Pared Sur es:"+rectangulo.getArea());
            }
            if(rb3.isSelected()){
                double m=0;
                ancho=Double.parseDouble(txt1.getText());
                alto=Double.parseDouble(txt2.getText());

                rectangulo.setBase(ancho);
                rectangulo.setAltura(alto);

                JOptionPane.showMessageDialog(null," El area de la Pared Este:"+rectangulo.getArea());
            }
            if(rb4.isSelected()){
                double m=0;
                ancho=Double.parseDouble(txt1.getText());
                alto=Double.parseDouble(txt2.getText());

                rectangulo.setBase(ancho);
                rectangulo.setAltura(alto);

                JOptionPane.showMessageDialog(null," El area de la Pared Oeste:"+rectangulo.getArea());
            }
                }else{

            if(e.getSource()==perimetro){
                if(rb1.isSelected()){

                    ancho=Double.parseDouble(txt1.getText());
                    alto=Double.parseDouble(txt2.getText());

                    rectangulo.setBase(ancho);
                    rectangulo.setAltura(alto);

                    JOptionPane.showMessageDialog(null," El perimetro de la Pared Norte es:"+rectangulo.getPerimetro());
                }

                if(rb2.isSelected()){

                    ancho=Double.parseDouble(txt1.getText());
                    alto=Double.parseDouble(txt2.getText());

                    rectangulo.setBase(ancho);
                    rectangulo.setAltura(alto);

                    JOptionPane.showMessageDialog(null," El perimetro de la Pared Sur es:"+rectangulo.getPerimetro());
                }
                if(rb3.isSelected()){

                    ancho=Double.parseDouble(txt1.getText());
                    alto=Double.parseDouble(txt2.getText());

                    rectangulo.setBase(ancho);
                    rectangulo.setAltura(alto);

                    JOptionPane.showMessageDialog(null," El perimetro de la Pared Este es:"+rectangulo.getPerimetro());
                }
                if(rb4.isSelected()){

                    ancho=Double.parseDouble(txt1.getText());
                    alto=Double.parseDouble(txt2.getText());

                    rectangulo.setBase(ancho);
                    rectangulo.setAltura(alto);

                    JOptionPane.showMessageDialog(null," El perimetro de la Pared Oeste es:"+rectangulo.getPerimetro());
                }
            }
        }
    }

    public static void main(String []arg){
        Ejercicio13 m=new Ejercicio13();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}