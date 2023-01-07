// Вывести список на экран в перевернутом виде (без массивов)
// Пример:
// 1 -> 2->3->4
// Вывод:
// 4->3->2->1

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input lists lenght: ");
        int n = scanner.nextInt();
        
        System.out.println("Input lists elements: ");
        
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(scanner.nextInt());
        }
        Stack<Integer> st = new Stack<>();
        for (var listValue : integerLinkedList) {
            st.push(listValue);
        }
        System.out.print("result = ");
        for (int i = 0; i < integerLinkedList.size(); i++) {
            System.out.print(st.pop() + " ");
        }
    }
}