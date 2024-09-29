// Practice Set 1:-

// Qo1:- Find the Largest Number:-
// public class control_flow {

//     public static void main(String args[]){
//         int a= 30,b=23,c=45;
//         if(a<c){
//             System.out.println("c is largest");
//         }
//         else if(a>b){
//             System.out.println("b is a smallest");
//         }
//         else{
//             System.out.println("No Number");
//         }
//     }
// }

// Qo2:- Odd And Even Number:-

/**
 * control_flow
 */
// public class control_flow {

//     public static void main(String args[]){
//         int n= 24;
//         if(n%2 == 00){
//             System.out.println("Even Number");

//         }
//         else{
//             System.out.println("Odd Number");
//         }
//     }
// }


// Qo7:- Vote Person IS Eligible:-

/**
 * control_flow
 */
// public class control_flow {

//     public static void main(String args[]){
//         int age = 18;
//         if(age>=15){
//             System.out.println("Vote Eligible");
//         }
//         else{
//             System.out.println("Not Eligible");
//         }
//     }
// }
 
// Qo6:-

// public class control_flow {
//     public static void main(String[] args) {
//         int age = 62;
//         if(age<13){
//             System.out.println("Child");
//         }
//         else if(age<=20){
//             System.out.println("Teenager");
//         }
//         else if(age<=60){
//             System.out.println("Adult");
//         }
//         else if(age>=60){
//             System.out.println("Senior");
//         }
//         else{
//             System.out.println("No age Define");
//         }
//     }
// }


// Qo8:-

// public class control_flow {

//     public static void main(String[] args) {
//         int temp = 40;
//         if(temp>30){
//             System.out.println("Hot Day");
//         }
//         else if(temp>=20 && temp<=30){
//             System.out.println("Warm Day");
//         }
//         else if(temp>=10 && temp<20){
//             System.out.println("Cool Day");
//         }
//         else if(temp<10){
//             System.out.println("Cold Day");
//         }
//         else{
//             System.out.println("No Temp");
//         }
//     }

    
// }

// Qo10:-

// public class control_flow {

//     public static void main(String[] args) {
//         int bmi = 20;

//         if(bmi<18.5){
//             System.out.println("Underweight");
//         }
//         else if(bmi<25){
//             System.out.println("Normal Weight");
//         }
//         else if(bmi<30){
//             System.out.println("Overweight");
//         }
//         else if(bmi>=30){
//             System.out.println("Obesity");
//         }
//         else{
//             System.out.println("No weight Define");
//         }
//     }
// }

// Qo3:-

// public class control_flow {
//     public static void main(String[] args) {
//         int marks = 100;

//         if(marks>=90){
//             System.out.println("Grade:A");
//         }
//         else if(marks>=80){
//             System.out.println("Grade:B");
//         }
//         else if(marks>=70){
//             System.out.println("Grade:C");
//         }
//         else if(marks>=60){
//             System.out.println("Grade:D");
//         }

//         else{
//             System.out.println("F");
//         }
//     }

    
// }

/**
 * control_flow
 */
// public class control_flow {

//     public static void main(String[] args) {
        
//         if(0>1){
//             System.out.println("+ve");
//         }
//         else if(0<1){
//             System.out.println("-");
//         }
//         else{
//             System.out.println("Zero");
//         }
//     }
// }


// Qo4:-

/**
 * control_flow
 */
// public class control_flow {

//     public static void main(String[] args) {
//         int year = 366;

//         if((year%400 ==0 && year%100 !=0 )|| (year%400 == 0)){
//             System.out.println(year+"Is a Leap Year");
//         }
//         else{
//             System.out.println("Not a Leap Year");
//         }
//     }
// }

// --------------------------------------------------------------------------------------------------------------

// Practice Set:-2:- To Take of  User Input Value

// Next Question:-

// Qo1:- // Day of the week:-

/**
 * control_flow
 */
// import java.util.Scanner;
// public class control_flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Ur Day:-");
//         int day = sc.nextInt();

//         if(day==1){
//             System.out.println("Monday");
//         }
//         else if(day== 2){
//             System.out.println("Tuesday");
//         }
//         else if(day==3){
//             System.out.println("Wednesday");
//         }
//         else if(day==4){
//             System.out.println("Thursday");
//         }
//         else if(day==5){
//             System.out.println("Friday");
//         }
//         else if(day==6){
//             System.out.println("Saturday");
//         }
//         else if(day==7){
//             System.out.println("Sunday");
//         }
//         else{
//             System.out.println("No  Define Day");
//         }
//     }

    
// }

// Qo2:- Triangle Type Cheaker

// import java.util.Scanner;

// /**
//  * control_flow
//  */
// public class control_flow {
//     public static void main(String args[]){

//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter Three Lengths:-");
//     int a=sc.nextInt(), b=sc.nextInt(),c=sc.nextInt();

//     if(a==b && b==a){
//         System.out.println("Equilater");
//     }
//     else if(a==b || b==c || a==c){
//         System.out.println("isosceles");
//     }
//     else{
//         System.out.println("Scalene");
//     }

    
// }

// }

// Qo3:- Quardrant of a Point

// import java.util.Scanner;
// public class control_flow {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Cordinates X and Y:-");
//          int x = sc.nextInt();
//          int y = sc.nextInt();

