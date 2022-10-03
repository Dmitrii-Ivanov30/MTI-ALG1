import java.util.HashMap;
import java.util.Scanner;

public class FibonacciFunkce {
    // Vytvořil jsem fibonacci funkce, která použivá cache array pro rychlejší kompilaci programu
    public static long fib(int num, HashMap<Integer, Long> cache) {

        if (cache.containsKey(num)) {
            return cache.get(num);
        } else if (num <= 2) {
            return 1;
        } else {
            cache.put(num, fib(num - 1, cache) + fib(num - 2, cache));
            return cache.get(num);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte číslo");
        int number = sc.nextInt();
        long result = fib(number, new HashMap<>());
        System.out.printf("Vysledek je %d", result);
    }

}
