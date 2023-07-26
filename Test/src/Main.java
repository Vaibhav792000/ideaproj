//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//=============== Customer/ Retailer================================================================

//        System.out.println("Press R for Retailer and C for customer");
//        String user = sc.nextLine();
//        int price = 10;
//
//        if (user.equalsIgnoreCase("R")) {
//            System.out.println("Enter No. of Pieces");
//            int pieces = sc.nextInt();
//            int amount = 0;
//            double discount = 0;
//            double disc = 0.0;
//
//            if (pieces >= 1 && pieces <= 15) {
//                amount = pieces * price;
//                discount = 15.0;
//                disc = (amount * discount) / 100;
//            } else if (pieces >= 16 && pieces <= 30) {
//                amount = pieces * price;
//                discount = 30.0;
//                disc = (amount * discount) / 100;
//            } else if (pieces >= 31 && pieces <= 50) {
//                amount = pieces * price;
//                discount = 50.0;
//                disc = (amount * discount) / 100;
//            }
//            double total_pay = amount - disc;
//            System.out.println("Retailer Name: Ashish Kumar");
//            System.out.println("Pieces: " + pieces);
//            System.out.println("Amount: " + amount);
//            System.out.println("Discount: " + discount + "%");
//            System.out.println("Total Pay: " + total_pay);
//        }
//        else if (user.equalsIgnoreCase("C")) {
//
//                System.out.println("Enter Customer Name: ");
//                String name = sc.nextLine();
//                System.out.println("Enter Amount:");
//                double amount = sc.nextDouble();
//                double discount = 0.0;
//                double disc = 0.0;
//
//                if (amount >= 100 && amount <= 1000) {
//                    discount = 15.0;
//                    disc = (amount * discount) / 100;
//                } else if (amount > 1000 && amount <= 2000) {
//                    discount = 10.0;
//                    disc = (amount * discount) / 100;
//                } else if (amount > 2000 && amount <= 3000) {
//                    discount = 15.0;
//                    disc = (amount * discount) / 100;
//                }
//                double total_pay = amount - disc;
//                System.out.println("Customer Name: " + name);
//                System.out.println("Amount: " + amount);
//                System.out.println("Discount: " + discount + "%");
//                System.out.println("Total Pay: " + total_pay);
//            }
//        else {
//            System.out.println("not possible");
//        }
//        }

//================= 546 - 657 ================================================
//        System.out.print("Enter a number: ");
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


//=============== prime number without(Flag/count) ====================================
//        System.out.println("Prime numbers from 1 to 100:");
//
//        for (int num = 0; num <= 100; num++) {
//            boolean isPrime = true;
//
//            for (int i = 2; i <= Math.sqrt(number); i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                System.out.println(number);
//            }
//        }


//---------------------------------------------------------------------------------------------------------------------------------
// 16th june 2023

//        int a= 2;
//        int b= 3 ;
//        a= a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a);
//        System.out.println(b);


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


//        int num = sc.nextInt();
//        int rem;
//        int result =0;
//        int original_num = num;
//        while(num > 0){
//            rem = num%10;
//            result = result*10+rem;
//            num = num/10;
//        }
//        if(result == original_num){
//            System.out.println(original_num + "PALINDROME number.");
//        }
//        else{
//            System.out.println(original_num + "NOT PALINDROME number.");
//        }

//        int rows = sc.nextInt();
//        int num = 1;
//        for(int i = 1; i<=rows; i++){
//            int x = num;
//            for (int j = 1; j <= rows; j++){
//                System.out.print(x + " ");
//                x+=2;
//            }
//            num+=2;
//            System.out.println();
//
//        }


//        int rows = sc.nextInt();
//        for(int i = 0; i < rows; i++){
//            for (int j = 1; j <= rows; j++){
//                System.out.print(i+j + " ");
//            }
//            System.out.println();
//        }


//        int rows = sc.nextInt();
//        int num = 1;
//        for(int i = 1; i <= rows; i++){
//            num = i;
//            for(int j = 1; j <= rows; j++){
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println();
//        }
//    }
//}
