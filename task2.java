// Дана последовательность целых чисел, оканчивающаяся нулем. 
// Найти сумму положительных чисел, после которых следует отрицательное число
package homework.homework_java_1;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("type numbers by one using enter:");
        boolean flag = true;
        int temp = 0;
        int sum = 0;
        while (flag) {
            int num = iScanner.nextInt();
            if (num > 0) temp = num;
            else if (num < 0) {
                sum += temp;
                temp = 0;
            }
            else if (num == 0) flag = false;
        }
        iScanner.close();
        System.out.printf("answer is %d\n", sum);
    }
}
