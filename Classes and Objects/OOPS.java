public class OOPS {
    public static void main(String[] args) {
        Pen p=new Pen();
        p.setColor("Red");
        p.setTin(5);
        System.out.println("Color: " + p.color);
        System.out.println("Tin: " + p.tin);
        System.out.println("Pen object created successfully.");
        p.color="Blue";
        p.tin=10;
        System.out.println("Updated Color: " + p.color);
        System.out.println("Updated Tin: " + p.tin);
        System.out.println("Pen object updated successfully.");
    }
}

class Pen{
    String color;
    int tin;
    void setColor(String newColor){
        color=newColor;
    }
    void setTin(int newTin){
        tin=newTin;
    }
}
