import java.util.*;

class Artist implements Collectable{
  private String name;
  private int age;
  private ArrayList<Collectable> discography;


  public Artist(String name, int age){
    this.name = name;
    this.age = age;
    this.discography = new ArrayList<Collectable>();
  }

  public String getName(){
    return this.name;
  }

  public void addItem(Album album){
    discography.add(album);
  }

  public int itemCount(){
    return discography.size();
  }

  public void clearDiscography(){
    discography.clear();
  }
}

