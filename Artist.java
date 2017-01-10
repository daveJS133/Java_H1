class Artist{
  private String name;
  private int trackCount;
  private int age;
  private Album[] album;

  public Artist(String name, int trackCount, int age){
    this.name = name;
    this.trackCount = 5;
    this.age = age;
    this.album = Album[trackCount];

  }

  public String getName(){
    return this.name;
  }

  public void addTrack(Song track){
    if (isAlbumFull()) return;

    int trackCount = trackCount();
    album[trackCount] = track;
  }

  public int trackCount(){
    int count = 0;
    for(Song track : album) {
      if(track != null) {
        count += 1;
      }
    }
    return count;
  }

  public boolean isAlbumFull() {
    return trackCount() == album.length;
  }

  public void clearAlbum(){
    for(Song track : album) {
      track = null; 
    }
  }

}