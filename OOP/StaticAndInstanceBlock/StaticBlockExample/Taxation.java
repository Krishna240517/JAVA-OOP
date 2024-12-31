package OOP.StaticAndInstanceBlock.StaticBlockExample;

public class Taxation {
    int price;
    static int taxPercentage;

    static{
        taxPercentage = 18;
    }

    public Taxation(int price){
        this.price = price;
    }

    public double calculateFinalAmount(){
        return price - (price * 0.18);
    }
}
