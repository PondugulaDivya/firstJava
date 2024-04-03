import java.util.Scanner;
 
public class Sub {
 
    public static void main(String[] args) {
 
        
        int x, y, subtract;
 
       
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter first number: ");
        
        x = sc.nextInt();
 
        System.out.print("Enter second number: ");
        
        y = sc.nextInt();
 
        
        subtract = x - y;
 
       
        System.out.println("The subtraction of the given two Numbers: " + subtract );
 
    }
 
}
