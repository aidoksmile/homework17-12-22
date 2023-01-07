// Определить является ли список знакочередующимся? (без массивов)

import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
    
            LinkedList<Integer> integerLinkedList = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);
            int a, b;
            boolean sign = true;
            
            System.out.println("Input lists lenght: ");
            int n = scanner.nextInt();
            
            System.out.println("Input lists elements: ");
            a = scanner.nextInt();
            
            integerLinkedList.add(a);
            
            for (int i = 1; i <= n - 1; i++) {
                b = scanner.nextInt();
                integerLinkedList.add(b);
                
                if (((a > 0) && ((b * (-1)) < 0)) || ((a < 0) && ((b * (-1)) > 0))) {
                    sign = false;
                }
                a = b;
            }
            System.out.print(sign);
        }
    }