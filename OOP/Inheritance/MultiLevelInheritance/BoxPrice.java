package OOP.Inheritance.MultiLevelInheritance;

public class BoxPrice extends BoxWeight{
    int price;
    public BoxPrice(int length,int weight, int price){
        super(length,weight);
        this.price = price;
    }
}
