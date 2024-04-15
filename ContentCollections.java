import java.util.LinkedList;
import java.util.Random;

public abstract class ContentCollections implements Comparable<ContentCollections>{

  //member variables
  protected String title;
  protected LinkedList<Content> contentList;

  //default constructor
  public ContentCollections(){
    title = "";
    contentList = new LinkedList<Content>(); //empty contentList
    }

  //overloaded constructor
  public ContentCollections(String myTitle){
    title = myTitle;
    contentList = new LinkedList<Content>();
  }


  //mutator
  public void setCollectionTitle(String myTitle){
    title = myTitle;
  }

  //accessor
  public String getCollectionTitle(){
    return title;
  }

  //accessor
  public LinkedList<Content> getContent(){
      return contentList;
    }

  // shuffle
  public void shuffle(){
    Random r = new Random(); //random
    int n = r.nextInt(contentList.size());// random content within content list
    contentList.get(n).play(); //play random content
  }


  @Override
  //compareTo
  public int compareTo(ContentCollections c){
    if((this.contentList.size()) == (c.getContent().size())){// if contentList size and copy of contentList size are equal
      return 0;
    }else if ((this.contentList.size()) < (c.getContent().size())){ // if contentList size less than copy
      return 1;
    }else{ // if contentList size greater than copy
      return -1;
    }
  }

  //toString
  public String toString() {
    return "Collection Title: " + title + "\nContent: " + contentList; // return title of collection and it's content
  }
}
