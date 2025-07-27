package OOPS.Properties.Polymorphism;

public class Main {
    // poly means many
    // morphism means ways to represent

    // types
    //1 compile time polymorphism / static polymorphism achieved by overloading via method overloading
    // 2 Dynamic polymorphism   / runtime achieved by method overriding .
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        shape.area();
        Circle circle = new Circle();
        circle.area();
    }
}
