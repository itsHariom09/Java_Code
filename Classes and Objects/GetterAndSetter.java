public class GetterAndSetter {
    public static void main(String[] args) {
        Pen p=new Pen();
        p.setColor("Red");
        p.setTip(5);
        System.out.println("Color of pen is: "+p.getColor());
        System.out.println("Tip of pen is: "+p.getTip());
    }
}

class Pen{
    private String color;
    private int tip;

    void setColor(String color){
        this.color=color;
    }
    String getColor(){
        return this.color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
    int getTip(){
        return this.tip;
    }
}