package javademo.designpattern.creational.prototype;

public class BlueColor  extends  Color{

    public BlueColor(){
        this.colorName="blue";
    }
    @Override
    void addColor() {
        System.out.println("Blue Color Added");
    }
}
