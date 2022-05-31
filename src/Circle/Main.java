package Circle;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        double b[]=new double[10];
        int counter = 0;
        for (int i = 0; i<10; i++){
            b[i]= Math.pow((i+1),2) *3.14;
            if (b[i]*100%3==0){
                counter++;
            }
        }
        System.out.println(Arrays.toString(b));
        System.out.println(counter);
    }
}
