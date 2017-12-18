import java.util.Scanner;

public class AreaCalculator {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int answer, base, height, length, width, radius, sLength;
        
        System.out.print("1) Triangle\n" + "2) Rectangle\n" + "3) Square\n" + "4) Circle\n" + "5) Quit\n" + "Which shape: ");
        answer = keyboard.nextInt();
        
        
        while(answer != 5){
        
            if(answer == 1){
            
                System.out.print("Base: ");
                base = keyboard.nextInt();
                System.out.print("Height: ");
                height = keyboard.nextInt();  
                System.out.println( "The area is " + area_triangle(base, height) + "\n");
                
                System.out.print("1) Triangle\n");   
                System.out.println("2) Rectangle");
                System.out.println("3) Square");
                System.out.println("4) Circle");
                System.out.println("5) Quit");
                System.out.println("Which shape: ");
               answer = keyboard.nextInt();
            
            }else if(answer == 2){
            
                System.out.print("Length: ");
                length = keyboard.nextInt();
                System.out.print("Width: ");
                width = keyboard.nextInt();   
                System.out.println( "The area is " + area_rectangle(length, width) + "\n");
                
                System.out.print("1) Triangle\n" + "2) Rectangle\n" + "3) Square\n" + "4) Circle\n" + "5) Quit\n" + "Which shape: ");
                answer = keyboard.nextInt();
                
            }else if(answer == 3){
            
                System.out.print("Side length: ");
                sLength = keyboard.nextInt();
                System.out.println( "The area is " + area_square(sLength) + "\n");
                
                System.out.print("1) Triangle\n" + "2) Rectangle\n" + "3) Square\n" + "4) Circle\n" + "5) Quit\n" + "Which shape: ");
                answer = keyboard.nextInt();
            
            }else if(answer == 4){
            
                System.out.print("Radius: ");
                radius = keyboard.nextInt();
                System.out.println( "The area is " + area_circle(radius) + "\n");
                
                System.out.print("1) Triangle\n" + "2) Rectangle\n" + "3) Square\n" + "4) Circle\n" + "5) Quit\n" + "Which shape: ");
                 answer = keyboard.nextInt();
            
            }else
            {
              answer = 5;
            }
        }
    
    }
    
    public static double area_circle( int radius ){
   
        return   Math.PI * (radius * radius) ;
    }        
    
     public static double area_triangle( int base, int height ){
    
        return 0.5 * (base * height);
    }
    
    public static int area_rectangle( int length, int width ){
    
        return length * width;
    }
    public static int area_square( int side ){
    
        return side * side;
    }

}