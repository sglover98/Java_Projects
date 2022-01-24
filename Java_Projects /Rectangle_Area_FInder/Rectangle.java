
public class Rectangle {
    
    private int width=0;
    private int length=0;

    public Rectangle(int width, int length){
        setWidth(width);
        setLength(length);
    }
    public Rectangle(Class<Integer> class1, Class<Integer> class2) {
    }
    public Rectangle() {
    }
    void setWidth(int width){
        this.width = width;
    }
    void setLength(int length){
        this.length = length;
    }

    int getLength(){
        return this.length;
    }

    int getWidth(){
        return this.width;

    }

    int getPerimeter(){
        return 2*getLength() + 2*getWidth();

    }

    int getArea(){
        return getWidth()*getLength();
    }

    private boolean Width(int width){
        if (width > 0 && width <= 20){
            return true;

        }
        else { System.out.println("hihihihi");
    return false; }
    }




}

