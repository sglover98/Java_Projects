import java.util.Scanner;

public class Project4p2 {
   
 
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter radius: ");
        
        double radius = Scan.nextInt();

        System.out.println(" The area of the cirlce is "+ circleA(radius));


    }
   
    static double circleA(double radius){
        return(Math.PI*radius*radius);
    }

}
