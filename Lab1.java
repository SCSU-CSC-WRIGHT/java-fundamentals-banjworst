public class Lab1 {
    public static void main(String[] args) { 

        //Exercise 1
        System.out.println("Hello, World!");

        //Exercise 2 
       int num = 10; 
       String message = "The number is";
       System.out.println(message + num);

       //Exercise 3 
       if(num % 2 == 0){
            System.out.println("Even");
       }else{ 
            System.out.println("Odd");
       }
       

       //Exercise 4 
       for (int i = 0; i <= 4; i++) {
            System.out.println(i);
       }

       //Exercise 5
         greet("Alice");
    }
       public static void greet(String name){
            System.out.println("Hello, " + name);
       }

    }
    
    

