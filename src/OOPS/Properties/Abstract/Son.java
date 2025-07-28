package OOPS.Properties.Abstract;

public class Son extends Parent{

    @Override
    void career(String name) {
        System.out.println(name+" is my name ");
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + "she is " + age + "years old ");
    }
}
