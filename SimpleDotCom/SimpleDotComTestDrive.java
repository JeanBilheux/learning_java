package SimpleDotCom;

import java.util.ArrayList;


public class SimpleDotComTestDrive {
	
	public int numbOfHits = 0;

	public static void main (String[] args) {

		SimpleDotCom dot = new SimpleDotCom();

		ArrayList<String> locations = new ArrayList<String>();
		locations.add("1");
		locations.add("2");
		locations.add("3");

		dot.setLocationCells(locations);

		String userGuess = "2";
		String result = dot.checkYourself(userGuess);

		String testResult = "failed";

		if (result.equals("hit")) {
			testResult = "passed";
		}

		System.out.println(testResult);

	}

}

