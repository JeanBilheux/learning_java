package RegularExpression;

import java.util.ArrayList;

public class IsolateFoldersAndFilesFromList {

  ArrayList<String> listing = new ArrayList<String>();

  public static void main (String[] args) {

    IsolateFoldersAndFilesFromList object = new IsolateFoldersAndFilesFromList();
    object.start();
}

  public void start() {
      initializeArray();
      System.out.println("listing is " + listing);
  }

public void initializeArray() {
  listing.add("drwxr-xr-x   4 j35  1551083765  128 Oct 31 15:31 ArrayListMagnet");
  listing.add("drwxr-xr-x   4 j35  1551083765  128 Oct 31 15:31 Box");
  listing.add("-rw-r--r--   1 j35  1551083765   11 Oct 31 15:31 my_ascii.txt");
  listing.add("-rw-r--r--   1 j35  1551083765   62 Oct 31 15:31 my_serializable.ser")
}

}
