import java.util.Scanner;

/**
 * Make no changes, but run this file to launch the app.
 * Copyright 2022+ VHS Learning.org
 */
public class ChatBotRunner2
{

  /**
   * Create a better ChatBot2, give it user input, and print its replies.
   */
  public static void main(String[] args)
  {
    ChatBot2 maggie = new ChatBot2();

    System.out.println(maggie.getGreeting());
    Scanner in = new Scanner(System.in);
    String statement = in.nextLine();

    while (!statement.equals("Bye"))
    {
      System.out.println(maggie.getResponse(statement));
      statement = in.nextLine();
    }
    System.out.println("It was great chatting with you! Bye!");
  }

}