//          if(x>0 && y>0){
//             System.out.println("First Quar*");
//          }
//          else if(x<0 && y>0){
//             System.out.println("Second Quar*");
//          }
//          else if(x<0 && y>0){
//             System.out.println("Third Quar*");
//          }
//          else if(x>0 && y<0){
//             System.out.println("Forth Quar*");
//          }
        
//     }
// }


// Qo4:- Simple Calculator:

// import java.util.Scanner;
// public class control_flow {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Two Number :-");
//         System.out.println("Enter Your First Number:-");
//         double num1 = sc.nextDouble();
//         double num2 = sc.nextDouble();
//         char op = sc.next().charAt(0);
        

//         if(op == '+'){
//             System.out.println(num1 + num2);
//         }
//         else if(op == '-'){
//             System.out.println(num1 - num2);
//         }
//         else if(op == '*'){
//             System.out.println(num1 * num2);
//         }
//         else if(op == '/'){
//         System.out.println(num1 / num2);
//         }
// }
// }


// Q05:-Season Determiner:

// import java.util.Scanner;
// public class control_flow {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a month Number:-");
//         int month = sc.nextInt();

//         if(month>=3 && month<=5){
//             System.out.println("Spring");
//         }
//         else if(month>=6 && month<=8){
//             System.out.println("Summer");
//         }
//         else if(month>=9 && month<=11){
//             System.out.println("Autumn");
//         }
//         else if(month==12 || month==1){
//             System.out.println("Winter");
//         }
//         else{
//             System.out.println("Season Finish");
//         }
//     }

    
// }


// Qo6:- Discount Calculator:


// import java.util.Scanner;
// public class control_flow {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Amount:-");
//         double amount = sc.nextDouble();

//         if(amount>5000){
//             System.out.println("Final Price:" + amount*20/100);
//         }
//         else if(amount>2000){
//             System.out.println("Final Price:" + amount*10/100);
//         }
//         else if(amount>1000){
//             System.out.println("Final Price:"+ amount*5/100);

//         }
//         else if(amount<=1000){
//             System.out.println("No Discount");
//         }
        
//     }
// }


// Qo7:-Character Type Cheaker:

// import java.util.Scanner;


// public class control_flow {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Check Character:-");

//          char ch = sc.next().charAt(0);
//          if((ch >= 'a' && ch<= 'z') || (ch>='A' && ch<='Z')){
//             System.out.println("Letter Type");
//          }
//          else if(ch>='0' && ch<='9'){
//             System.out.println("Number Type");
//          }
//          else{
//             System.out.println("No Letter and No Number");
//          }
//     }
// }

// Qo8:- Time Of Day Greeting:

// import java.util.Scanner;
// public class control_flow {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Time:-");
//          int time = sc.nextInt();

//          if(time>=5 && time<12){
//             System.out.println("Good Morning");
//          }
//          else if(time>=12 && time<17){
//             System.out.println("Good Afternoon");
//          }
//          else if(time>=17 && time<21){
//             System.out.println("Good Evening");
//          }
//          else{
//             System.out.println("Good Night:)");
//          }
//     }
// }


// Qo9:- Number To Word Converter:

// import java.util.Scanner;
// public class control_flow{
//     public static void  main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Single Digit Number:-");
//         int number = sc.nextInt();

//         if(number == 0){
//             System.out.println("Zero");
//         }
//         else if(number == 1){
//             System.out.println("One");
//         }
//         else if(number == 2){
//             System.out.println("Two");
//         }
//         else if(number == 3){
//             System.out.println("Three");
//         }
//         else if(number == 4){
//             System.out.println("Four");
//         }
//         else if(number == 5){
//             System.out.println("Five");
//         }
//         else if(number == 6){
//             System.out.println("Six");
//         }
//         else if(number == 7){
//             System.out.println("Seven");
//         }
//         else if(number == 8){
//             System.out.println("Eight");
//         }
//         else if(number == 9){
//             System.out.println("Nine");
//         }



//     }
// }


// Qo11:- Loan Approval Cheaker:


// import java.util.Scanner;

// public class control_flow{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your  CreditScore and Income:-");
//         int creditScore = sc.nextInt();
//         double income = sc.nextDouble();
//         if(creditScore>=1000 && income>=180000){
//             System.out.println("Loan Approved");

//         }
//         else if(creditScore>800 && income>=90000){
//             System.out.println("Loan Approved");

//         }
//         else{
//             System.out.println("Loan Denied");
//         }
        
//     }
// }

// Qo14:- Grade Pointer Calculator:

// import java.util.Scanner;

// public class control_flow{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your GRADE:-");

//         char grade = sc.next().toUpperCase().charAt(0);
//         if(grade =='A'){
//             System.out.println("4");

//         }
//         else if(grade == 'B'){
//             System.out.println("3");

//         }
//         else if(grade =='C'){
//             System.out.println("2");
//         }
//         else if(grade == 'D'){
//             System.out.println("1");

//         }
//         else if(grade =='F'){
//             System.out.println("0");
//         }
//         else{
//             System.out.println("Invalid Grade:)");
//         }
//     }
// }

// Qo15:- Leap Year:

// import java.util.Scanner;

// public class control_flow{
//     public static void main(String args[]){

//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a Year:-");
//     int year = sc.nextInt();

//     if((year%4 == 0 && year%100!=0 )||(year%400==0)){
//         System.out.println("Leap Year");
//     }
//     else{
//         System.out.println("NOt a Leap Year");
//     }
    
// }
// }