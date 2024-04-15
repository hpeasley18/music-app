import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

public class MusicDriver{
  //main
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    Listener listener1 = new Listener();// creates an empty listener account
    Artist artist1 = new Artist();// creates an empty artist account
    Playlist playlist1 = new Playlist();// creates the playlist object


    playlist1.setCollectionTitle("LATE NIGHT VIBES"); // playlist title created
    ArrayList<Content> maxSongs = new ArrayList<Content>(7);// new ArrayList with length 7 created

    Albums album1 = new Albums();  //creates the album object
    //new artist
    Artist artist2 = new Artist("MUSE");//artist 2

    album1.setCollectionTitle("Simulation Theory");//album1
    album1.setAlbumArtist(artist2);// sets album artist
    String[] genre1 = {"Progressive Rock", "Electronic Rock", "Alternative Rock"};// genre array
    // some songs that are on album
    Songs song1 = new Songs("Pressure", artist2, genre1, 864835385); // song 1
    album1.getContent().add(song1);
    maxSongs.add(song1);//add song to ArrayList

    Songs song2 = new Songs("Dig Down", artist2, genre1, 27454832); // song 2
    album1.getContent().add(song2);
    maxSongs.add(song2);//add song to ArrayList

    Songs song3 = new Songs("Thought Contagion", artist2, genre1, 1132427); // song 3
    album1.getContent().add(song3);
    maxSongs.add(song3);

    //new genre
    String[] genre2 = {"Progressive Rock", "Alternative Rock"};
    // new artist
    Artist artist3 = new Artist("Electric Light Orchestra");
    Songs song4 = new Songs("Mr. Blue Sky", artist3, genre2, 4679332); // song 4
    maxSongs.add(song4);

    //new artist
    Artist artist4 = new Artist("Guns N' Roses");
    Songs song5 = new Songs("Sweet Child of Mine", artist4, genre2, 85574934); // songs 5
    maxSongs.add(song5);

    //new genre
    String[] genre3 = {"Pop", "Countrypoliton", "Indie"};
    //new artist
    Artist artist5 = new Artist("Taylor Swift");
    Songs song6 = new Songs("Shake It Off", artist5, genre3, 99834735); // songs 6
    maxSongs.add(song6);

    Artist artist6 = new Artist("Markiplier");
    String[] genre4 = {"Comedy", "Learning", "Origin Story"};
    Podcasts podcast1 = new Podcasts("Distractable Podcast", artist6, genre4, 9875654, 7, false); // podcast 1
    maxSongs.add(podcast1);

    //add to playlist
    System.out.println("________________________________________");
    System.out.println("Playlist: \n");


    playlist1.addContent(song1);// add song to playlist
    playlist1.addContent(song2);// add song to playlist
    playlist1.addContent(song3);// add song to playlist
    playlist1.addContent(song4);// add song to playlist
    playlist1.addContent(song5);// add song to playlist
    playlist1.addContent(song6);// add song to playlist
    playlist1.addContent(podcast1);// add podcast to playlist
    System.out.println("\n\n");

    //interface prompts user for input
    System.out.println("Welcome to Spootify!");
    System.out.println("Type 1, 2, 3, 4, or 5 to choose the option! ");
    System.out.println("1. Create an account, which asks the user for the type of \naccount to create and then prompts for the appropriate attribute values. ");
    System.out.println("2. List all Playlists and Albums that are available to shuffle. ");
    System.out.println("3. Add songs to an existing playlist. ");
    System.out.println("4. Export all songs on the platform out to a file in ascending \norder by times streamed. ");
    System.out.println("5. Exit");

