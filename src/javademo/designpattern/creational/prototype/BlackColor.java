package javademo.designpattern.creational.prototype;

public class BlackColor extends  Color{

    public BlackColor(){
        this.colorName="black";
    }
    @Override
    void addColor() {
        System.out.println("black Color Added");
    }
}
