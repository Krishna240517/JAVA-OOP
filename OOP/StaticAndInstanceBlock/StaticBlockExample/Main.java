package OOP.StaticAndInstanceBlock.StaticBlockExample;

public class Main{
    public static void main(String[] args) {
        Taxation t = new Taxation(50000);
        System.out.println(t.calculateFinalAmount());
    }
}
