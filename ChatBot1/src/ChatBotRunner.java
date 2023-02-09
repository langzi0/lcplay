import java.util.Scanner;

/**
 * A simple class to run the ChatBot class.
 * Make no changes to this file. Make changes in ChatBot2.java
 */
public class ChatBotRunner
{

  /**
   * Create a ChatBot, give it user input, and print its replies.
   */
  public static void main(String[] args)
  {
    ChatBot1 lisa = new ChatBot1();

    System.out.println(lisa.getGreeting());
    Scanner in = new Scanner(System.in);
    String statement = in.nextLine();

    while (!statement.equals("Bye"))
    {
      System.out.println(lisa.getResponse(statement));
      statement = in.nextLine();
    }
    System.out.println("It was great chatting with you! Bye!");
  }

}
