/**
 * 
 * @author: Amy Bian
 */

public class Account
{
  private String username;
  private String password;

  public Account()
  {
    int randomNumber = (int) (Math.random() * 1000);
    username = "guest";
    password = "guest" + randomNumber;
  }

  public Account(String initialName, String initialPassword)
  {
    username = initialName;
    password = initialPassword;
  }

  // add more mutator and accessor methods here
  public void changePassword(String newPassword)
  {
    if (!newPassword.equals(password))
    {
      password = newPassword;
    }
    else
    {
      password = "guest" + (int) (Math.random() * 1000);
    }
  }

  public void setUsername(String newName)
  {
    username = newName;
  }

  public String getPassword()
  {
    return password;
  }

  public String getUsername()
  {
    return username;
  }

  /**
   * The purpose of a toString accessor method is to
   * return the value of every instance variable in a nice format.
   */
  public String toString()
  {
    return "Your username is " + username + " and your password is " + password;
  }

}
