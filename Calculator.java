import java.util.Date;

public class Calculator {
    private double real;
    private double imaginary;

    public Calculator(double r, double i){
        real = r;
        imaginary = i;
    }


    public double getReal(){
        return real;
    }

    public void setReal(double real) {
        this.real = real;
        }

    public double getImaginary(){
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
        }
        

    public void add(Calculator c){
        real += c.real;
        imaginary += c.imaginary;
    }

    public void subtract(Calculator c){
        real -= c.real;
        imaginary -= c.imaginary;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator(5, -6);
        Calculator c2 = new Calculator(-2, 4);
        
        System.out.println("c1= " + c1.getReal() + " + " + c1.getImaginary() + "i");
        System.out.println("c2= " + c2.getReal() + " + " + c2.getImaginary() + "i");
        
        c1.add(c2);
        System.out.println("add = " + c1.getReal() + " + " + c1.getImaginary() + "i");
        
        c1.subtract(c2);
        System.out.println("subtract = " +c1.getReal() + " + " + c1.getImaginary() + "i");
        
        
       
        logAction("Выполнены математические операции", new Date());
        }
        
   
        public static void logAction(String message, Date date) {
  
        }
    }