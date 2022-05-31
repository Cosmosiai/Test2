package Pizza;

public class LaFinta extends Pizza{
    boolean mashrooms;

    public LaFinta(double price, int weight, boolean mashrooms) {
        super(1.5, weight);
        this.mashrooms = mashrooms;
    }

    @Override
    void bake(){
        System.out.println("Готовится Ла Финта. Ваш номер "+counter);
    }

    @Override
    void delivery(){
        System.out.println("Ваш пепперони отправлен");
        System.out.printf("Вес: %d\nЦена: %f\nНаличие грибов: %b\n",weight*500,price*weight*500,mashrooms);
    }
}
