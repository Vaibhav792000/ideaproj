//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//=========== max b/w 2 ===========

//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        if(a>b){
//            System.out.println("a is Max");
//        }
//        else {
//            System.out.println("b is Max");
//        }

//=========== max b/w 3 ============

//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//        if(a>b && a>c){
//            System.out.println("a is Max");
//        }
//        else if(b>c){
//            System.out.println("b is Max");
//        }
//        else{
//            System.out.println("C is Max");
//        }

//=========== max b/w 10 ===============
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//        int d= sc.nextInt();
//        int e= sc.nextInt();
//        int f= sc.nextInt();
//        int g= sc.nextInt();
//        int h= sc.nextInt();
//        int i= sc.nextInt();
//        int j= sc.nextInt();
//        if(a>b && a>c && a>d && a>e && a>f && a>g && a>h && a>i && a>j){
//            System.out.println("a is Max");
//        }
//        else if(b>c && b>d && b>e && b>f && b>g && b>h && b>i && b>j){
//            System.out.println("b is Max");
//        }
//        else if(c>d && c>e && c>f && c>g && c>h && c>i && c>j){
//            System.out.println("c is Max");
//        }
//        else if(d>e && d>f && d>g && d>h && d>i && d>j){
//            System.out.println("d is Max");
//        }
//        else if(e>f && e>g && e>h && e>i && e>j){
//            System.out.println("e is Max");
//        }
//        else if(f>g && f>h && f>i && f>j){
//            System.out.println("f is Max");
//        }
//        else if(g>h && g>i && g>j){
//            System.out.println("g is Max");
//        }
//        else if(h>i && h>j){
//            System.out.println("h is Max");
//        }
//        else if(i>j){
//            System.out.println("i is Max");
//        }
//        else {
//            System.out.println("j is max");
//        }


//============ char input ============
//        char a='f';
//        char b='m';
//        char d = sc. next().charAt(0);
//        if(d==a){
//            System.out.println("Female");
//        }
//        else if(d==b){
//            System.out.println("Male");
//        }
//        else{
//            System.out.println("Other");
//        }


//=========== divisible by 5 ===========
//        int num = sc.nextInt();
//        if (num % 5 == 0) {
//            System.out.println(num + " is divisible by 5.");
//        }
//        else {
//            System.out.println(num + " is not divisible by 5.");
//        }


//=========== divisible by 5 or 11 or both===========
//        int num = sc.nextInt();
//        if (num % 5 == 0 && num % 11 == 0) {
//            System.out.println(num + " is divisible by both 5 and 11.");
//        } else if (num % 5 == 0) {
//            System.out.println(num + " is divisible by 5.");
//        } else if (num % 11 == 0) {
//            System.out.println(num + " is divisible by 11.");
//        } else {
//            System.out.println(num + " is not divisible by 5 or 11.");
//        }


//============== +ve or -ve num ===========
//        int num = sc.nextInt();
//        if(num>0){
//            System.out.println(num +" is Positive Number");
//        }
//        else if(num<0){
//            System.out.println(num + " is  Negative Number");
//        }
//        else {
//            System.out.println("This is Zero");
//        }


//============= Vowel/ consonant ===========
//        char ch = sc.next().charAt(0);
//        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//            System.out.println(ch + " is vowel");
//        }
//        else{
//            System.out.println(ch + " is Consonant");
//        }


//============ UPPERCASE / lowercase ==============
//        char ch = sc.next().charAt(0);
//        if(ch>='A' && ch<='Z'){
//            System.out.println("UPPERCASE");
//        }
//        else if(ch>='a' && ch<='z'){
//            System.out.println("lowercase");
//        }
//        else{
//            System.out.println("not a character");
//        }


//============ Palindrome ==============
//        int original, rem,rev=0;
//        int num= sc.nextInt();
//        original = num;
//        while(num>0){
//            rem=num%10;
//            rev=rem+(rev*10);
//            num= num/10;
//        }
//        if(rev==original){
//            System.out.println("is Palindrome");
//        }
//        else{
//            System.out.println("Not Palindrome");
//        }


//============= Armstrong ===============
//        int original, rem,rev=0;
//        int num= sc.nextInt();
//        original = num;
//        while(num>0){
//            rem=num%10;
//            rev=(rem*rem*rem)+ rev;
//            num= num/10;
//        }
//        if(rev==original){
//            System.out.println("is Armstrong");
//        }
//        else{
//            System.out.println("Not Armstrong");
//        }
//    }
//}

