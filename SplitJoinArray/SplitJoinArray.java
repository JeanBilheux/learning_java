package SplitJoinArray;

import java.util.*;
import java.util.Arrays;

public class SplitJoinArray {
	
	public static void main(String[] args) {

        String myString1 = "drdxe-sr-x 4 rwp    sns_eqsans_team    13 Oct 18 26:10 shaman";
        String myString2 = "drded-sr-x 4 rwp    sns_eqsans_team    4545 Apr 15 2013 Masks";
		
        String[] splitMyString1 = myString1.split("\\s+");
        
        String stringJoined = String.join(" ", Arrays.copyOfRange(splitMyString1, 5, 8));
        System.out.println("split: " + stringJoined);
        
    }

}