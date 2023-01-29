import java.util.ArrayList;
// Пусть дан произвольный список целых чисел, удалить из него четные числа
/**
 * Task2
 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        for(int i = 0; i < 101; i++) num.add(i);

        System.out.println(num + "\n");

        for(int i = 0; i < num.size(); i++){
            if(num.get(i) % 2 == 0) num.remove(i);
        }

        System.out.println(num);
    }
    
}