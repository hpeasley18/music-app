
public class Artist extends Accounts{
  /*
  Only artist accounts can be listed as the creator of content.

  All classes should have necessary constructors, mutators, accessors, and toString methods.

  Make sure to test the functionality of each class as you go before moving
  on.
  */

  //default constructor
  public Artist() {
    super(); //super variables
  }

  //overloaded constructor
  public Artist(String n) {
    super(n);
  }

  //toString
  public String toString() {
    return name + "'s Artist Account";
  }

  //mainTEST
  // public static void main(String[] args) {
  //   Artist artist1 = new Artist("Samantha");
  //
  //   System.out.println(artist1.toString());
  // }
}
