package Pizza;

import java.util.Scanner;

public abstract class Pizza {
    double price;
    int weight;
    static int counter;

    Scanner a = new Scanner(System.in);

    void bake(){
        counter++;
        System.out.println("готовится пицца номер "+counter);
    }
    void delivery(){
        System.out.println("пицца номер "+counter+" отправлена");
        System.out.printf("Вес: %d\nЦена: %f\n ",weight,price);
    }

    int choosePizza(int weight){
        while (true){
            weight = a.nextInt();
            if (weight == 1||weight == 2||weight == 3){
                break;
            }
            else {
                System.out.println("Вы ошиблись");
            }
        }
        return weight;
    }

    public Pizza(double price, int weight) {
        this.price = price;
        this.weight = weight;
    }

}

