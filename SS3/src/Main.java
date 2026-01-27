//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Object[] arrayObj;
        arrayObj = new Object[3];

        arrayObj[0] = "Hello";
        arrayObj[1]= 123;
        arrayObj[2]= true;

        String[] arrayStr = {"java", "html", "python"};


        // 1.1. Nhập số lượng n và giá trị trong mảng, in ra mảng
        int n = sc.nextInt();
        int[] arrayInt = new int[n];
        for (int i=0; i<n; i++){
            arrayInt[i] = sc.nextInt();
        }
        for (int e : arrayInt) System.out.printf(e + " ");
        /* 1.2.
        *
        * */

        // - Tìm và in các số nguyên tố
        System.out.println("\nSố nguyên tố: ");
        for (int e: arrayInt){
            int flag = 0;
            for (int i=2; i<=e; i++){
                if (e%i == 0){
                    flag++;
                }
            }
            if (flag == 1) System.out.printf(e + " ");
        }

        // - Tổng số fibonanci
        int sumFibo = 0, a, b, temp;
        for (int e: arrayInt){
            if (e == 1 || e == 2) sumFibo += e;
            else {
                a = 1;
                b = 2;
                do {
                    if (a + b == e) {
                        sumFibo += e;
                        break;
                    }
                    else {
                        temp = a + b;
                        a = b;
                        b = temp;
                    }
                }while (b<e);
            }
        }
        System.out.println("\nTổng số fibonanci: " + sumFibo);

        // - max, min
        int max = arrayInt[0], min = arrayInt[0];
        for (int x: arrayInt){
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("\nMax" + max + "\tMin" + min);

        // - Tổng giai thừa của từng phần tử
        int tongGT = 0;
        for (int e: arrayInt){
            int giaiThua = 1;
            for (int i = 2; i<=e; i++){
                giaiThua *= i;
            }
            tongGT += giaiThua;
        }
        System.out.println("Tổng giai thừa: " + tongGT);
    }
}