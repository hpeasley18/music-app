// Hunter Peasley
// 2390162
// hpeasley@chapman.edu
// CPSC 231 - 05
//PART 1: Accounts.java
import java.util.Random;
import java.util.LinkedList;

public abstract class Accounts{

  // member variable
  protected String name;

  // default constructor
  public Accounts() {
    name = "";
  }

  // overloaded constructor
  public Accounts(String n) {
    name = n;
  }

  //mutator
  public void setUserName(String n) {
    name = n;
  }

  //accessor
  public String getUserName() {
    return name;
  }

  //toString
  public String toString() {
    return name + "'s Music Account";
  }

  // mainTEST
  // public static void main(String[] args) {
  //   Artist artist1 = new Artist("Samantha");
  //
  //   System.out.println(artist1.toString());
  //
  //   Listener me = new Listener("Bob");
  //   System.out.println(me.toString());
  //
  // }
}
