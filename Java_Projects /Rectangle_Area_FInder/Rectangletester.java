
public class Rectangletester{
     public static void main(String[] args) {
        
        Rectangle rec = new Rectangle();
        rec.setLength(10);
        rec.setWidth(4);

        System.out.println("Length = " + rec.getLength()+" Width = " + rec.getWidth());
        System.out.println("Area:"+ rec.getArea());
        System.out.println("Perimeter of Rectangle: " + rec.getPerimeter());

        Rectangle rec2 = new Rectangle();
        rec2.setLength(-1);
        rec2.setWidth(4);

        System.out.println("Length = " + rec2.getLength()+" Width = " + rec2.getWidth());
        System.out.println("Area:"+ rec2.getArea());
        System.out.println("Perimeter of Rectangle: " + rec2.getPerimeter());

        System.out.println("Test Two could not be run.");
        System.out.println("Please enter valid Values");






    }

    
    }
