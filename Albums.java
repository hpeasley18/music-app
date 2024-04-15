
public class Albums extends ContentCollections{

  //member variable
  protected Artist Album_Artist;


  //default constructor
  public Albums(){
    super(); //super varaibles
    Album_Artist = new Artist();
  }

  //overloaded constructor
  public Albums(String title_of_album, Artist artist_of_album){
      super(title_of_album); // super title
      Album_Artist = artist_of_album;
  }

  //mutator
  public void setAlbumArtist(Artist artist_of_album){
    Album_Artist = artist_of_album;
  }

  //accessor
  public Artist getAlbumArtist(){
      return Album_Artist;
  }


  //toString
  public String toString(){
      return "Artist: " + Album_Artist.getUserName() + "\n" + super.toString(); //return artist name and super ToString
  }
}
