import java.util.Random;

public class Dicegame {
    public static void main(String[] args) {
        for (int i = 1; i <=36000; i ++){
            int dice1 = (int) (6*Math.random()+1);
        int dice2 = (int) (6*Math.random()+1);
        int sum = dice1 + dice2;  
              
        
        System.out.println("dice 1: " + dice1);
        System.out.println("dice 2: " + dice2);
        System.out.println( "The sum is: " + sum);
}
        
    }
    
}
