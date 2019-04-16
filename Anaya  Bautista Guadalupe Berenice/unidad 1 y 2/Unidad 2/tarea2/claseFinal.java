
/**
 * Write a description of class claseFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class claseFinal extends DialogoPresentacion 
{
   public claseFinal(){
    setNombrePrograma("Programa");
    setVersion("V 1.00");
    setNombreProgramador("Anaya Bautista Guadalupe Berenice");
    

}
public static void main (String [] args){
    claseFinal dp= new claseFinal();
    dp.setVisible(true);
    }
}
