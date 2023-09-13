class Product{
    public int product(int x,int y){
        return x*y;
    }

    //Method Overloading
    public int product(int x,int y,int z){
        return x*y*z;
    }

    //Method Overloading
    public double product(double x, double y){
        return x*y;
    }
}
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println(p1.product(2,3));
        System.out.println(p1.product(2,3,4));
        System.out.println(p1.product(2.0,3.0));
    }
}