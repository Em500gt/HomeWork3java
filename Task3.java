import java.util.ArrayList;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее
// ариф из этого списка.

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        for(int i = 0; i < 51; i++) num.add(i);

        System.out.println(num + "\n");

        int min = num.get(0);
        int max = num.get(0);
        float middle = 0;

        for(int i = 0; i < num.size(); i++){
            if(min > num.get(i)) min = num.get(i);
            if(max < num.get(i)) max = num.get(i);
            middle += num.get(i);
        }

        System.out.println("Минимальное -> " + min + "\nМаксимальное -> " + max);
        System.out.println("Среднее -> " + middle / num.size());
    }
    
}