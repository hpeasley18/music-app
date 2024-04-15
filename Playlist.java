
public class Playlist extends ContentCollections{

  //default constructor
  public Playlist(){
    super();
  }

  //overloaded constructor
  public Playlist(String playlistTitle){
    super(playlistTitle);
  }


  // add content to playlist
  // takes in a content as a parameter to add to the playlist
  public void addContent(Content contentAdded){
    contentList.add(contentAdded);

    System.out.println(contentAdded.getTitle() + " by " + contentAdded.getArtist() + " has been added to the collection! "); //.getArtist().getUserName
    }


  // remove content to playlist
  // takes in a content as a parameter to remove from the playlist
  public void removeContent(Content contentRemoved){
      contentList.remove(contentRemoved);

      System.out.println(contentRemoved.getTitle() + " by " + contentRemoved.getArtist() + " has been removed from the collection! ");
  }


  //toString
  public String toString() {
    return "\n" + super.toString();
  }
}
