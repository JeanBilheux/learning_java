package SimpleDotCom;

import java.util.ArrayList;


class SimpleDotComGame {
	
	private static ArrayList<String> makeLocations() {

		int startingPoint = (int)(Math.random() * 4);
		ArrayList<String> locations = new ArrayList<String>();
		locations.add(Integer.toString(startingPoint));
		locations.add(Integer.toString(startingPoint+1));
		locations.add(Integer.toString(startingPoint+2));
		return locations;
	}

	public static void main (String[] args) {

		SimpleDotCom dot = new SimpleDotCom();
		int numOfGuesses = 0;

		GameHelper helper = new GameHelper();

		ArrayList<String> locations = new ArrayList<String>();
		locations = makeLocations();

		dot.setLocationCells(locations);

		boolean isAlive = true;
		String userGuess;
			
		while (isAlive) {

			userGuess = helper.getUserInput("Enter a number");
			String result = dot.checkYourself(userGuess);
			numOfGuesses++;

			if (result.equals("hit")) {
				System.out.println("Hit!");
			}

			if (result.equals("miss")) {
				System.out.println("Missed!");
			}

			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses);
			}

		}
	}
	
}



