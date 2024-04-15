import java.util.LinkedList;
/*
Each piece of content should have a title, account of the artist, a list of up to 3 genres, and the
number of times streamed.
All listenable content should also have a play method, which will increment the times
streamed by 1.
All classes should have necessary constructors, mutators, accessors, and toString methods.
Make sure to test the functionality of each class as you go before moving
on.
*/

public class Content implements Comparable<Content>{

  //member variables
  protected String title;
  protected Artist contentArtist;
  protected String[] contentGenres; //genre ArrayList
  protected int m_timesStreamed;
  protected boolean m_song_Content; // is content a song

  //default constructor
  public Content(){
    title = "";
    contentArtist = null;
    contentGenres = new String[3]; //minimum of 3 genres per content
    m_timesStreamed = 0;
  }

  //overloaded constructor
  public Content(String myTitle, Artist myArtist, String[] myGenre, int timesStreamed, boolean songContent){ //includes the boolean that checks if the content is a song
    title = myTitle;
    contentArtist = myArtist;
    contentGenres = myGenre;
    m_timesStreamed = timesStreamed;
    m_song_Content = songContent;
  }

  //mutator
  public void setTitle(String myTitle) {
    title = myTitle;
  }

  //mutator
  public void setArtist(Artist myArtist){
    contentArtist = myArtist;
  }

  //mutator
  public void setContentGenres(String[] myGenre){
    contentGenres = myGenre;
  }

  //mutator
  public void setTimeStreamed(int timesStreamed) {
    m_timesStreamed = timesStreamed;
  }

  //mutator
  public void setSongContent(Boolean songContent){
    m_song_Content = songContent;
  }

  //accessor
  public String getTitle() {
    return title;
  }

  //accessor
  public Artist getArtist() {
    return contentArtist;
  }

  //accessor
  public String getContentGenres(){
      String g = "";
      for(String my_Genre: contentGenres){
          g += my_Genre;
      }
      return g;
  }

  //accessor
  public int getTimeStreamed() {
    return m_timesStreamed;
  }

  //accessor
  public boolean getSongContent(){
    return m_song_Content;
  }


  // play method
  public void play(){
      System.out.println("You are now playing: " + title + " by " + contentArtist.getUserName());
      String myGenre = "";
      for(String my_Genre: contentGenres){
          myGenre += my_Genre + ", ";//adds genres to myGenre separated by ','
      }
      System.out.println("Genres: " + myGenre); //prints out genre ArrayList
      m_timesStreamed ++;
  }


  @Override  //Override
  //compareTo method
  public int compareTo(Content c){
    if (this.m_timesStreamed == c.getTimeStreamed()){ // if timesStreamed and copy of timesStreamed are equal
      return 0;
    }else if (this.m_timesStreamed < c.getTimeStreamed()){ // if timesStreamed less than copy
      return 1;
    }else{ // if timesStreamed greater than copy
      return -1;
    }
  }

  //toString
  public String toString(){
    String myGenre = "\n'" + title + "' by " + contentArtist.getUserName() + "\nGenres: ";
    //loop for genres
    for(int i = 0; i < contentGenres.length; i++){
        if(i == (contentGenres.length - 1)){
            myGenre += contentGenres[i] + "\n\n"; // adds end of the genre list to the content string
        }else{
            myGenre += contentGenres[i] + ", "; // adds each genre element from the genre list separated by ','
        }
    }
    return myGenre; // returns myGenre
}

  //mainTest
    // public static void main(String[] args){
    //     Listener listener1 = new Listener("Hunter Peasley");
    //     Artist artist1 = new Artist("RUSH");
    //
    //     System.out.println(listener1);
    //     System.out.println(artist1);
    //     String[] my_Genre = {"Rock", "Alt Rock", "Metal"};
    //     Content musicContent = new Content("Subdivisions", artist1, my_Genre, 123456789, true);
    //
    //     System.out.println(musicContent);
    //     musicContent.play();
    //     listener1.favorite(musicContent);
  // }
}
