import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ArtistTest{
  Album album;
  Song song;
  
  @Before 
  
  public void before() {
    album = new Album("Skiffle Hits 8");
    song = new Song();
  }

  @Test
  public void hasName(){
    assertEquals("Skiffle Hits 8", album.getName()); 
  }

  @Test
  public void startsWithNoTracks(){
    assertEquals(0, album.trackCount());
  }

  @Test
  public void canAddTrack() {
    
    album.addTrack(song);
    assertEquals(1, album.trackCount());

  }

  @Test
  public void canGetFull(){
    for(int i = 0; i < 10; i++) {
      album.addTrack(song);
    }
    assertEquals(5, album.trackCount());
  }

  @Test
  public void getsFullAfterFiveTracks(){
    for(int i = 0; i<5; i++){
      album.addTrack(song);
    }
    assertEquals(true, album.isAlbumFull());
  }

  @Test
  public void canClearAlbum() {
    album.addTrack(song);
    album.clear();
    assertEquals(0, album.trackCount());
  }
}
