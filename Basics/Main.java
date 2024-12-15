import java.util.*;

public class Main{
	public static void main(String[] args) {
	    
	    // Comments - These are lines of code that does not run (ctrl + /)
	    
	    // Single line comment 
	    
	    /**
	     * Multi line comment 
	     * 
	     * line 2 of comment 
	     * 
	     */
	    
	    // Case sensitive language - Capital and small alphabets have different meaning in the language 
		
		   // All instruction/statement end with a semi-colon ; 
		   // ; - Terminator
		
     // System.out.println("Hello Arjun!!");
     // System.out.println("Hello Rahul!!");
		
     // System.out.print("hello");
     // System.out.print("hello 2");
     
     // System.out.println(1234);
     
        // System.out.printf("hello");
        // System.out.printf("hello 2");
        
        // format specifier - %.2f 
        // System.out.printf("%.5f", 123.45242);
        
        // System.out.println("Hello 1");
        // System.out.print("Hello 2");
        // System.out.println("Hello 3");
        
        // Data - numbers, large number, decimal number, large decimal numbers, character, text 
        // Data types - int, long, float, double, char, String, boolean 
        
        // Varaible - Box that can store one value of a single data type
        // Rules for naming the variables 
        // 1. It can contain alphabets, digits and special character _
        // 2. It can begin with alphabet or _ 
        // 3. It cannot contain spaces. camelCase, SentenceCase, under_score
        // 4. It cannot be a keyword (48 words)
        // 5. We cannot access a variable before creation 
        // 6. There cannot be 2 variables with the same name in the same scope 
        
        // Scope - Area in which the variable is accessible 
        // 1. A variable is only accessible in its scope
        // {
        //     int a = 10;
        // }
        // System.out.println(a); // error: a is not accessible here 
        
        // 2. A variable is accessible in all the child scopes 
        
        // int a = 20;
        // {
        //     System.out.println(a);
        //     {
        //         System.out.println(a);
        //     }
        // }
        
        // int a = 20;
        // {
        //     int a = 10; // Error: Variable with the name a already exists 
        //     System.out.println(a);
        // }
        
        // {
        //     int a = 10;
        //     System.out.println(a);
        // }
        
        // {
        //     int a = 20;
        //     System.out.println(a);
        // }
        
        // {
        //     int a = 10;
        //     System.out.println(a);
        // }
        
        // int a = 20;
        // System.out.println(a);
        
        // String firstName = "Devesh";
        
        // System.out.println(firstName);
        
        // int a = 10;
        // System.out.println(a);
        
        // a = 20;
        // System.out.println(a);
        
        // int a = 100; // Not allowed to create as variable a already exists
        // System.out.println(a);
        
        // a = 20;
        // System.out.println(a);
        
        // long l = 124;
        
        // System.out.println(l);
        
        // double d = 10.2344;
        
        // System.out.println(d);
        
        // Arthmatic operators :- +, -, *, /, % (modulo)
        
        // int a = 17;
        // int b = 4;
        
        // int s = a + b;
        // int d = a - b;
        // int m = a * b;
        // int q = a / b;
        // int r = a % b;
        
        // System.out.println(s);
        // System.out.println(d);
        // System.out.println(m);
        // System.out.println(q);
        // System.out.println(r);
        
        // double d1 = a;
        // double d2 = b;
        
        // double d = d1 / d2;
        
        // System.out.println(d);
        
        // System.out.println(a);
        
        // byte b = 12;
        // System.out.println(b);
        
        // short s = 123;
        // System.out.println(s);
        
        // byte < short < int < long 
        
        // Default types 
        // numbers - int
        // decimal number - double 
        
        // System.out.println(12344);
        // System.out.println(13/4);
        
        // int a = 12234273874848;
        
        // long l = 12234273874848L;
        // System.out.println(l);
        
        // double d = 14.456323637;
        
        // float f = 14.456323F;
        
        // System.out.println(f);
        
        // char c = ' ';
        
        // System.out.print(c);
        // System.out.println("hello");
        
        // boolean b = false;
        
        // System.out.println(b);
        
        // Units
        // 1/0        - 1 bit 
        // 4 bits     - 1 nibble 
        // 8 bits     - 1 byte 
        // 1024 bytes - 1 KB
        // 1024 KB    - 1 MB 
        // 1024 MB    - 1 GB 
        // 1024 GB    - 1 TB 
        
        // 1 KB - 1 kilobytes - 1024 bytes - 1024 * 8 bits 
        // 1 Kb - 1 kilobits - 1024 bits 
        
        // HW: Why 1024 ?? Why not 1000 ?
        
        // Size of data type 
        // byte - 1 byte 
        // short - 2 byte 
        // int - 4 bytes 
        // long - 8 bytes 
        // float - 4 bytes 
        // double - 8 bytes 
        // char - 2 bytes 
        // String - 2 * no. of chars 
        // boolean - 1 bit 
        
        // Type conversion - conversion of data from one type to another 
        // Implicit - Conversion that happens automatically
            // a. Storing a number to decimal number 
            // b. Storing a small box value into a large box 
        // Explicit - Conversion done forcefully 
            // a. Storing a decimal number into number 
            // b. Storing a large box value into small box
            
        // left -> right -> Implicit
        // int -> long -> float -> double 
        // right->left -> Explicit
        
        // long l = 1234747647448l;
        
        // float f = l;
        
        // System.out.println(f);
        
        // double d = 10.3673;
        
        // int a = (int)d;
        
        // long l = 123436L;
        
        // int a = (int) l;
        
        // System.out.println(a);
        
        // float f = 123.377f;
        
        // double d = f;
        
        // double d = 13.37484;
        
        // float f = (float)d;
        
        // System.out.println(f);
        
        // int a = 13;
        // int b = 4;
        
        // double d = (double)a / b;
        
        // System.out.println(d);
        
        // int a = 10;
        // int b = 0;
        
        // int c = a / b;
        
        // System.out.println(c);
        
        // double d = 192.4894;
        
        // int a = (int) d;
        
        // System.out.println(a);
        
        // Ranges of data types 
        
        // int - 4 bytes -  -2^31 to 2^31-1
        // long - 8 bytes - -2^63 to 2^63-1
        
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(Long.MIN_VALUE);
        
        // System.out.println(Double.MIN_VALUE);
        // System.out.println(Double.MAX_VALUE);
        
        // System.out.println(Float.MIN_VALUE);
        // System.out.println(Float.MAX_VALUE);
        
        
        
        // double d = 1233634.468474974484684;
        
        // System.out.println(d);
        
        // Taking input 
        // Scanner sc = new Scanner(System.in);
        // nextInt(), nextLong(), nextFloat(), nextDouble(), nextBoolean() 
        // next() - Reads the first word of input 
        // nextLine() - Reads the entire line of input 
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // int s = a + b;
        
        // double d1 = sc.nextDouble();
        // double d2 = sc.nextDouble();
        
        // double d = d1 + d2;
        
        // System.out.println(d);
        
        // String s = sc.nextLine();
        
        // System.out.println(s);
        
        // char c = sc.next().charAt(0); 
        
        // System.out.println(c);
        
        // sc.close();
        
        // int a = sc.nextInt();
        
        // Math functions 
        
        // System.out.println(Math.max(10, 23));
        // System.out.println(Math.min(10, 23));
        // System.out.println(Math.pow(3, 4)); // 3^4
        // System.out.println(Math.sqrt(25));
        // System.out.println(Math.round(12.55));
        // System.out.println(Math.floor(12.99));
        // System.out.println(Math.ceil(12.23));
     
        // System.out.println(Math.ceil(-2.34));   
        
        // System.out.println(Math.abs(-34));
        
        // System.out.println((int)(Math.random() * 10000 + 1000));
        
        // Precedence of operators - (*, /, %) (+, -) 
        
        // int s = 10 * 3 + 4; // 34
     
        // int s = 10 / 3 * 2 ; // 6  
        
        // int s = 10 * 3 / 2 ; // 15 
        
        // int s = 10 * (3 / 2);
        
        // System.out.println(s);
        
        /*
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the  value of a : ");
        int a = sc.nextInt();
        
        System.out.print("Enter the  value of b : ");
        int b = sc.nextInt();
        // int a = 17;
        // int b = 4;
        
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        
        */ 
        
        /*
        double d1 = a;
        double d2 = b;
        double d = d1%d2;
        
        System.out.println(d);
        */ 
        
        /*
        double a = 99.1131942657154531;
        // format specifier 
        System.out.printf("%.7f", a \n);
        System.out.println(a);
        */ 
        
        /* Scope - Area in which variable is accessible */ 
        
        
        /* 
        int b = 54;
        {
            int a = 12;
            System.out.println(a);
            System.out.println(b);
            {
                // int a = 65; // error:- variable already declared inside the scope
                int c = 65;  
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }
            // System.out.println(c);
        }
            // System.out.println(a); // error:- variable cannot access outside the scope
         
         */
            
            /*
            // int a = 51125424454554;
            Long l = 51125424454554L;
            System.out.println(a);
            System.out.println(l);
            */ 
            
            /*
            
            double d = 41.655653235454464;
            float f = 41.655653235454464f;
            
            int a = (int)d;
            System.out.println(a);
            System.out.println(f);
            
            */ 
            
            /*
            int a = 21;
            int b = 5;
            float d = (float)a/b;
            System.out.println(d);
            */ 
            
            /*
            // Range of data type
            // int  - 4 bytes -  -2^31 to 2^31-1
            // long - 8 bytes -  -2^64 to 2^64-1
            
            System.out.println(Integer.MAX_VALUE);
            System.out.println(Integer.MIN_VALUE);
            
            System.out.println(Long.MAX_VALUE);
            System.out.println(Long.MIN_VALUE);
            */ 
            
            /*
            nextInt(), nextLong(), nextDouble(), nextFloat(), nextBoolean();
            next() - (for string) Reads first word of the input
            nextLine() - (for string) Reads the entire line of the input.
            */ 
            
            // Scanner sc = new Scanner(System.in);
            // String s = sc.nextLine();
            // System.out.println("My Name:"+ s);
            
            
            /*
            
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);
            System.out.println(c);
            */
            
            /*
            sc.close();
            int a = sc.nextInt();
            System.out.println(a);
            */
            
            //________ Math functions _________
            
            // System.out.println(Math.max(10,23));
            // System.out.println(Math.min(10,23));
            
            // System.out.println((int)Math.pow(2,5));
            // System.out.println(Math.sqrt(32));
            // System.out.println(Math.floor(56.99));
            // System.out.println(Math.ceil(12.1));
            // System.out.println(Math.round(13.50));
            
            // System.out.println(Math.floor(-3.1));
            // System.out.println(Math.ceil(-3.99));
            // System.out.println(Math.round(-3.51));
            // System.out.println(Math.abs(-23));
            
            // System.out.println(Math.random() * 10000 ); // random number b/w 0-1 (OTP)
            // System.out.println((int)(Math.random() * 10000 + 1000)); // +1000 use to avoid generate 3 digit probem
            // System.out.println((int)(Math.random() * 9000 + 1000)); // *9000 use to avoid generate 5 digit probem
         
         
           // Precedence of operators - (*, /, %) (+, -)
           
           
         /*
          Scanner sc = new Scanner(System.in);
          int celcius = sc.nextInt();
          int farenhite = (32 + celcius * (9/5));
          System.out.println(farenhite);
         */   
         
         
        /*
         
        int a = 200;
        int b = 20;
        int c = 1;
         
        if(a > b && a > c){
            System.out.println("a is greate");
        }else if(b>c && b>a){
            System.out.println("b is greate");
        }else{
            System.out.println("C is greate");
        }
         
        */  
         
        //  Nested ifs - if conditions present insidea another if
         
        // ASCII - American standard code for information interchange
        // a-z => 97-122
        // a-z => 65-90 
        // 0-9 => 48-57 
        
        /*
        char c = 'z'; // character cannot show inside double quotes
        int n = c;
        System.out.println(n);
        */
        
        
        /*        */
        
        // char c = 'Z';
        
        // if(c >= 'a' && c <='z'){
        //     System.out.println("Lower case");
        // }else if(c >= 'A' && c <= 'Z'){
        //     System.out.println("Uppar case");
        // }else if(c >= '0' && c <= '9'){
        //     System.out.println("You Enter number");
        // }else{
        //     System.out.println("Special character");
        // }
        
        
        
        
        /*         */ 
        
        // char c = 't';
        // Scanner sc = new Scanner(System.in);
        // char c = sc.next().charAt(0);
        // char a = (char)(c - 19);
        // System.out.println(a);
        
     
        
        
        // 1. can't use multiple else in a single if (can use multiple else if statement)
        // 2. Without bracket we can have at max as a part of if
        // Without scope if conditions true then all lines of code will be execute 
        // if condition false then 1st line of code will not be execute remaining all will be execute
        
        // (if conditions true then all parts 
        //    will be print and if condtiton false then only all statement will be print except the !st) ✅
        
        // int a = 45;
        // if(a < 21)
        // System.out.println("true");
        // System.out.println("false");
        // System.out.println("Default");
        // System.out.println("Default");
        
        
        
        // Without scope if conditions true then all lines of code will be execute 
        // if condition false then 1st line of code will not be execute remaining all will be execute
        
        /*
        int a = 5;
        if(a < 2)
        System.out.println("true");
        System.out.println("another");
        else
        System.out.println("false");
        */ 
       
       // 3. Danling else - Else always belong to the immediate if
        
        
        
        
        int a = 5;
        
        if (a < 10)
            if(a < 20)
              System.out.println("statement-1");
            else if(a >= 3)
              System.out.println("statement-2");
            else
              System.out.println("statement-3");
        else
            System.out.println("statement-4");
            
       
            
	}
}
