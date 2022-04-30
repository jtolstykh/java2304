import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson_3 {
    static void printInfo(int x, int y){
        System.out.println("Первое число: " + x + ", " + "Второе число: " + y);
    }
    static double threeDoubleProduct (double a, double b, double c){
        return a * b * c;

    }

    static void array (int j, int target){
        int [] ints = new int[j];
        for (int i = 0; i < ints.length; i++){
             ints [i] = i;

            if (ints [i] == target){
                System.out.println(i);

            }
        }

    }
    public static void main(String[] args) {
        printInfo(2,3);
        printInfo(25,44);

        System.out.println(threeDoubleProduct(0.001, 1000, -1.257 ));
      array(5,2);

    }
}
