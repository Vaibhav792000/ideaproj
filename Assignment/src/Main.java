//class Stationary {
//    void S() {
//        System.out.println("This Is Stationary");
//    }
//}
//class Pencil extends Stationary{
//    void P(){
//        System.out.println("This IS Pencil");
//    }
//}
//class Pen extends Stationary{
//    void pen(){
//        System.out.println("This IS Pen");
//    }
//}
//class Erasor extends Stationary{
//    void E(){
//        System.out.println("This IS Erasor");
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Pencil p = new Pencil();
//        p.S();
//        p.P();
//        Pen pe = new Pen();
//        pe.S();
//        pe.pen();
//        Erasor e = new Erasor();
//        e.S();
//        e.E();
//
//    }
//}



////1)  Cat
////        |
////        \/
////        babycat
//
//class Cat{
//    void Cat(){
//        System.out.println("This Is My Parent Cat (Black Billi)");
//    }
//}
//class BabyCat extends Cat{
//    void babycat() {
//        System.out.println("This is my baby cat (chitkabri billi)");
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        BabyCat b = new BabyCat();
//        b.Cat();
//        b.babycat();
//    }
//}

//------------------------------------------------------------------------
//2)  Mobile
//     ||
//     \/
//  Smart Phone
//     ||
//     \/
//   i-Phone

//class Mobile{
//    void m(){
//        System.out.println("This Is basic Pokemon Mobile");
//    }
//}
//class Smartphone extends Mobile{
//    void sm(){
//        System.out.println("This is 2nd stage evolution of Pokemon Mobile");
//    }
//}
//class I_Phone extends Smartphone{
//    void i(){
//        System.out.println("This is final evolution of Pokemon Mobile");
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        I_Phone a = new I_Phone();
//        a.m();
//        a.sm();
//        a. i();
//    }
//}


//----------------------------------------------------------------------------------------------


////3) Setter/ Getter
////
////        A
////        B
////        C -> a*b
////        Multiply
//
//import java.util.Scanner;
//class Cal{
//    private int a;
//    private int b;
//    void setA(int a){
//        this.a = a;
//    }
//    int getA(){
//        return a;
//    }
//    void setB(int b){
//        this.b = b;
//    }
//    int getB(){
//        return b;
//    }
//    void C(){
//        System.out.println(a*b);
//    }
//}
//
//
//public class Main{
//    public static void main(String[] args){
//        Scanner sc =new Scanner(System.in);
//        System.out.println("-:Multiply:-");
//        System.out.print("Enter value of a: ");
//        int a = sc.nextInt();
//        System.out.print("Enter value of b: ");
//        int b = sc.nextInt();
//        Cal c =new Cal();
//        c.setA(a);
//        c.setB(b);
//        int m = c.getA();
//        int n = c.getB();
//        c.C();
//
//    }
//}


//---------------------------------------------------------------------------------

////        A
////        B
////        C -> a*b
////        Add, Sub, Mult, Div, Modulo
//
//import java.util.Scanner;
//class Cal{
//    private int a
//    private int b;
//    void setA(int a){
//        this.a = a;
//    }
//    int getA(){
//        return a;
//    }
//    void setB(int b){
//        this.b = b;
//    }
//    int getB(){
//        return b;
//    }
//    void C(){
//        System.out.println("Add: "+(a+b));
//        System.out.println("Sub: "+(a-b));
//        System.out.println("Mult: "+(a*b));
//        System.out.println("Div: "+(a/b));
//        System.out.println("Modulo: "+(a%b));
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Scanner sc =new Scanner(System.in);
//        System.out.println("-:Calculator:-");
//        System.out.print("Enter value of a: ");
//        int a = sc.nextInt();
//        System.out.print("Enter value of b: ");
//        int b = sc.nextInt();
//        Cal c =new Cal();
//        c.setA(a);
//        c.setB(b);
//        int m = c.getA();
//        int n = c.getB();
//        c.C();
//
//    }
//}


//------------------------------------------------------------------------------------------

////4) Hierarchial Inheritance
////
////             Animal
////        -----------------
////        |               |
////       Dog             Cat
//
//
//
//class Animal {
//    void A() {
//        System.out.println("This Is Animal Kingdom");
//    }
//}
//class Dog extends Animal{
//    void D(){
//        System.out.println("This Dog is a Class of Animal kingdom");
//    }
//}
//class Cat extends Animal{
//    void C(){
//        System.out.println("This Cat is a Class of Animal kingdom");
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Dog d = new Dog();
//        d.A();
//        d.D();
//        Cat c = new Cat();
//        c.C();
//    }
//}


