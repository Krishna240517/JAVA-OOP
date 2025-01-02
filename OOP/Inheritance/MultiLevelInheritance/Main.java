package OOP.Inheritance.MultiLevelInheritance;


public class Main {
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(5,20);
        System.out.println(b1.weight);//20
        System.out.println(b1.length);//5



        BoxPrice b2 = new BoxPrice(15,26,2000);
        System.out.println(b2.length);
        System.out.println(b2.weight);
        System.out.println(b2.price);




    }
}
