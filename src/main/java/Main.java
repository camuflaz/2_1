// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    //System.out.println("H\ne\nl\nl\no\nW\no\nr\nl\nd\n!");
    Scanner ciag = new Scanner(System.in);
    String n = ciag.nextLine();
    
    for(int i = 0; i < n.length(); i++){
      System.out.println(n.charAt(i));      
    }
      
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}