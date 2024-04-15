import java.util.LinkedList;

public class Listener extends Accounts{
  /*
  Listener accounts should have a member variable to store all of the content favorited by that user and a method favorite()
  that accepts a piece of content as input and adds that content to the listener's favorites.

  All classes should have necessary constructors, mutators, accessors, and toString methods.

  Make sure to test the functionality of each class as you go before moving
  on.
  */

  //member variable
  public LinkedList<Content> myFavorites; //listener's favorites

  //default constructor
  public Listener() {
    super();
    myFavorites = new LinkedList<Content>();
  }

  //overloaded constructor
  public Listener(String n){
    super(n);
    myFavorites = new LinkedList<Content>();
  }

  //favorite method
  public void favorite(Content myFavoriteContent){
      myFavorites.add(myFavoriteContent); //add favorite content
      System.out.println("Your favorited content is " + myFavoriteContent.getTitle()); //print favorite content
  }

  // mutator
  public void setFavorites(LinkedList<Content> myfavoriteContent){
    myFavorites = myfavoriteContent;
  }

  // accessor
  public LinkedList<Content> getFavorites(){
      return myFavorites;
  }

  //mainTEST
  // public static void main(String[] args) {
  //   Listener me = new Listener("Bob");
  //
  //   Artist myArtist = new Artist("Siouxie");
  //   Content mySong = new Content("Dazzle", myArtist, "Rock");
  //   me.favorite(mySong);
  // }

}
