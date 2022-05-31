package Pizza;

public class Margarita extends Pizza{
    boolean meet;

    public Margarita(int price, int weight, boolean meet) {
        super(1.2, weight);
        this.meet = meet;
    }
    @Override
    void bake(){
        System.out.println("Готовится маргарита. Ваш номер "+counter);
    }

    @Override
    void delivery(){
        System.out.println("Ваш пепперони отправлен");
        System.out.printf("Вес: %d\nЦена: %f\nНаличие мяса: %b\n",weight*500,price*weight*500,meet);
    }
}
