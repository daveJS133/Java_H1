//Song could extend Album, they both could be played, have a name, could have a length etc however song doesn't have an add function. The interface allows other media to be played which adheres to the  open-close principle.


import java.util.*;

public class Song implements Playable{
  
  public String play(){
    return "The track is playing!";
  }
}