//------------------------------------------------------------------------------------------------

////                            Stationary
////                   ----------------------------
////                   |            |              |
////                   Pen          Pencil         Erasor
//
//
//class Stationary {
//    void S() {
//        System.out.println("This Is Stationary");
//    }
//}
//class Pencil extends Stationary{
//    void P(){
//        System.out.println("This IS Pencil");
//    }
//}
//class Pen extends Stationary{
//    void pen(){
//        System.out.println("This IS Pen");
//    }
//}
//class Erasor extends Stationary{
//    void E(){
//        System.out.println("This IS Erasor");
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Pencil p = new Pencil();
//        p.S();
//        p.P();
//        Pen pe = new Pen();
//        pe.S();
//        pe.pen();
//        Erasor e = new Erasor();
//        e.S();
//        e.E();
//
//    }
//}


//--------------------------------------------------------------------------------------
//                    class A(int a,int b)
//     -------------------------------------------------
//     |               |               |               |
//class B           class C         class D          class E
//(a+b)             (a-b)            (a*b)            (a/b)
//class A{
//    int a;
//    int b;
//    void method_A(int a ,int b){
//        this.a = a;
//        this.b = b;
//    }
//}
//class B extends A{
//    void b(){
//        System.out.println("Add: " + (a+b));
//    }
//}
//class C extends A{
//    void c(){
//        System.out.println("Sub: " + (a-b));
//    }
//}
//class D extends A{
//    void d(){
//        System.out.println("Mult: " + (a*b));
//    }
//}
//class E extends A{
//    void e(){
//        System.out.println("Div: " + (a/b));
//    }
//}
//public class Main{
//    public static void main(String[] args){
//       B bc = new B();
//       bc.method_A(4,8);
//       bc.b();
//       C cc = new C();
//       cc.method_A(8,4);
//       cc.c();
//       D dc = new D();
//       dc.method_A(3,6);
//       dc.d();
//       E ec = new E();
//       ec.method_A(8,2);
//       ec.e();
//    }
//}


//-------------------------------------------------------------------------------------------------------

//class A{
//    int a;
//    void setA(int a){
//        this.a=a;
//    }
//    int getA(){
//        return a;
//    }
//}
//class B extends A{
//    public int b;
//    void setB(int b){
//        this.b=b;
//    }
//    int getB(){
//        return b;
//    }
//}
//class C extends B{
//    public int c;
//    void setC(int c){
//        this.c = c;
//    }
//    int getC(){
//        return c;
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        C sc = new C();
//        sc.setA(2);
//        sc.setB(5);
//        sc.setC(7);
//        System.out.println(sc.getA());
//        System.out.println(sc.getB());
//        System.out.println(sc.getC());
//    }
//}


//---------------------------------------------------------------------------------------

//class A{
//    int a;
//    void setA(int a){
//        this.a=a;
//    }
//    int getA(){
//        return a;
//    }
//}
//class B extends A{
//    public int b;
//    void setB(int b){
//        this.b=b;
//    }
//    int getB(){
//        return b;
//    }
//    void add(){
//        System.out.println("Add: "+ (a+b));
//    }
//}
//class C extends A{
//    public int c;
//    void setC(int c){
//        this.c = c;
//    }
//    int getC(){
//        return c;
//    }
//    void add(){
//        System.out.println("Add: "+ (a+c));
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        B dc = new B();
//        dc.setA(1);
//        dc.setB(2);
//        System.out.println(dc.getA());
//        System.out.println(dc.getB());
//        dc.add();
//
//        C sc = new C();
//        sc.setA(4);
//        sc.setC(6);
//        System.out.println(sc.getA());
//        System.out.println(sc.getC());
//        sc.add();
//    }
//}


//------------------------------------------------------------------------------------

//class A{
//    int a;
//    void setA(int a){
//        this.a=a;
//    }
//    int getA(){
//        return a;
//    }
//}
//class B {
//    public int b;
//    void setB(int b){
//        this.b=b;
//    }
//    int getB(){
//        return b;
//    }
//}
//
//public class Main{
//    public static void main(String[] args){
//
//        A ac = new A();
//        ac.setA(4);
//        System.out.println(ac.getA());
//
//        B dc = new B();
//        dc.setB(2);
//        System.out.println(dc.getB());
//    }
//}

//----------------------------------------------------------------------------

//class Person {
//    private String name;
//    private int age;
//
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//
//        System.out.println("Name: " + this.name);
//        System.out.println("Age: " + this.age);
//    }
//}
//
//    public class Main {
//    public static void main(String[] args) {
//        Person person = new Person("Vaibhav", 22);
//    }
//}

