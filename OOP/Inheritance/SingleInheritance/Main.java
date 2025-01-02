public class Main {
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(10,5,50);
        System.out.println(b1.weight); //50
        System.out.println(b1.length); //10
        System.out.println(b1.breadth);//5

        Box b2 = new BoxWeight(15,10,20);
        // System.out.println(b2.weight); error
        System.out.println(b2.length); //10
        System.out.println(b2.breadth);//5

        
        // BoxWeight b3 = new Box(20,15); error
    }
}
