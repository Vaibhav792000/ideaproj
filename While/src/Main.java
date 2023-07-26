//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//============== 1- 10 =========================================

//        int a = sc.nextInt();
//        while (a <= 10) {
//            System.out.println(a);
//            a++;
//        }


//======== Table of 2 ===========================================

//        int b = sc.nextInt();
//
//        while(b <= 10){
//            int c = 2 * b;
//            System.out.println(c);
//            b++;
//        }


//======== user input table ==================================
//        int a = sc.nextInt();
//        int b = 1;
//
//        while(b<=10){
//            int c=a*b;
//            System.out.println(c);
//            b++;
//        }


//========== 10 to 1 ============================================

//        int a = sc.nextInt();
//        while(a>=1){
//            System.out.println(a);
//            a--;
//        }


//========= 1 to 100 ============================================

//        int a = sc.nextInt();
//        while(a<=100){
//            System.out.println(a);
//            a++;
//        }


//======= 100 to 1 ================================================

//        int a = sc.nextInt();
//        while(a>=1){
//            System.out.println(a);
//            a--;
//        }


//======= 50 to 100 ================================================

//        int a = sc.nextInt();
//        while(a<=100){
//            System.out.println(a);
//            a++;
//        }


//=========== 1000 to 50 ======================================

//        int a = sc.nextInt();
//        while(a>=50){
//            System.out.println(a);
//            a--;
//        }


//========= 1 to 10 (SUM) =======================================

//        int a = sc.nextInt();
//        int sum = 0;
//        while(a<=10){
//            System.out.println(a);
//            sum = sum+a;
//            a++;
//        }
//        System.out.println("Sum: " + sum);


//======== 1 to 100 even no. =====================================

//        int a = sc.nextInt();
//        while(a<=100){
//            if(a %2==0){
//                System.out.println(a);
//            }
//            a++;
//        }


//======== 1 to 100 odd no. =====================================

//        int a = sc.nextInt();
//        while(a<=100){
//            System.out.println(a);
//            a+=2;
//        }


//========== Reverse Number======================================
//----------------user input---------------
//        System.out.print("Enter A number to reverse: ");
//        int num = sc.nextInt();
//        int reverse = 0;
//
//        System.out.println("Original Number: " + num);
//
//        while(num > 0) {
//            int digit = num % 10;
//            reverse = reverse * 10 + digit;
//            num /= 10;
//        }
//
//        System.out.println("Reversed Number: " + reverse);


//----------------predefined input---------------

//        int num = 123;
//        int reverse = 0;
//
//        System.out.println("Original Number: " + num);
//
//        while(num > 0) {
//            int digit = num % 10;
//            reverse = reverse * 10 + digit;
//            num /= 10;
//        }
//
//        System.out.println("Reversed Number: " + reverse);


//=========== table from 2 to 10 ===================

//        int a = sc.nextInt();
//        while (a <= 10) {
//            System.out.println("Table Of " + a);
//            int b = 1;
//            while (b <= 10) {
//                int c = a * b;
//                System.out.println(c);
//                b++;
//            }
//            a++;
//        }


//================= Armstrong Number=================================

//        System.out.println("Enter number to check if ARMSTRONG");
//        int num = sc.nextInt();
//        int rem;
//        int result =0;
//        int original_num = num;
//        while(num > 0){
//            rem = num % 10;
//            result = result + rem*rem*rem;
//            num = num / 10;
//        }
//        if(result == original_num){
//            System.out.println(original_num + " is an ARMSTRONG number.");
//        }
//        else{
//            System.out.println(original_num + " is NOT an ARMSTRONG number.");
//        }


//===========user input armstrong range===========================================

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Range:");
//        System.out.print("Start: ");
//        int start = sc.nextInt();
//        System.out.print("End: ");
//        int end = sc.nextInt();
//        for (int num = start; num <= end; num++) {
//            int original_num = num;
//            int rem;
//            int result = 0;
//            int temp = num;
//            while (temp > 0) {
//                rem = temp % 10;
//                result = result + rem * rem * rem;
//                temp = temp / 10;
//            }
//            if (result == original_num) {
//                System.out.println(original_num + " is an ARMSTRONG number.");
//            }
//        }
//    }
//}


//================== Palindrome ==================================================

