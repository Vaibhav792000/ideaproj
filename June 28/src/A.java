//public class A{
//    int a,b,c,d;
//        A(int a,int b,int c,int d){
//            this.a =a;
//            this.b= b;
//            this.c=c;
//            this.d=d;
//        }
//        void show(){
//            System.out.println(a+b+c+d);
//        }
//}
//------------------------------------------------------------------------
//--------using int----------------------
//public class A{
//    int add(){
//        int a = 7;
//        return a;
//    }
//}

//---------------------------------------------
//----- using int with parametrised------------------
//public class A{
//    int a;
//    int add(int a){
//        this.a =a;
//        return a;
//    }
//    void show(){
//        System.out.println(a);
//    }
//}

//---------------------------------------------------

import java.util.Scanner;
class A{
    int a,b;
    double pi = 3.14 ;
    void show(int a,int b){
        this.a = a;
        this.b = b;
    }
    double triangle(){
        return 0.5*a*b;
    }
    int rectangle(){
        return a*b;
    }
    int square(){
        return a*a;
    }
    double circle(){
        return pi*a*a;
    }
}