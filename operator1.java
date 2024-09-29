// Operatrs In Java:-

// =>Operators is Special Symbol which is used to perform operations according to user requirements./**
// Ex:- +,-,*,/,% etc.


// There are 8 Types Of java Operators:-

// i) Arithematic Op:- +,-,*,/,%
// ii) Relational/Comparision Op:- <,>,<=,>=,==,!=
// iii) Logical Op:-&&, ||, !
// iv) Assignment Op:- +=, -=, =,*=,/=, %=
// v) Unary Op:- 
//           a)Prefix:-  ++var , --var 
//           b)Postfix:- var-- , var--

// vi) Shift Op :- << , >>, >>>
// vii) Turnary Op:- ? :
// viii) Bitwise Op:-Bitwise AND(&), Bitwise inclusive OR(|), Bitwise Exclusive OR(^), Bitwise Complement(~)


// All Operators Explain with in Programs:-

// i)Arithematic Op:- +,-,*,/,%

// public class operator1 {

//     public static void main(String args[]){
//         int a = 34;
//         int b = 12;

//         System.out.println(a+b);
//         System.out.println(a-b);
//         System.out.println(a*b);
//         System.out.println(a/b);
//         System.out.println(a%b);
//     }
// }


// ii) Relational / Comparision Op:- <,>,<=,>=,==,!=


// public class operator1 {

//     public static void main(String args[]){

//         int a = 22 , b= 12;
//         System.out.println(a<b);
//         System.out.println(a>b);
//         System.out.println(a<=b);
//         System.out.println(a>=b);
//         System.out.println(a==b);
//         System.out.println(a!=b);
//     }
// }


// iii) Logical Op:- && , || , !

// public class operator1 {

//     public static void main(String args[]){
//         int a = 45, b=34;

//         System.out.println(a>b && a<b);
//         System.out.println(a<b || a>b);
//         System.out.println(!(a>b));

//     }
// }

// iv)Assignment Op:- +=, -=, =,*=,/=, %=


// public class operator1 {

//     public static void main(String args[]){
//         int a = 46, b= 23;

//         System.out.println(a+=b);
//         System.out.println(a-=b);
//         System.out.println(a=b);
//         System.out.println(a*=b);
//         System.out.println(a/=b);
//         System.out.println(a%=b);
//     }
// }


// v)Unary Op:- 
                // a) Prefix :- ++var --var
                // b) Postfix :- var-- var++

// public class operator1 {

//     public static void main(String args[]){
//         int x = 45, y=34;

//         System.out.println(++x);
//         System.out.println(x--);
//         System.out.println(--y);
//         System.out.println(y++);
//         System.out.println(x++ - --y);
//         System.out.println(--x + y++);
//     }
// }

// vi) Shift Op:- << >> >>>


// public class operator1 {

//     public static void main(String args[]){
//         int a = 45, t= 34;

//         System.out.println(a>>t);
//         System.out.println(a<<t);
//         System.out.println(a>>>t);
//     }

// }


// vii) Turnary Op:- ?: => Syx:- (Condition)?Expression1/True : Expression2/f/False


// public class operator1 {


//     public static void  main(String args[]){
//         int a = 56, b= 23;
//         int z= (a>b)?a:b;

//         System.out.println(z);
//     }
    
// }


// viii) Bitwise Op:- Bitwise AND(&), Bitwise inclusive OR(|), Bitwise Exclusive OR(^), Bitwise Complement(~)

//  BItwise AND(&) :-  

// public class operator1 {
//     public static void main(String[] agrs){

//         int a= 34, b= 23, c=25;
//         System.out.println(a>b & a<c);
//     }
    
// }


// Bitwise Inclusive OR(|) :- 


// public class operator1 {

//     public static void main(String args[]){
//         int a =45, b= 23, c=67;
        
//         System.out.println(a>b | a>c);
//     }
// }


// Bitwise Exclusive OR(^):-

/**
 * operator1
 */
// public class operator1 {

//     public  static void main(String args[]){
//         int a= 56, b= 23;

//         System.out.println(a^b);
//     }
// }


// Bitwise Complement(~):- It is also called (~) Tilde.

/**
 * operator1
 */
// public class operator1 {

//     public static void main(String args[]){

//         int t = 3;
//         System.out.println(~t);
//     }
// }

// --------------------------------------------------------------------------------------------------------------


// Type Casting :- Type Casting is when you assign a value of one primitive data type to
//                 another type.

// There are two type of Type Casting:-
// i) Widening Casting(automatically):- Convert a smaller type to a larger type size./**
 
// public class operator1 {

//     public static void main(String args[]){

//         int x= 23;
//         float y = (float)x;
//         System.out.println(y);
//     }

    

// }


// ii) Narrowing Cating(manually):-
// => converting a larger type to smaller size type.
// => Narrowing casting must be done mannual by placing the type 
// in parenthesis() in float of the value.


// Ex:-
// public class operator1 {

//     public static void main(String args[]){
//         double x = 034.d;
//         float y = (float)x;

//         System.out.println(y);

//     }
// }
