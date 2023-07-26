import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Area of Square");
//        System.out.print("Enter the Side of Square: ");
//        int s = sc.nextInt();
//        int result = s*s;
//        System.out.println("The Area of Square is:" +result);


//        System.out.println("Area of Circle");
//        System.out.println("Enter the Radius of Circle: ");
//        int s = sc.nextInt();
//        double result = 3.14*s*s;
//        System.out.println("The Area of Circle is:" +result);

//        System.out.println("Area of Rectangle");
//        System.out.println("Enter the length of Rectangle: ");
//        int l = sc.nextInt();
//        System.out.println("Enter the length of Rectangle: ");
//        int b = sc.nextInt();
//        int result = l*b;
//        System.out.println("The Area of Rectangle is: " +result);


//        System.out.println("Area of Cylinder");
//        System.out.print("Enter the Radius of Cylinder: ");
//        int r = sc.nextInt();
//        System.out.print("Enter the height of Cylinder: ");
//        int h = sc.nextInt();
//        double result = 2 * 3.14 * r * h + 2 * 3.14 * r * r;
//        System.out.println("The Area of Cylinder is:" +result);


//        System.out.println("Area of Sphere");
//        System.out.print("Enter the Radius of Sphere: ");
//        int r = sc.nextInt();
//        double result = 4 * 3.14 * r * r;
//        System.out.println("The Area of Sphere is:" +result);


//        System.out.println("Volume of Cylinder");
//        System.out.print("Enter the Radius of Cylinder: ");
//        int r = sc.nextInt();
//        System.out.print("Enter the height of Cylinder: ");
//        int h = sc.nextInt();
//        double result = 3.14 * r * r * h;
//        System.out.println("The Volume of Cylinder is:" +result);


//        System.out.println("Volume of Sphere");
//        System.out.print("Enter the Radius of Sphere: ");
//        int r = sc.nextInt();
//        double result = (4.0/3.0) * Math.PI * r * r * r;
//        System.out.println("The Volume of Sphere is:" +result);


//        System.out.println("Celsius to Fahrenheit");
//        System.out.println("Enter Temperature in Celsius: ");
//        double c = sc.nextDouble();
//        double f = (9.0 / 5.0) * c + 32;
//        System.out.print("Temperature in Fahrenheit: " + f);


//        System.out.println("Volume of Cube");
//        System.out.print("Enter the Side of Cube: ");
//        int s = sc.nextInt();
//        int result = s*s*s;
//        System.out.println("The Volume of Cube is: " +result);

//        int s = 5;
//        int area = s * s;
//        System.out.println("The area of the square is: " + area);


//        double r = 3.5;
//        double area = Math.PI * r * r;
//        System.out.println("The area of the circle is: " + area);


//        int l = 4;
//        int w = 2;
//        int area = l * w;
//        System.out.println("The area of the rectangle is: " + area);


//        double r = 2.5;
//        double h = 3.8;
//        double result =3.14 * r * r * h;
//        System.out.println("Volume of the cylinder is: " + result);

//        double c = 25.0;
//        double f = (c * 9 / 5) + 32;
//        System.out.println(c + " degree Celsius is equal to " + f + " degree Fahrenheit.");


//        int k = 3000;
//        double c = k - 273.15;
//        System.out.println(k + " Kelvin is equal to " + c + " degree Celsius.");

//        String name = "Hello";
//        System.out.println(name+" World");

//        String name = "Amit";
//        System.out.println(name+" is a Developer");

//        String name = "Mango";
//        System.out.println(name+" is the King of fruits");

//        String name = "Hello";
//        System.out.println(name+" hi how are you " +name+" Priya");

//        String name = "Java";
//        System.out.println(name+" is a Programming Language");

//        String name = "World";
//        System.out.println("Hello "+name);

//        String name = "Okay Okay";
//        System.out.println("How are you => "+name);

