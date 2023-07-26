import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//============== LEAP Year ================================================================
//
//        System.out.print("Enter A year to check LEAP: ");
//        int year = sc.nextInt();
//        if(year%4==0 && (year%100!=0 || year%400==0)) {
//            System.out.println(year + " is a LEAP Year");
//        }
//        else {
//            System.out.println(year + " is not a LEAP Year");
//        }

//================Temperature conversion ===================================================
//
//        System.out.println("Press \"Fahrenheit\" if you want to convert into Fahrenheit");
//        System.out.println("Press \"Celsius\" if you want to convert into Celsius");
//        String ch = sc.nextLine();
//        if(ch .equals("Fahrenheit")) {
//            System.out.print("Enter Temperature in Celsius");
//            double temp = sc.nextDouble();
//            double f = (9.0 / 5.0) * temp + 32;
//            System.out.println("Temperature in Fahrenheit: " + f);
//        }
//        else if(ch .equals("Celsius")){
//            System.out.print("Enter Temperature in Fahrenheit");
//            double tem = sc.nextDouble();
//            double c = (tem - 32) * 5.0/9.0;
//            System.out.println("Temperature in Celsius: " + c);
//        }
//        else{
//            System.out.println("Please input \'Fahrenheit\' or \'Celsius\'");
//        }


//============== Area of Tri/ Sq/ Rect ========================================================
//
//        System.out.println("Enter Area or Volume for (Triangle Square or Rectangle)");
//        String op = sc.nextLine();
//
//        if(op .equalsIgnoreCase("Area")){
//            System.out.println("Enter Triangle Square or Rectangle");
//            String shape = sc.nextLine();
//
//            if(shape.equalsIgnoreCase("Triangle")){
//                System.out.print("Enter Base Of " + shape + ": ");
//                double b = sc.nextDouble();
//                System.out.print("Enter Height Of " + shape + ": ");
//                double h = sc.nextDouble();
//                double f = (1.0/2.0) * b * h;
//                System.out.println("Area Of " + shape + " is: " + f);
//            }
//            else if(shape.equalsIgnoreCase("Square")){
//                System.out.print("Enter Side of " + shape + ": ");
//                int s = sc.nextInt();
//                System.out.println("Area Of "+shape + " is: "+(s*s));
//            }
//            else{
//                System.out.print("Enter Length of " + shape + ": ");
//                int l = sc.nextInt();
//                System.out.print("Enter width of " + shape + ": ");
//                int w = sc.nextInt();
//                System.out.println("Area Of " + shape + " is: " + (l * w));
//            }
//        }
//        else{
//            System.out.println("Triangle, Square or Rectangle does not possess volume as they are 2D shapes.");
//            System.out.println("However a Cone, Cube abd Cuboid does have volume as they are 3D shapes");
//            }


//================ Alphabet or Digit ==============================================================================
//
//        System.out.print("Enter a character: ");
//        char input = sc.next().charAt(0);
//
//        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
//            System.out.println("The input is an alphabet.");
//        } else if (input >= 0 && input <= 9) {
//            System.out.println("The input is a digit.");
//        } else {
//            System.out.println("The input is neither an alphabet nor a digit.");
//        }


//============ Student Report Card ===============================================================================

//        System.out.print("Enter Student's Name: ");
//        String student = sc. nextLine();
//
//        System.out.print("Enter Father's Name: ");
//        String father = sc.nextLine();
//
//        System.out.print("Enter Mother's Name: ");
//        String mother = sc.nextLine();
//
//        System.out.println("Enter Marks: ");
//        System.out.print("Hindi: ");
//        int hindi = sc.nextInt();
//
//        System.out.print("English: ");
//        int english = sc.nextInt();
//
//        System.out.print("Maths: ");
//        int maths = sc.nextInt();
//
//        System.out.print("Physics: ");
//        int physics = sc.nextInt();
//
//        System.out.print("Chemistry: ");
//        int chemistry = sc.nextInt();
//
//        System.out.print("Biology: ");
//        int biology = sc.nextInt();
//
//        int total = hindi+english+maths+physics+chemistry+biology;
//        double percent = (total/600.0)*100;
//
//        System.out.println("\n----------REPORT CARD----------");
//        System.out.println("Student's Name: " + student);
//        System.out.println("Father's Name: " + father);
//        System.out.println("Mother's Name: " + mother);
//        System.out.println("Marks:-");
//        System.out.println("Hindi: " + hindi);
//        System.out.println("English: " + english);
//        System.out.println("Maths: "+maths);
//        System.out.println("Physics: " + physics);
//        System.out.println("Chemistry: " + chemistry);
//        System.out.println("Biology: " + biology);
//        System.out.println("Marks Obtained: " + total);
//        System.out.println("Total Marks: 600");
//
//        if(percent > 80){
//            System.out.println(percent+"%  A Grade");
//        }
//        else if(percent > 60 && percent<=80){
//            System.out.println(percent+"%  B Grade");
//        }
//        else if(percent > 50 && percent <= 60) {
//            System.out.println(percent + "%  C Grade");
//        }
//        else if(percent > 45 && percent <= 50) {
//            System.out.println(percent + "%  D Grade");
//        }
//        else if(percent >= 25 && percent <= 45) {
//            System.out.println(percent + "%  E Grade");
//        }
//        else{
//            System.out.println(percent + "%  Fail");
//        }


//============= height conversion and range ==========================================
//
//        System.out.println("Input Height in meter");
//        double height = sc.nextDouble();
//        double cm = height * 100;
//        System.out.println(cm + " cm");
//        if(cm > 193){
//            System.out.println("You are Tall");
//        }
//        else if(cm > 177 && cm < 193){
//            System.out.println("You are Medium");
//        }
//        else{
//            System.out.println("You are Small");
//        }


