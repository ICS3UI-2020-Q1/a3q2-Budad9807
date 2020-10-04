import java.util.Scanner;
/**
 *A program that figures out the animal on answers
 * @David
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input 
    Scanner input = new Scanner(System.in);

    // asks the user if the animal has feathers
    System.out.println("Does the animal have feathers? (yes or no)");
    String feathers = input.nextLine();
    if(feathers.equals("yes")){
      String Swins = input.nextLine();
     // asks the user if it swims
     System.out.println("Can the animal swim? (yes or no)");
     if(Swins.equals("yes")){
       // tells the user it a duck
       System.out.println("It is a duck!");
     }else{
       // if answered no 
       System.out.println("It is a hen!");
     }
    }else{
      // if answered no 
      String legs = input.nextLine();
      // asks the user if it has legs 
      System.out.println("Does it have legs? (yes or no)");
      if(legs.equals("yes")){
      // tells the user it is a Lizard
      System.out.println("It is a Lizard!");
      }else{
        // if answered no
        System.out.println("It is a Snake!");
      }

      

    }
    
    
  }
}
