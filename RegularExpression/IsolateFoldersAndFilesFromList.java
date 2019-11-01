package RegularExpression;

import java.util.ArrayList;
import java.util.Arrays;


public class IsolateFoldersAndFilesFromList {

  ArrayList<String> listing = new ArrayList<String>();
  ArrayList<String> formatedListing;

  public static void main (String[] args) {

    IsolateFoldersAndFilesFromList object = new IsolateFoldersAndFilesFromList();
    object.start();
}

  public void start() {
      initializeArray();
      System.out.println("listing is " + listing);
      // lookForFolders();
      // lookForFiles();
      createListFilesFolders();

      System.out.println("Display result:");
      System.out.println(formatedListing);

  }

  private String splitString(String entry) {

    String result = "";
    String[] resultSplit = entry.split("\\s+");
		if (resultSplit.length < 5) {
		} else {
		    String dateString = String.join(" ", Arrays.copyOfRange(resultSplit, 5, 8));
				String filenameString = resultSplit[resultSplit.length - 1];
        result = filenameString + " : " + dateString;
        System.out.println("result of split is : " + result);
		}

      return result;
}


  private void createListFilesFolders() {

    String folderPattern = "^d.*";
    String filePattern = "^-.*";
    formatedListing = new ArrayList<String>();

    for (String entry: listing) {

      String result = splitString(entry);

      if (entry.matches(folderPattern)) {
        // it's a folder
        formatedListing.add("Folder: " + result);

      } else if (entry.matches(filePattern)) {
        // it's a file
        formatedListing.add("File: " + result);
      }

    }

  }

  // private void lookForFolders() {
  //   System.out.println("Looking for folders:");
  //
  //   String pattern = "^d.*";
  //
  //   for (String entry: listing) {
  //
  //     System.out.print(entry + " -> " + entry.matches(pattern));
  //
  //     if (entry.matches(pattern)) {
  //         // is a folder
  //     }
  //
  //     System.out.println("");
  //   }
  //
  // }
  //
  // private void lookForFiles() {
  //   System.out.println("Looking for files:");
  //
  //   String pattern = "^-.*";
  //
  //   for (String entry: listing) {
  //
  //     System.out.print(entry + " -> " + entry.matches(pattern));
  //
  //     if (entry.matches(pattern)) {
  //         // is a file
  //     }
  //     System.out.println("");
  //
  //   }
  //
  // }




  private void initializeArray() {
    listing.add("drwxr-xr-x   4 j35  1551083765  128 Oct 31 15:31 ArrayListMagnet");
    listing.add("drwxr-xr-x   4 j35  1551083765  128 Oct 31 15:31 Box");
    listing.add("-rw-r--r--   1 j35  1551083765   11 Oct 31 15:31 my_ascii.txt");
    listing.add("-rw-r--r--   1 j35  1551083765   62 Oct 31 15:31 my_serializable.ser");
}

}
