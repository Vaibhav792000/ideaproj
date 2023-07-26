import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//============ Star Pattern 1 ==========================

//        int rows = 4;
//        int i,j;
//        for (i = 1; i <= rows; i++) {
//            for (j = 1; j <= rows; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//============= Star Pattern 2 ===========================

//        int rows = 4;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//============== Star Pattern 3 ======================================

//        int rows = 4;
//        for (int i = rows; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//=========== Star pattern 4(2+3) ======================================

//        int rows = 4;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= rows; i++) {
//            for (int j = rows; j >= i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//============= Star Pattern 5 (same 4) ===============================

//        int rows = 4;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 3; j >= i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//------------- using only 2 for loops -----------------------
//        int rows = 7;
//        int mid = (rows + 1) / 2;
//        int a;
//        for (int i = 1; i<= rows; i++){
//            if (i <= mid){
//               a = i;
//            }
//            else{
//                a = (rows - i) + 1;
//            }
//            for(int j = 1; j <= a; j++){
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }


//==================== 1-10 =============================

//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }


//=================== 10 - 1 ============================

//        for (int i = 10; i >= 1; i--){
//            System.out.println(i);
//        }


//============ table from user input ====================

//        System.out.print("Enter a number: ");
//        int a = sc.nextInt();
//        for (int i = 1; i<=10; i++){
//            int c = a * i;
//            System.out.println(c);
//        }


//=============== Even no. 1-100 =======================

//        for (int i = 1; i <= 100; i++){
//            if (i%2==0){
//                System.out.println(i);
//            }
//        }


//================= 1-100 ==============================

//        for (int i = 1; i <= 1000; i++){
//                System.out.println(i);
//        }


//=============== 1000-500 =============================

//        for (int i = 1000; i >= 500; i--){
//            System.out.println(i);
//        }


//============= table 2-10 ============================

//        System.out.print("Enter a number: ");
//        int a = sc.nextInt();
//        for (int i = a; i<=10; i++) {
//            System.out.println("Table of: " + i);
//            for (int j = 1; j <= 10; j++){
//                int c = i * j;
//                System.out.println(c);
//            }
//        }


//=============== Factorial ===========================

//        System.out.print("Enter a number: ");
//        int a = sc.nextInt();
//        long fact = 1;
//        for (int i =a; i>0; i--){
//            fact = fact * i;
//        }
//        System.out.println(fact);


//============== Sum 1-10 =============================


//        int sum = 0;
//        for (int i = 1; i<=10; i++){
//            sum= sum + i;
//        }
//        System.out.println("Sum of digits from 1 to 10 is: " + sum);


//============== Fibonacci Series ===========================

//        System.out.print("Enter the number of terms: ");
//        int terms = sc.nextInt();
//        int first = 0;
//        int second = 1;
//        System.out.print("Fibonacci series up to " + terms + " terms: " + first + ", " + second);
//        for (int i = 3; i <= terms; i++) {
//            int nextTerm = first + second;
//            System.out.print(", " + nextTerm);
//            first = second;
//            second = nextTerm;
//        }
    }
}
