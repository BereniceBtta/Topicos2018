
public class Rectangulo extends Ejercicio13
{
    private static double base=100;
    private static double altura=50;
    private double area=0;
    private double perimetro=0;
    
    public void setBase(double base){
        this.base=base;
    }
    public double getBase(){
        return base;
    }
     public void setAltura(double altura){
        this.altura=altura;
        
    }
    public double getAltura(){
        return altura;
    }
    public double getArea(){
        double area=base*altura;
        return area;
    }
    public double getPerimetro(){
        double perimetro=(2*base)+(2*altura);
        return perimetro;
    }
    
    public  void cuadrar(){
       altura=base;
    }
}
