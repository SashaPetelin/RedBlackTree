import java.util.Random;
import java.util.Scanner;

public class RBTRealize {
    private static Random random = new Random();

    public static void main(String[] args) {

        RedBlackTree<Integer> rbtree;
        int nums;
        int sum;

        Scanner scan = new Scanner(System.in);

        char ch;
        do {
            System.out.println("\nСтарт!\n");
            rbtree = new RedBlackTree<>();

            sum = random.nextInt(11);

            System.out.println(" Количество чисел = " + sum + "");
            for (int i = 0; i < sum; i++) {
                nums = random.nextInt(30);
                System.out.println("Добавили " + nums + " к дереву");
                rbtree.add(nums);
            }
            System.out.println("\nПовторить? (введите y или n)");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}
