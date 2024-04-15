public class Songs extends Content{

  //default constructor
  public Songs(){
    super();
  }

  //overloaded constructor
  public Songs(String myTitle, Artist myArtist, String[] myGenre, int timesStreamed) {
    super(myTitle, myArtist, myGenre, timesStreamed, true); //true means this is a song
  }
}