    int choice = scnr.nextInt();// scans for integer input
    while( choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 ){ //while choice is 1, 2, 3, 4, or 5

      // try{     //try statement to try to correct the InputMismatchException
        switch(choice){ //switch case statement
          // create a listener of aritst account when 1 selected
            case 1:
            System.out.println("________________________________________");
            System.out.println("Creating an account...");
            System.out.println("\nEnter your username: ");
            // asks the user for username
            String userName = scnr.next();
            System.out.println("Do you want to create a Listener or Artist Account? (Listener/Artist): ");
                String accountType = scnr.next();
                if(accountType.equals("Listener")){
                    // creates a listener account
                    listener1.setUserName(userName);
                    System.out.println("Your listener account has been created!");
                    System.out.println("\n" + listener1);

                }if(accountType.equals("Artist")){
                    // creates an artist account
                    artist1.setUserName(userName);
                    System.out.println("Your artist account has been created!");
                    System.out.println("\n" + artist1);
                }else{
                  System.out.println("\n--->INVALID CHOICE, pick a correct option... \n");
                  continue;
                }
                System.out.println("\nWelcome " + userName + ", to Spootify");
                System.out.println("__________________________________");

                //PROMPT
                System.out.println("Type 1, 2, 3, 4, or 5 to choose the option!");
                System.out.println("1. Create an account, which asks the user for the type of \naccount to create and then prompts for the appropriate attribute values");
                System.out.println("2. List all Playlists and Albums available to shuffle");
                System.out.println("3. Add songs to an existing playlist");
                System.out.println("4. Export all songs on the platform out to a file in ascending \norder by times streamed");
                System.out.println("5. Exit");
                System.out.println("________________________________________");
                choice = scnr.nextInt();// scans for next input
                continue;

            //List all Playlists and Albums available to shuffle
            case 2:
                System.out.println("________________________________________");
                System.out.println("Here are the playlists to shuffle from: ");
                System.out.println(playlist1.getCollectionTitle());
                System.out.println("\nHere are the albums to shuffle from: ");
                System.out.println(album1.getCollectionTitle());
                System.out.println("What would you like to shuffle? ");
                System.out.println("\n");
                String userChoice2 = scnr.nextLine();

                userChoice2 = scnr.nextLine();
                if(userChoice2.equals(playlist1.getCollectionTitle())){
                    playlist1.shuffle();
                }else if(userChoice2.equals(album1.getCollectionTitle())){
                    album1.shuffle();
                }else{
                  System.out.println("\n--->INVALID CHOICE, pick a correct option... \n");
                  // continue;
                }

                System.out.println("________________________________________");
                System.out.println("Type 1, 2, 3, 4, or 5 to choose the option!");
                System.out.println("1. Create an account, which asks the user for the type of \naccount to create and then prompts for the appropriate attribute values");
                System.out.println("2. List all Playlists and Albums available to shuffle");
                System.out.println("3. Add songs to an existing playlist");
                System.out.println("4. Export all songs on the platform out to a file in ascending \norder by times streamed");
                System.out.println("5. Exit");
                System.out.println("________________________________________");
                choice = scnr.nextInt();
                continue;
            case 3:
                System.out.println("What song would you like to add to " + playlist1.getCollectionTitle());
                System.out.println("Here are the choices (a/b): ");
                System.out.println("a) " + song1.getTitle() + "\nb) " + song2.getTitle());
                String songChoice = scnr.next();
                if(songChoice.equals("a")){
                    playlist1.addContent(song1);
                }else if (songChoice.equals("b")){
                    playlist1.addContent(song2);
                }else{
                  System.out.println("\n--->INVALID CHOICE, pick a correct option... \n");
                  continue;

                }
                System.out.println("________________________________________");
                System.out.println("Type 1, 2, 3, 4, or 5 to choose the option!");
                System.out.println("1. Create an account, which asks the user for the type of \naccount to create and then prompts for the appropriate attribute values");
                System.out.println("2. List all Playlists and Albums available to shuffle");
                System.out.println("3. Add songs to an existing playlist");
                System.out.println("4. Export all songs on the platform out to a file in ascending \norder by times streamed");
                System.out.println("5. Exit");
                System.out.println("________________________________________");
                choice = scnr.nextInt();
                continue;
            case 4:
              try {
                  FileWriter myWriter = new FileWriter("SongOutput.txt");
                  Collections.sort(maxSongs);
                  myWriter.write("------------------------------Spootify Songs------------------------------------\n");
                  for(int i = 1; i < maxSongs.size(); i++){
                      myWriter.write("Song " + i + ": " + maxSongs.get(i).getTitle() + " / Num. of Streams: " + maxSongs.get(i).getTimeStreamed() + ".\n\n");
                  }
                  myWriter.close();
                  System.out.println("Successfully wrote to the file.");
                  System.out.println("________________________________________");

                  }catch(IOException e){
                  System.out.println("An error occurred.");
                  e.printStackTrace();
                  }

                  System.out.println("Type 1, 2, 3, 4, or 5 to choose the option: ");
                  System.out.println("1. Create an account, which asks the user for the type of \naccount to create and then prompts for the appropriate attribute values");
                  System.out.println("2. List all Playlists and Albums available to shuffle");
                  System.out.println("3. Add songs to an existing playlist");
                  System.out.println("4. Export all songs on the platform out to a file in ascending \norder by times streamed");
                  System.out.println("5. Exit");
                  System.out.println("\n________________________________________\n");
                  choice = scnr.nextInt();
                  continue;
            case 5:
                break;
            default:
                break;
            }

          // }catch(InputMismatchException e){                                               // TRIED TO CATCH MISMATCH EXCPEITION, BUT IT IS NOT WORKING
          //   System.out.println("You must enter an interger 1-5. Please try again...");
          //   System.err.println(e);
          //   e.printStackTrace;
          //   continue;
          // }

            if (choice == 5){
              break;
            }
          }
            if ( choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 ){
              System.out.println("Goodbye, and thank you for using Spootify");

            }else{
              System.out.println("Invalid input, Try Again Later... ");
          }
    }
  }