//        System.out.println("Enter number to check if PALINDROME");
//        int num = sc.nextInt();
//        int rem;
//        int result =0;
//        int original_num = num;
//        while(num > 0){
//            rem = num % 10;
//            result = result * 10 + rem;
//            num = num / 10;
//        }
//        if(result == original_num){
//            System.out.println(original_num + " is an PALINDROME number.");
//        }
//        else{
//            System.out.println(original_num + " is NOT an PALINDROME number.");
//        }


//============== 132 -> 342 =====================================================

//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//        int rem;
//        int rev = 0;
//        while (num > 0) {
//            rem = num % 10;
//            rev = (rev * 10 + rem) + 1;
//            num = num / 10;
//        }
//        System.out.println("input: 132");
//        System.out.println("output: " + rev);


//=============== count digit in input =============================

//        int num = sc.nextInt();
//        int count = 0;
//
//        while(num > 0){
//            num = num / 10;
//            count++;
//        }
//        System.out.println("this input has " + count + " digits");

//============= Star Pattern 1 =========================================
//------------------ while --------------------------------------
//        int rows = 4;
//        int i = 1;
//
//        while (i <= rows) {
//            int j = 1;
//            while (j <= rows) {
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//----------------- for -----------------

//        int rows = 4;
//        int i,j;
//        for (i = 1; i <= rows; i++) {
//            for (j = 1; j <= rows; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//=========== Star Pattern 2 =========================================
//------------- for ------------------------
//        int rows = 4;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//-------------- while -----------------------------------
//        int rows = 4;
//        int i = 1;
//        while (i <= rows) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//============== Star Pattern 3 ======================================
//----------------- for -----------------------
//        int rows = 4;
//        for (int i = rows; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//----------- while ------------------
//        int rows = 4;
//        int i = rows;
//
//        while (i >= 1) {
//            int j = 1; // Column counter
//
//            while (j <= i) {
//                System.out.print("* ");
//                j++;
//            }
//
//            System.out.println();
//            i--;
//        }


// ============= 123 -> 234 ==========================================

//        System.out.println("Enter a number: 123");
//        int num = sc.nextInt();
//        int rem;
//        int rev = 0;
//        while (num > 0) {
//            rem = num % 10;
//            rev = (rev * 10 + rem) + 1;
//            num = num / 10;
//        }
//        int original = rev;
//        int re = 0;
//        while(original>0){
//            rem = original % 10;
//            re = re * 10 + rem;
//            original = original / 10;
//        }
//       System.out.println("output: " + re);


//============== value(34-67)(even)(sum) =========================================

//        System.out.println("Enter Number 34:");
//        int a = sc.nextInt();
//        int original = a;
//        int pure = a;
//        int sum = 0;
//        while(a<=67){
//            System.out.println(a);
//            a++;
//        }
//        System.out.println("Even number from 34 to 67:");
//        while(original <= 67){
//
//            if(original % 2==0){
//                System.out.println(original);
//            }
//            original++;
//        }
//        System.out.println("Sum of even number from 34 to 67:");
//        while(pure <= 67){
//
//            if(pure % 2==0){
//                sum = sum + pure;
//            }
//            pure++;
//        }
//        System.out.println(sum);


//=============== First and last digit =====================================

//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//
//        int first = 0;
//        int last = num % 10;
//        while (num > 0) {
//            first = num % 10;
//            num = num / 10;
//        }
//        System.out.println("First Digit: " + first);
//        System.out.println("Last Digit: " + last);
//    }
//}

//-------------------------------------ARRAY---------------------------------------------------
//-------------------------------------ARRAY---------------------------------------------------
//-------------------------------------ARRAY---------------------------------------------------
//-------------------------------------ARRAY---------------------------------------------------
//-------------------------------------ARRAY---------------------------------------------------

//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of Array: ");
//        int size  = sc.nextInt();
//        int[] a = new int[size];
//        for(int i = 0; i < a.length; i++){
//            System.out.println("Enter Values in array a : ");
//            a[i] = sc.nextInt();
//        }
//        System.out.print("Enter number to check if it is present in array or not: ");
//        int user = sc.nextInt();
//        for(int i =0; i<a.length; i++){
//            if (user == a[i]){
//                System.out.println(user + " is present in array");
//            }
//            else{
//                System.out.println(user + " is not present in array");
//                break;
//            }
//        }
//    }
//}