//        String name = "Who are you";
//        System.out.println("What "+name);

//        String name = "You";
//        System.out.println(name+" Are the Best Person");

//        String name = "Earth";
//        System.out.println(name);


//----------------------------------------------------------------------------
//        31st May 2023         Wednesday

//        String name = sc.nextLine();
//        System.out.println(name+" World");

//        String name = sc.nextLine();
//        System.out.println(name+" is a Developer");

//        String name = sc.nextLine();
//        System.out.println(name+" is the King of fruits");

//        String name = sc.nextLine();
//        System.out.println(name+" hi how are you " +name+" Priya");

//        String name = sc.nextLine();
//        System.out.println(name+" is a Programming Language");

//        String name = sc.nextLine();
//        System.out.println("Hello "+name);

//        String name = sc.nextLine();
//        System.out.println("How are you => "+name);

//        String name = sc.nextLine();
//        System.out.println("What "+name);

//        String name = sc.nextLine();
//        System.out.println(name+" Are the Best Person");

//        String name = sc.nextLine();
//        System.out.println(name);

//---------------------------------------------------------------------------------------------------------------------------
//        System.out.print("Enter Customer ID: ");
//        int a = sc.nextInt();
//        System.out.print("Enter Customer Name: ");
//        String b = sc.next();
//        System.out.print("Enter Customer Gender: ");
//        char c = sc.next().charAt(0);
//        System.out.print("Enter Customer Mail: ");
//        String d = sc.next();
//        System.out.print("Enter Customer Mobile: ");
//        long e = sc.nextLong();
//        System.out.println("Customer Details");
//        System.out.println("-----------------------");
//        System.out.println("Customer ID = "+a);
//        System.out.println("Customer Name = "+b);
//        System.out.println("Customer Gender = "+c);
//        System.out.println("Customer Mail = "+d);
//        System.out.println("Customer Mobile = "+e);
//----------------------------------------------------------------------------------------------------------------------------
//        System.out.print("Enter two Numbers: ");
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        System.out.println("Choose an operation:");
//        System.out.println("1. Sum");
//        System.out.println("2. Product");
//        System.out.println("3. Average");
//        System.out.println("4. Division");
//        System.out.print("Enter your choice (1-4) ");
//        int x = sc.nextInt();
//
//        double result;
//        switch (x) {
//            case 1:
//                result = a + b;
//                System.out.println(result);
//                break;
//
//            case 2:
//                result = a * b;
//                System.out.println(result);
//                break;
//
//            case 3:
//                result = (a+b)/2;
//                System.out.println(result);
//                break;
//
//            case 4:
//                result = a / b;
//                System.out.println(result);
//                break;
//
//            default:
//                System.out.println("Invalid choice!");
//        }


//        System.out.println("Enter an Amount");
//        double amount = sc.nextDouble();
//
//        double a = (5 * amount) / 100;
//        double b = (10 * amount) / 100;
//        double c = (20 * amount) / 100;
//        double d = (25 * amount) / 100;
//        double e = (50 * amount) / 100;
//
//        System.out.println("5% of " + amount +" is: " + a);
//        System.out.println("10% of " + amount +" is: " + b);
//        System.out.println("20% of " + amount +" is: " + c);
//        System.out.println("25% of " + amount +" is: " + d);
//        System.out.println("50% of " + amount +" is: " + e);


//        System.out.print("Enter the first number: ");
//        double num1 = sc.nextDouble();
//        System.out.print("Enter the second number: ");
//        double num2 = sc.nextDouble();
//        System.out.print("Enter the third number: ");
//        double num3 = sc.nextDouble();
//
//        double maxNum;
//
//        if (num1 > num2 && num1 > num3) {
//            maxNum = num1;
//        } else if (num2 > num3) {
//            maxNum = num2;
//        } else {
//            maxNum = num3;
//        }
//        System.out.println("The maximum number is: " + maxNum);
    }
}