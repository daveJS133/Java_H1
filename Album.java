//Album could extend artist as they both have a name, count and an ArrayList with an add function however in future an album may also be played so this would violate both the open-close principal and maybe the Liskov substitution pricipal: Artist would also have to accept songs and album would accept albums which doesn't make sense.

import java.util.*;


public class Album implements Collectable, Playable {
  private String name;
  private ArrayList<Playable> album;



  public Album(String name){
    this.name = name;
    this.album =  new ArrayList<Playable>();
  }

  public String getName(){
    return this.name;
  }

  public void addItem(Song track){
    album.add(track);
  }

  public int itemCount(){
    return album.size();
  }

  public String play(){
    return "The album is playing!";
  }

}
