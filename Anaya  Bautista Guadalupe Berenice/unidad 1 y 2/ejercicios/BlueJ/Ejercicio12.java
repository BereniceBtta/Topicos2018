
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Ejercicio12 extends JFrame
{
    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;
    JSlider jslide = new JSlider (0, 100);
    JLabel jlabel = new JLabel ("50");

    public Ejercicio12 ()
    {
        setTitle("Ejercicio 12");
        setSize(WIDTH, HEIGHT);

        JPanel p = new JPanel ();
        p.setLayout(new FlowLayout());
        p.add(jslide);
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jlabel);

        Container c= getContentPane();
        c.add(p, BorderLayout.NORTH);
        c.add(p2, BorderLayout.CENTER);

        eventos();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void eventos(){
        jslide.addChangeListener(new  ChangeListener() {
                public void stateChanged(ChangeEvent e) {
                    jlabel.setText(""+jslide.getValue());
                }
            });
        this.addMouseWheelListener(new MouseWheelListener(){  
                public void mouseWheelMoved(MouseWheelEvent e){
                    int valor = jslide.getValue();
                    valor = valor + e.getUnitsToScroll();
                    jslide.setValue(valor);
                }
            });
    }

    public static void main (String [] args)
    {
        new Ejercicio12();
    }
}
    