//import java.util.Scanner;
//class Main {
//    public static void array(int a[]){
//        //output bubble sort
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        System.out.println("New Array: ");
//        for (int i = 1; i < a.length-1; i++) {
//            if (a[i] == a[i + 1]) {
//                a[i] = 0;
//                continue;
//            }
//            System.out.println(a[i]);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of Array: ");
//        int size  = sc.nextInt();
//        int[] a = new int[size];
//        //input
//        for(int i = 0; i < a.length; i++){
//            System.out.println("Enter Values in array a : ");
//            a[i] = sc.nextInt();
//        }
//        //output
//        for (int i = 0; i < a.length; i++) {
//            //Bubble sort
//            for (int j = 0; j < a.length - i - 1; j++) {
//                if (a[j] > a[j + 1]) {
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            }
//        }
//        array(a);
//    }
//}


//=================================================================================================
//public class Main{
//    public static void main(String[] args) {
//        int[][] a = {{21, 42, 33}, {16, 12, 14}};
//        //row
//        for (int i = 0; i < a.length; i++) {
//            //Column
//            for (int j = 0; j < a[0].length; j++) {
//                System.out.print(a[i][j] + a[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//==================================================================================================
//public class Main{
//    public static void main(String[] args) {
//        int[][] a = {{1, 2, 3}, {1, 2, 3}};
//        int[][] b = {{4, 5, 6}, {4, 5, 6}};
//        //row
//        for (int i = 0; i < a.length; i++) {
////            //Column
//            for (int j = 0; j < a[0].length; j++) {
//                System.out.print(a[i][j] + b[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}


















//=======================================================================================
//-------------user input reversed number---------------------

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int rem;
//        int result = 0;
//        while (num>0){
//            rem = num%10;
//            result = result *10 + rem;
//            num = num/10;
//        }
//        System.out.println(result);
//    }
//}
//---------------------------------------------------------------------------------
//===========user input armstrong range===========================================

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Range:");
//        System.out.print("Start: ");
//        int start = sc.nextInt();
//        System.out.print("End: ");
//        int end = sc.nextInt();
//        for (int num = start; num <= end; num++) {
//            int original_num = num;
//            int rem;
//            int result = 0;
//            int temp = num;
//            while (temp > 0) {
//                rem = temp % 10;
//                result = result + rem * rem * rem;
//                temp = temp / 10;
//            }
//            if (result == original_num) {
//                System.out.println(original_num + " is an ARMSTRONG number.");
//            }
//        }
//    }
//}
//================================================================================
//---------------user input palindrome----------------------------

//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int rev;
//        int result = 0;
//        int original = num;
//        while(num>0){
//            rev = num%10;
//            result = result *10+ rev;
//            num = num/10;
//        }
//        System.out.println("Result: " + result);
//        if (result == original){
//            System.out.println("Palindrome Hai Ye");
//        }
//        else{
//            System.out.println("Nhi Hai Ye Palindrome");
//        }
//    }
//}
//===========================================================================
//-------------fibonacci series---------------------
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter range: ");
//        int range = sc.nextInt();
//        System.out.print("Enter First Number: ");
//        int first_num = sc.nextInt();
//        System.out.print("Enter Second Number: ");
//        int second_num = sc.nextInt();
//        int third_num;
//        System.out.print(first_num + ", " + second_num);
//        for (int i = 3; i<= range; i++){
//            third_num = first_num + second_num;
//            System.out.print(", " + third_num);
//            first_num = second_num;
//            second_num = third_num;
//        }
//    }
//}
//=====================================================================
//----------user input prime number range-----------------
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Range: ");
//        int range = sc.nextInt();
//        System.out.println("The prime numbers in between the range 1 to " + range);
//        int num;
//
//        for (num = 1; num <= range; num++) {
//            int count = 0;
//            for (int i = 2; i <= num / 2; i++) {
//                if (num % i == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0 && num != 1)
//                System.out.println(num);
//        }
//    }
//}
//=====================================================================================
//-------------------prime number------------------
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 2;
        while (num >= n){
            if(num % 2 == 0){
                System.out.println("Not Prime");
                break;
            }
            if(num-1 == n){
                System.out.println("Prime");
            }
            n++;
        }
    }
}