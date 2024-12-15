import java.util.*;

public class Loops_to_function {
	public static void main(String[] args) {

		// Loops - Runs a code for some fixed number of times/iterations

		/*
		for(Instantiation, Conditions, updation){
		 Body of the Loops
		}
		*/

		// I -> C -> B -> U -> C -> B -> U -> C -> B -> U -> C -> B -> U -> C -> B -> U -> C -> B -> U


		// Sum of all natural numbers
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 int sum = 0;
		 for(int i = 0; i<=n; i= i+1){
		 System.out.println(i);
			sum += i;
		 }
			System.out.println("Sum of all numbers from 1 - n: " + sum);

		*/


		// Sum of all numbers which is divisible by 5

		/*
		int n = 50;
		long sum = 1;
		for(int i = 1; i<=n; i++){
		 if(i%5 == 0){
		 sum *= i;
		 }
		}
		System.out.println("sum of numbers that is divisible by 5: "+ sum);
		*/


		//*************** producct of all numbers from 1-10 **************
		/*
		int n = 10;
		int p = 1;
		for(int i = 1; i<=n; i++){
		 p *= i;
		}
		System.out.println(p);
		*/

		/************************
		 * Error:
		 * 1. Compile time Errors: Errors that happens while Compilation of code
		 * 2. Run time Errors: Errors that happens while running or executing the code.
		**********************/


		/*************** Error: Variable might not be initialised ***********/
		// int a;
		// System.out.println(a);



		/***************bb Error: Variable might not be initialised ***********/
		// int a;
		// int b = 30;

		// if(b > 20){
		//    a = 10;
		// }
		// System.out.println(a);



		/***************bb No Error as in both cases of if being true/false the Variable a has a value ***********/
		/*
		int b = 30;
		int a;

		if(b > 20){
		   a = 10;
		}
		else{
		 a = 5;
		}
		System.out.println(a);
		*/


		/********************************************/

		/*
		int n = 20;
		int i = 2;
		for(; i<=n; i=i+2){
		System.out.println(i);
		}

		System.out.println("After the loop, when Conditions got false: " + i );
		*/


		/********************* Infinite loop ***********************/

		// int n = 10;
		// for(int i = 1; i <= n; ){
		//  System.out.println(i);
		// }


		/*___________ Flow control - break/continue _________________*/

		// for(int i = 0; i<=10; i++){
		//  if(i == 5){
		//   break;
		//  }
		//  System.out.println(i);
		// }


		// for(int i = 1; i<=100; i++){
		//  if(i%25 == 0){
		//   // break;
		//   continue;
		//  }
		//  System.out.println(i);
		// }


		//*************** Print all number from 1 to 100 except multiple of 7

		// for(int i = 0; i<=100; i++){
		//  if(i%7 == 0){
		//   continue;
		//  }
		//  System.out.println(i);
		// }


		/*~~~~~~~~~~~~~~~~~~~~~  While-Loop  ~~~~~~~~~~~~~~~~~~~~~~*/
		// C -> B -> C -> B -> C -> B -> C -> B -> C -> B -> C -> B -> C -> B -> C -> B ->
		// while(condtion){
		//  Body of loop
		// }


		// int i = 1;
		// while(i <= 10){
		//  System.out.println(i);
		//  i = i+1;
		// }


		//~~~~~~~~~~~~~~~~~ print all number of the digit in reverse UnsupportedOperationException ~~~~~~~~~~~~~~~~~~~~~
		/*
		int n = 26874;
		int p = n;
		int sum = 0;

		while(n > 0){
		 int i = n%10;
		 sum = sum+i;
		 System.out.println(i);
		 // System.out.println(sum);
		 n = n/10;
		}

		System.out.println(p);
		System.out.println("Sum of all digits: " + sum);
		// */


		/************* Count of digits ***************/

		// long n = 961128L;
		// int ct = 0;

		// while(n != 0){
		//  long d = n % 10;
		//  ct++;
		//  n = n /10;
		// }
		// System.out.println(ct);



		// _____________________
		/*

		int n = 123456789;
		int sum = 0;
		int ct = 0;

		while(n > 0){
		 int d = n%10;

		 if(d == 0){
		  ct = ct + 1;
		 }else{
		  break;
		 }

		 // sum += d;
		 // System.out.println(d);
		 //  n = n/10;
		}

		// System.out.println(sum);
		System.out.println(ct);

		*/

		//~~~~~~~~~~~~ Factor or any number
		/*
		int n = 54;
		for(int i = 1; i<=n; i++){
		 if(n % i == 0){
		 System.out.println(i);
		 }
		}
		*/


		// for(;;){
		//  System.out.println("Infinite Loop");
		// }


		// int a = 10;
		// if(a < 5);
		//  {
		//  System.out.println("Hello");
		// }


		// Delay Loops
		// for(long i = 1; i<= 10000000000L; i++); // Focus semicolon
		//  System.out.println("Hello");


		// b- Print all digits of a number   using while loop
		/*
		int n  = 1254;
		int p = n;
		int sum = 0;

		while(n >  0){
		 int d = n % 10;
		 System.out.println(d);
		 n = n/10;
		 sum += n;
		}
		System.out.println(p);
		System.out.println(sum);

		*/

		//******** print digits program and sum of digits *********
		/*
		Scanner sc = new Scanner(System.in);
		int n = 613887;
		int sum = 0;
		while(n > 0){
		 int d = n % 10;
		 System.out.println(d);
		 sum = sum + d;
		 n = n / 10;
		}
		System.out.println(sum);
		*/



		/*********** Print only even number from the digits ************/
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// while(n > 0){
		//  int d = n % 10;
		//  if(d %2 == 0){
		//  System.out.println(d);
		//  }
		//  n = n/10;
		// }


		/***************** Add number at last of the digits ******************/
		// Scanner sc = new Scanner(System.in);
		// int ad = sc.nextInt();
		// int n = 1546;
		// int rever = 1;

		// while(n == n){
		//  // int d = n % 10;
		//   rever = n * 10 + ad;
		// System.out.println(rever);
		// }





		/*****************b- reverse the number of the digits ******************/

		// int n = 95743;
		// int rev = 0;

		// while(n > 0){
		//  int d = n % 10;
		//  rev = rev * 10 + d;
		//  // System.out.println(rev);
		//  n = n/10;
		// }
		//  System.out.println(rev);


		/*****************b-  if number is negative  then reverse the number of the digits ******************/

		// int n = -95743;

		// if(n < 0){
		//  n = n * -1;
		// }

		// int rev = 0;

		// while(n != 0){
		//  int d = n % 10;
		//  rev = rev * 10 + d;
		//  // System.out.println(rev);
		//  n = n/10;
		// }
		//  System.out.println(rev);




		//**************** b- Palindrom number - number equal to its reverse
		/***** Method-1 *****/
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();

		// int rev = 0;
		// while(n > 0){
		//  int d = n % 10;
		//  rev = rev * 10 + d;
		//  System.out.println(d);
		//  n = n/10;
		// }

		// System.out.println(rev);


		/***** Method-2 *****/
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// int rev = 0;
		// int p = n; //*** b-  var p is use for Palindrom  because the vaue of n became 0 at the end of While-Loop

		// while(n > 0){
		//  int d = n % 10;
		//  rev = rev * 10 + d;
		//  // System.out.println(d);
		//  n = n / 10;
		// }
		// System.out.println(rev);
		// System.out.println(p);


		// if(p == rev){
		//  System.out.println("Entered number is Palindrom");
		// }else{
		//  System.out.println("Entered number is not Palindrom");
		// }

		/*********** ________ Do-while Loop ___________ ***********/
		/*^^^^^^^^^^^^^^^^^^^^^^^
		  1. Entry controlled loops - These are loops where Conditions check is happening prior to the body;(eg. for, while)
		  2. Exit controlled loops  - These are loops where Conditions check happens after the body; (eg, Do-while loop)
		^^^^^^^^^^^^^^^^^^^^^^^^^*/

		// C -> B -> C -> B -> C -> B -> C

		// int n = 1;
		// do {
		//  System.out.println(n);
		//  n = n + 1;
		// }while(n >= 10);



		//**************** b-  Program to check wheather is a Prime number or not

		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();

		// int ct = 0;

		// for(int i = 1; i<=n; i++){
		//  if(n%i == 0){
		//   ct++;
		//  }
		// }

		// if(ct == 2){
		//  System.out.println(ct + " is a prime number");
		// }else{
		//  System.out.println(ct + " is not a prime number");
		// }


		/****************** check prime number Using For Loop  ********************/
// 		int ct = 0;
// 		int n = 123;
// 		for(int i = 1; i<=n; i++) {
// 			if(n%i == 0) {
// 				ct = ct + 1;
// 				System.out.println(i);
// 			}
// 		}
// 		System.out.println(ct);
// 		if(ct == 2) {
// 			System.out.println("Prime");
// 		} else {
// 			System.out.println("Not Prime");
// 		}





		//**************** b-b-  b(   Find all the prime number in the range of  1-100      b-b-
		// ________ In this queston may occur error (Time limite Exceed) -- To remove error watch video (Nested Loop: 1:15 hr)_________

		// for (int j = 0; j <= 100; j++) {
		//     int n = j;
		//     int ct = 0;
		//
		//     for (int i = 1; i <= n; i++) {
		//         if (n % i == 0) {
		//             ct++;
		//         }
		//     }
		//
		//     if (ct == 2) {
		//         System.out.println(n);
		//     }
		// }


		//**************** b-  Program to to print fibonacci series

		// Scanner scn = new Scanner(System.in);
		// int n = scn.nextInt();
		// 	//Write code here

		// int a = 0, b = 1, c;
		//  // 0 1 2 3 4 5 6
		//  // a b c d e f

		// for(int i = 0; i<=n; i++){
		//   System.out.println(a);
		//   c = a + b;
		//   a = b;
		//   b = c;
		// }








		//**************** b# b-  Program to check wheather is Armstrong  or not		in between range

		/* Armstrong -->
		Three-digit Armstrong numbers:
		153 (1^3 + 5^3 + 3^3 = 153)
		370 (3^3 + 7^3 + 0^3 = 370)
		371 (3^3 + 7^3 + 1^3 = 371)
		407 (4^3 + 0^3 + 7^3 = 407)

		Four-digit Armstrong numbers:
		1634 (1^4 + 6^4 + 3^4 + 4^4 = 1634)
		8208 (8^4 + 2^4 + 0^4 + 8^4 = 8208)
		9474 (9^4 + 4^4 + 7^4 + 4^4 = 9474)

		Five-digit Armstrong number:
		54748 (5^5 + 4^5 + 7^5 + 4^5 + 8^5 = 54748)


		--*/




		// Scanner sc = new Scanner(System.in);
		// int r = sc.nextInt();
		//write code here

// 		for (int i = 1; i <= r; i++) {
// 		    int n = i;
// 		    int sum = 0;
// 		    int p = n;

// 		    while (n != 0) {
// 		        int d = n % 10;
// 		        sum = sum + d * d * d;
// 		        n = n / 10;
// 		    }

// 		    if (sum == p) {
// 		        System.out.println(p);
// 		    }
// 		}



		/********** bo8b3o8  Pattern Printing*o8b#b( ***********/

		// 123
		// 123
		// 123
		// 123

		/*

		for(int j = 1; j<=4; j++ ) {
			for(int i = 1; i<=3; i++) {
				System.out.print(i);
			}
			System.out.println();
		}

		*/


		// ****** Rules for pattern printing *******
		// 1. Outer loop should run for the number of rows in pattern
		// 2. Inner loop should run for number of values in each row


		// for(int j = 1; j<=5; j++){
		//  for(int i = 1; i<=j; i++){
		//   // System.out.print(*);
		//   System.out.print(i);
		//  }
		//  System.out.println();
		// }




		//  Scanner sc = new Scanner(System.in);

		/*

		for(int i = 0; i<=50; i++) {
			int n = i;
			int sum  = 0;

			while(n !=  0) {
				int d = n % 10;
				sum += d;
				n = n/10;
			}

			System.out.println(sum);
		}

		*/



		/***********
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		************/
		// for(int i = 1; i<=5; i++){
		//  for(int j = 1; j<=i; j++){
		//   System.out.print(i);
		//  }
		//  System.out.println();
		// }




		/************
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		***********/
		// for(int i = 1; i<=5; i++){
		//  for(int j = 1; j<=i; j++){
		//   System.out.print(j);
		//  }
		//  System.out.println();
		// }



		/************
		 * b#b#b#b#b#b#b#
		 * 5
		 * 54
		 * 543
		 * 5432
		 * 54321
		***********/

		// for(int i = 5; i>=1; i--){
		//  for(int j = 5; j>=i; j--){
		//   System.out.print(j);
		//  }
		//  System.out.println();
		// }






		/************
		 * 5
		 * 54
		 * 543
		 * 5432
		 * 54321
		**********/
		// for(int i = 5; i>=1; i--){
		//  // int k = 5;
		//  for(int j = 5; j>=i; j--){
		//   System.out.print(j);
		//   // k = k - 1;
		//  }
		//  System.out.println();
		// }




		// ****** Rules for pattern printing *******

		// 1. Outer loop should run for the number of rows in pattern
		// 2. Inner loop should run for number of values in each row
		// 3. The vaue which will be printing will be constant or related to i/j (i, i+1, i-1, n-1, n-i+1, n-i-1)
		/************
			 * 5
			 * 45
			 * 345
			 * 2345
			 * 12345
			**********/
		// for(int i = 1; i<=5; i++){
		//  int k = 5-i+1;
		//  for(int j = 1; j<=i; j++){
		//   System.out.print(k);
		//   k = k + 1;
		//  }
		//  System.out.println();
		// }



		/******************
		    #
		   ##
		  ###
		 ####
		#####
		********************/
// 		Scanner scn = new Scanner(System.in);
// 		int n = scn.nextInt();
// 		for (int i = 1; i <= n; i++) {
// 		    for (int k = 1; k <= n - i; k++) {
// 		        System.out.print(" ");
// 		    }
// 		    for (int j = 1; j <= i; j++) {
// 		        System.out.print("#");
// 		    }
// 		    System.out.println();
// 		}




		/****************
		 ~~~~~~~~~~~~~~~
		    *
		   * *
		  * * *
		 * * * *
		* * * * *
		****************/
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		//Write your code here
// 		for (int i = 1; i <= n; i++) {
// 		    for (int k = 1; k <= n - i; k++) {
// 		        System.out.print(" ");
// 		    }
// 		    for (int j = 1; j <= i; j++) {
// 		        System.out.print("* ");
// 		    }
// 		    System.out.println();
// 		}




		/*****************
		 * A
		 * AB
		 * ABC
		 * ABCD
		 * ABCDE
		******************/
		// _____ M-1
// 		for(char c = 'A'; c<='E'; c++){
// 		 for(char c1 = 'A'; c1<=c; c1++){
// 		  System.out.print(c1);
// 		 }
// 		 System.out.println();
// 		}



		// ____ M-2
		// for(int i = 1; i<=5; i++){
		// for(int j = 1; j<=i; j++){
		//   System.out.print((char)(j+64));
		// }
		// System.out.println();
		// }


		//_____________ Factorial using function _____________

// 		int n = 5;
// 		int fact = 1;
// 		for(int i = 1; i<=n; i++) {
// 			fact = fact * i;
// 		}
// 		System.out.println(fact);



// 		int a = 0;
// 		int b = 1;
// 		int c = 0;
// 		System.out.print(a + " ");
// 		System.out.print(b + " ");
// 		while(c<=15) {
// 			c = a + b;
// 			a = b;
// 			b = c;
// 			System.out.print(c + " ");
// 		}


		//_____________ Factorial using function _____________

// 		Scanner sc  = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		int a = 0, b = 1, c;

// 		for(int i = 1; i<=n; i++) {
// 			for(int j = 1; j<=i; j++) {
// 				System.out.print(a + " ");
// 				c = a + b;
// 				a = b;
// 				b = c;
// 			}
// 			System.out.println();
// 		}









	}
}
