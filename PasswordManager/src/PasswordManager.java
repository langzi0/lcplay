/**
 * 
 * @author: Amy Bian
 */

public class PasswordManager
{

  public static void main(String[] args)
  {
    // We've created four instances of the Account class here
    Account martha = new Account();
    Account bill = new Account("billgates@microsoft.com", "Micr0softRulez!");
    Account clark = new Account();
    Account lois = new Account("lois@me.com", "lovesuperman");

    // add demonstrations of accessor, mutator methods here:
    System.out.println("Welcome User 1\n");
    System.out.println(martha.toString());
    martha.changePassword("1721340");
    martha.setUsername("Marvelous Martha");
    System.out.println(martha.getUsername());
    System.out.println(martha.getPassword());
    System.out.println(martha.toString() + "\n");

    System.out.println("Welcome User 2\n");
    System.out.println(bill.toString());
    bill.changePassword("Micr0softRulez!");
    bill.setUsername("Billy");
    System.out.println(bill.getUsername());
    System.out.println(bill.getPassword());
    System.out.println(bill.toString() + "\n");

    System.out.println("Welcome User 3\n");
    System.out.println(clark.toString());
    clark.changePassword("ilovecoding!");
    clark.setUsername("Clark the Great");
    System.out.println(clark.getUsername());
    System.out.println(clark.getPassword());
    System.out.println(clark.toString() + "\n");

    System.out.println("Welcome User 4\n");
    System.out.println(lois.toString());
    lois.changePassword("lovesironman");
    lois.setUsername("Lou Lou");
    System.out.println(lois.getUsername());
    System.out.println(lois.getPassword());
    System.out.println(lois.toString() + "\n");
  }

}
