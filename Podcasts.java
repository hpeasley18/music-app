
public class Podcasts extends Content{

  /*
  Podcasts should have an additional member variable for the episode
  number.
  All classes should have necessary constructors, mutators, accessors, and toString methods.
  Make sure to test the functionality of each class as you go before moving
  on.
  */
  //member variable
  public int episodeNum;

  //default constructor
  public Podcasts() {
    super();
    episodeNum = 0;
  }

  public Podcasts(String myTitle, Artist myArtist, String[] myGenre, int timesStreamed, int num, boolean songContent) {
    super(myTitle, myArtist, myGenre, timesStreamed, false);
    episodeNum = num;
  }

  //mutator
  public void setEpisodeNum(int num){
    episodeNum = num;
  }

  //accessor
  public int getEpisodeNum(){
    return episodeNum;
  }

  //toString
  public String toString(){
    return "Podcast: " + super.toString() + "Episode Number: " + episodeNum + "\n";
  }

  //mainTEST
  // public static void main(String[] args) {
  //   Artist myArtist = new Artist("Lex Fridman");
  //   String[] my_Genre = {"Educational", "Horror", "Mystery"};
  //   Podcasts myPod = new Podcasts("Interview", myArtist, my_Genre, 1574538, 303, false);
  //
  //   myPod.play();
  //   System.out.println("__________________________________\n");
  //   System.out.println(myPod.toString());
  // }
}
