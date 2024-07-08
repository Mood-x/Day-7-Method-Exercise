
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 


        // ================== Task 1 ==================
        // 1 - Write a Java method to find the smallest number among three numbers.

        int[] numbers = {25, 37, 29}; 
        System.out.println(smallestNumber(numbers));



        // ================== Task 2 ==================
        // 2 - Write a Java method that check if the entered number is

        System.out.print("Enter the number: ");
        int number = input.nextInt(); 
        check(number); 

        // ================== Task 3 ==================
        // 3 - Write a Java method to check whether a string is a valid password.

        System.out.println("A password must have at least eight characters.\nA password consists of only letters and digits.\nA password must contain at least two digits\n");
        System.out.print("Input a password(You are agreeing to the above Terms and Conditions: ");
        String password = input.nextLine();

        System.out.println(isValid(password) ? "Password is valid: " + password : "Not a valid password: " + password);

    }



    // ============================================
    // ============================================

    // ================== Task 1 ==================
    // 1 - Write a Java method to find the smallest number among three numbers.

    public static float smallestNumber(int[] numbers){
        int smallest = numbers[0]; 

        for(int number : numbers){
            if(number < smallest){
                smallest = number; 
            }
        }
        return  smallest; 
    }



    // ================== Task 2 ==================
    // 2 - Write a Java method that check if the entered number is


        public static void check(int number){
            if(number < 0){
                System.out.println(number + " Negative");
            }else if(number > 0){
                System.out.println(number + " Positive");
            }else {
                System.out.println(number + " Zero");
            }
        }

        // ================== Task 3 ==================
        // 3 - Write a Java method to check whether a string is a valid password.



    
        public static boolean isValid(String password){

            if(password.length() < 8){
                return false;
            } 

            int letterCount = 0; 
            int numberCount = 0; 
            
            for(int i = 0; i < password.length(); i++){

                char character = password.charAt(i); 

                if(isNumber(character)){
                    numberCount++;
                }else if(isLetter(character)){
                    letterCount++;
                }else{
                    return  false;
                }   

            }

            return (letterCount >= 2 && numberCount >= 2); 
        }
        
        public static boolean isLetter(char character){
            character = Character.toUpperCase(character); 
            return (character >= 'A' && character <= 'Z'); 
        }

        public static boolean isNumber(char character){
            return (character >= '0' && character <= '9'); 
        }
}