//-----------------------------------------------------------------------------------
//class Rectangle {
//    private int width;
//    private int height;
//
//    void set_width(int width){
//        this.width = width;
//    }
//    int get_width(){
//        return width;
//    }
//    void set_height(int height){
//        this.height = height;
//    }
//    int get_height(){
//        return height;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Rectangle rect = new Rectangle();
//        rect.set_width(5);
//        rect.set_height(7);
//        System.out.println("Width: " + rect.get_width());
//        System.out.println("Height: " + rect.get_height());
//        System.out.println("Area of Rectangle: " + (rect.get_width() * rect.get_height()));
//    }
//}


//--------------------------------------------------------------------------------------

//class Circle {
//    private int radius;
//    private int parameter;
//    double pi = 3.14;
//
//    void set_radius(int radius){
//        this.radius = radius;
//    }
//    int get_radius(){
//        return radius;
//    }
//    void set_parameter(int parameter){
//        this.parameter = parameter;
//    }
//    int get_parameter(){
//        return parameter;
//    }
//    void area(){
//        System.out.println(pi * radius * radius);
//    }
//    void circumference(){
//        System.out.println(2 * pi * radius);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.set_radius(5);
//        circle.set_parameter(7);
//
//        System.out.println("radius: " + circle.get_radius());
//        System.out.println("parameter: " + circle.get_parameter());
//
//        circle.area();
//        circle.circumference();
//    }
//}


//------------------------------------------------------------------------

//import java.util.Scanner;
//class Rectangle {
//    private int width;
//    private int height;
//    void set_width(int width){
//        this.width = width;
//    }
//    int get_width(){
//        return width;
//    }
//    void set_height(int height){
//        this.height = height;
//    }
//    int get_height(){
//        return height;
//    }
//    void area(){
//        System.out.println("Area of Rectangle: " + (width * height));
//    }
//}
//class Circle {
//    private int radius;
//    double pi = 3.14;
//
//    void set_radius(int radius){
//        this.radius = radius;
//    }
//    int get_radius(){
//        return radius;
//    }
//    void area(){
//        System.out.println("Area of Circle: " + (pi * radius * radius));
//    }
//}
//class Square{
//    private int side;
//    void set_side(int side){
//        this.side = side;
//    }
//    int get_side(){
//        return side;
//    }
//    void area(){
//        System.out.println("Area of Square: "+ (side * side));
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter Width of rectangle: ");
//        int a = sc.nextInt();
//        System.out.print("Enter Height of rectangle: ");
//        int b = sc.nextInt();
//        Rectangle rect = new Rectangle();
//        rect.set_width(a);
//        rect.set_height(b);
//        rect.area();
//
//        Circle circle = new Circle();
//        System.out.print("Enter Radius of Circle: ");
//        int c = sc.nextInt();
//        circle.set_radius(c);
//        circle.area();
//
//        Square sq = new Square();
//        System.out.print("Enter Side of square: ");
//        int d = sc.nextInt();
//        sq.set_side(d);
//        sq.area();
//    }
//}


//----------------------------------------------------------------------------------

//public class Main {
//    public static void main(String[] args) {
//        int rows = 4;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//                if (j != i) {
//                    System.out.print(" * ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//----------------------------------------------------------------------------------------------

//class A{
//    void add(int a, int b){
//        System.out.println(a+b);
//    }
//}
//class B extends A{
//    void add(int c, int d){
//        System.out.println(c+d);
//    }
//}
//public class Main {
//    public static void main(String[] args){
//        B r = new B();
//        r.add(4, 8);
//        r.add(4,7);
//    }
//}

//-------------------------------------------------------------------------------------------------
// class A{
//    void a(){
//        System.out.println("Parent Class");
//    }
//}
//class B extends A{
//    void b(){
//        System.out.println("Child Class");
//    }
//}
//public class Main{
//    public static void main(String[] args){
//      B b = new B();
//      b.a();
//      b.b();
//    }
//}


//------------------------------------------------------------------------------
//class A{
//    int a;
//    void a(int a){
//        this.a = a;
//    }
//    int a(){
//        return a;
//    }
//}
//class B extends A{
//    int b;
//    void b(int b){
//        this.b = b;
//    }
//    int b(){
//        return b;
//    }
//}
//public class Main{
//    public static void main(String[] args){
//       B sc = new B();
//       sc.a(56);
//       sc.b(4);
//       int m = sc.a();
//       int n = sc.b();
//       System.out.println(m+n);
//    }
//}

