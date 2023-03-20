/* Пусть дан произвольный список целых чисел,
удалить из него чётные числа*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;



public class task2 {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
        }

        System.out.printf("Текущий список %s \n", list1);

        for (Iterator<Integer> iterator = list1.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
       
        System.out.printf("Список с удаленными четными числами %s", list1);
    }
}
    