//======== student report card with roll no.================================================

//        System.out.print("Enter Student's Name: ");
//        String student = sc. nextLine();
//
//        System.out.print("Enter Student's Roll NO.: ");
//        int rollno = sc. nextInt();
//        sc.nextLine();
//        System.out.print("Enter Father's Name: ");
//        String father = sc.nextLine();
//
//        System.out.print("Enter Mother's Name: ");
//        String mother = sc.nextLine();
//
//        System.out.println("Enter Marks: ");
//        System.out.print("Hindi: ");
//        int hindi = sc.nextInt();
//
//        System.out.print("English: ");
//        int english = sc.nextInt();
//
//        System.out.print("Maths: ");
//        int maths = sc.nextInt();
//
//        System.out.print("Physics: ");
//        int physics = sc.nextInt();
//
//        System.out.print("Chemistry: ");
//        int chemistry = sc.nextInt();
//
//        System.out.print("Biology: ");
//        int biology = sc.nextInt();
//
//        int total = hindi+english+maths+physics+chemistry+biology;
//        double percent = (total/600.0)*100;
//
//        System.out.println("\n----------REPORT CARD----------");
//        System.out.println("Student's Name: " + student);
//        System.out.println("Student's Roll No.: " + rollno);
//        System.out.println("Father's Name: " + father);
//        System.out.println("Mother's Name: " + mother);
//        System.out.println("Marks:-");
//        System.out.println("Hindi: " + hindi);
//        System.out.println("English: " + english);
//        System.out.println("Maths: "+maths);
//        System.out.println("Physics: " + physics);
//        System.out.println("Chemistry: " + chemistry);
//        System.out.println("Biology: " + biology);
//        System.out.println("Marks Obtained: " + total);
//        System.out.println("Total Marks: 600");
//
//        if(percent > 80){
//            System.out.println(percent+"%  A Grade");
//        }
//        else if(percent > 60 && percent<=80){
//            System.out.println(percent+"%  B Grade");
//        }
//        else if(percent > 50 && percent <= 60) {
//            System.out.println(percent + "%  C Grade");
//        }
//        else if(percent > 45 && percent <= 50) {
//            System.out.println(percent + "%  D Grade");
//        }
//        else if(percent >= 25 && percent <= 45) {
//            System.out.println(percent + "%  E Grade");
//        }
//        else{
//            System.out.println(percent + "%  Fail");
//        }


//========== average of marks (only if marks>40)======================================================

//        System.out.println("Enter Student's Marks: ");
//        System.out.print("Maths: ");
//        double maths = sc.nextDouble();
//        System.out.print("Science: ");
//        Double science = sc.nextDouble();
//        System.out.print("English: ");
//        Double english = sc.nextDouble();
//        System.out.print("Hindi: ");
//        Double hindi = sc.nextDouble();
//
//        if(maths > 40 && science > 40 && english > 40 && hindi > 40){
//            double result = (maths+science+english+hindi)/4;
//            if(result > 80){
//                System.out.println("A Grade");
//
//            }else if (result >=60 && result <=80){
//                System.out.println("B Grade");
//            }else if (result >= 50 && result < 60){
//                System.out.println("C Grade");
//            }else{
//                System.out.println("D Grade");
//            }
//        }
//        else{
//            System.out.println("Fail");
//        }




//========== 3 no max (only if else) ======================================================

//        System.out.print("Enter the first number: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter the second number: ");
//        int num2 = sc.nextInt();
//        System.out.print("Enter the third number: ");
//        int num3 = sc.nextInt();
//
//        int max;
//
//        if (num1 >= num2) {
//            if (num1 >= num3) {
//                max = num1;
//            } else {
//                max = num3;
//            }
//        } else {
//            if (num2 >= num3) {
//                max = num2;
//            } else {
//                max = num3;
//            }
//        }
//        System.out.println("The maximum number is: " + max);


//============ Salary Deduction ===============================================

//        System.out.print("Enter Salary: ");
//        int salary = sc.nextInt();
//        System.out.print("Enter No. of Holidays: ");
//        int holiday = sc.nextInt();
//        double result = 0;
//
//        if (holiday <= 1) {
//            System.out.println("Your account is credit with your full Salary");
//        } else if (holiday >= 2 && holiday <= 5) {
//            result = salary * (5.0 / 100);
//
//        } else if (holiday > 5 && holiday <= 14) {
//            result = salary * (10.0 / 100);
//
//        } else if (holiday == 15) {
//            result = salary * (50.0 / 100);
//
//        } else {
//            salary = 0;
//        }
//        System.out.println("Salary: Rs. " + (salary - result));

//============== Electricity Bill =====================================================================

//        System.out.print("Name: ");
//        String name = sc.nextLine();
//        System.out.print("Enter Unit: ");
//        double unit = sc.nextDouble();
//        double amount = unit * 10;
//        double discount = 0;
//        double result = 0;
//
//        if(unit <= 100){
//            discount = 100;
//            result = amount *(100.0/100);
//
//        }else if(unit >100 && unit <=500){
//            discount = 10;
//            result = amount * (10.0/100);
//
//        }else if(unit >500 && unit <=1000){
//            discount = 5;
//            result = amount * (5.0/100);
//        }else {
//            discount = 0;
//            result = amount;
//        }
//        System.out.println("User Name: " + name);
//        System.out.println("Unit Consumed: " + unit);
//        System.out.println("Discount: "+ discount + "%");
//        System.out.println("Total Pay Amount: Rs." + (amount - result));


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
//            System.out.println("Jayada Hoshiyari Nahi Mere Saath");
//        }
    }
}
