package Pizza;

public class Pepperony extends Pizza{
    boolean spicy;

    public Pepperony(double price, int weight, boolean spicy) {
        super(1, weight);
        this.spicy = spicy;
    }

    @Override
    void bake(){
        System.out.println("Готовится пепперони. Ваш номер "+counter);
    }

    @Override
    void delivery(){
        System.out.println("Ваш пепперони отправлен");
        System.out.printf("Вес: %d\nЦена: %f\nНаличие остроты: %b\n",weight*500,price*weight*500,spicy);
    }

}