//----------------------------------------------------------------------------------
//class Mahindra{
//    void mahindra(){
//        System.out.println("This is Mahindra company");
//    }
//}
//class Car extends Mahindra{
//    void car(){
//        System.out.println("This is Car of Mahindra company");
//    }
//}
//class Bike extends Car{
//    void bike(){
//        System.out.println("This is Bike of Mahindra company");
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Bike sc = new Bike();
//        sc.mahindra();
//        sc.car();
//        sc.bike();
//    }
//}


//---------------------------------------------------------------------------------------------------

//class A{
//    int a;
//    void a(int a){
//        this.a=a;
//    }
//}
//class B extends A{
//    int b;
//    void b(int b){
//        this.b = b;
//    }
//}
//class C extends B{
//    int c;
//    void c(int c){
//        this.c = c;
//    }
// void add(){
//  System.out.println(a+b+c);
//}
//}
//public class Main{
//    public static void main(String[] args){
//        C sc = new C();
//        sc.a(1);
//        sc.b(3);
//        sc.c(5);
//        sc.add();
//    }
//}


//-------------------------------------------------------------------------------------------

//import java.util.Scanner;
//class A{
//    int a;
//    void abc(int a){
//        this.a=a;
//    }
//}
//class B extends A{
//    int b;
//    @Override
//    void abc(int b) {
//        this.b=b;
//        super.abc(a);
//    }
//}
//class C extends B{
//    int c;
//
//    @Override
//    void abc(int c) {
//        super.abc(b);
//        this.c=c;
//    }
//    void add(){
//        super.abc(b);
//        super.abc(c);
//        System.out.println(a+b+c);
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Scanner sc1=new Scanner(System.in);
//        int x= sc1.nextInt();
//        int y= sc1.nextInt();
//        int z= sc1.nextInt();
//        C sc = new C();
//        sc.abc(x);
//        sc.abc(y);
//        sc.abc(z);
//        sc.add();
//    }
//}


//-----------------------------------------------------------------------------------

//class A{
//    int a;
//    void s_A(int a){
//        this.a = a;
//    }
//}
//class B extends A{
//    int b;
//    void s_B(int b){
//        this.b = b;
//    }
//    int g_B(){
//        return a+b;
//    }
//}
//class C extends B{
//    int c;
//    void s_C(int c){
//        this.c = c;
//    }
//    int g_C(){
//        return b+c;
//    }
//}
//public class Main{
//    public static void main (String[] args) {
//        C sc = new C();
//        sc.s_A(10);
//        sc.s_B(20);
//        sc.s_C(30);
//        int n= sc.g_B();
//        int o= sc.g_C();
//        System.out.println(n);
//        System.out.println(o);
//    }
//}


//----------------------------------------------------------------------------------
//class parent{
//    void show(){
//        System.out.println("Parent class");
//    }
//}
//class child_1 extends parent{
//    void child1(){
//        System.out.println("child 1");
//    }
//}
//class child_2 extends parent{
//    void child2(){
//        System.out.println("child 2");
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        child_1 c1 = new child_1();
//        child_2 c2 = new child_2();
//        c1.show();
//        c1.child1();
//        c2.show();
//        c2.child2();
//    }
//}


//--------------------------------------------------------------------------------
//class A{
//    int a;
//    void abc(int a){
//        this.a= a;
//    }
//    int abc(){
//        return a;
//    }
//}
//class B extends A{
//    int b;
//    void bca(int b){
//        this.b = b;
//    }
//    int bca(){
//        return a+b;
//    }
//}
//class C extends A{
//    int c;
//    void cba(int c){
//        this.c =c;
//    }
//    int cba(){
//        return a+c;
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        B sc = new B();
//        sc.abc(12);
//        sc.bca(23);
//        C cc = new C();
//        cc.abc(34);
//        cc.cba(45);
//        System.out.println(sc.bca());
//        System.out.println(cc.cba());
//    }
//}


//---------------------------------------------------------------------------------
//class A {
//    int a;
//    void abc(int a) {
//        this.a = a;
//    }
//    int abc() {
//        return a;
//    }
//}
//class B extends A {
//    int b;
//    void bca(int b) {
//        this.b = b;
//    }
//    @Override
//    int abc() {
//        return a + b;
//    }
//}
//class C extends A {
//    int c;
//    void cba(int c) {
//        this.c = c;
//    }
//    @Override
//    int abc() {
//        return a + c;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        B sc = new B();
//        sc.abc(12);
//        sc.bca(23);
//        C cc = new C();
//        cc.abc(34);
//        cc.cba(45);
//        System.out.println(sc.abc());
//        System.out.println(cc.abc());
//    }
//}


//=-------=------------=------------=----------=-------------=----------=-----------=-----------=------=------=
