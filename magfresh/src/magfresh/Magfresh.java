
package magfresh;
import java.util.Scanner;


public class Magfresh {

  
    public static void main(String[] args) {
        Scanner fresh =new Scanner(System.in);
        System.out.println("Enter your message :3 -->");
        String input = fresh.nextLine();
        

boolean milk = false;

String[] words = input.split("\\s+");

    for(String word : words) {
        for(int i = 1; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                milk = true;
                break;
            }
        }
        if (milk) break; 
    }
    System.out.println(milk ? "you are so JEJE!" : "You're so cute uWu");
    
    }
}
        
          
        
        
      