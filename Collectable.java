// Couldn't think of what to put in here or how to implement what the artist an album had in common but when I changed the interface names from Collectable & Collatable ( both describing different collections really,almost clashing or conflicting), to: Collectable & Playable, everything clicked.

public interface Collectable {
  String getName();
  // void addItem();
  int itemCount();

}