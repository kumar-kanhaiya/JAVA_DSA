package OOPS.Properties.Inheritance;

public class BoxWeight extends Box{
    // it access all the properties and methods of Box Class after using extends
    double weight ;
    public BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(double l , double w , double h , double weight){
        super(l ,w,h); // calling the parent class constructor
        this.weight = weight;
    }

}
