//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        A k = new A(a,b,c,d);
//       k.show();
//    }
//}
//----------------------------------------------------------------------
//public class Main{
//    public static void main(String[] args){
//        A k = new A();
//        System.out.println(k.add());
//    }
//}

//----------------------------------------------------------
//------- using int with parametrised -------------------
//public class Main{
//    public static void main(String[] args) {
//        A k = new A();
//        k.add(5);
//        k.show();
//    }
//}


//-------------------------------------------------------------


import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        A k = new A();
        k.show(x,y);
        System.out.println(k.triangle());
        System.out.println(k.rectangle());
        System.out.println(k.square());
        System.out.println(k.circle());
    }
}