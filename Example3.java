// this will demonstrate different data types for numbers
public class Example3 {
  public static void main(String[] args){
    int var; 
    double x;
    double y;
    float z;

    var = 10;
    x = 10.0;
    y = 10;
    z = 10;

    System.out.println("Original value of var: " + var);
    System.out.println("Original value of x: " + x);
    System.out.println("Original value of y: " + y);
    System.out.println("Original value of z: " + z);

    //divide all by 4

    var /= 4;
    x /= 4;
    y /= 4;
    z /= 4;

    System.out.println("var is now: " + var);
    System.out.println("x is now: " + x);
    System.out.println("y is now: " + y);
    System.out.println("z is now: " + z);
  }  
}