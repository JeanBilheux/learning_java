package DotCom;

import java.io.*;
import java.util.*;


class GameHelper {
	
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int[] grid = new int[gridSize];
	private int comCount = 0;

	public String getUserInput(String prompt) {

		String inputLine = null;
		System.out.println(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(
				new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputLine.toLowerCase();
	}

	public ArrayList<String> placeDotCom(int comSize) {

		ArrayList<String> alphaCells = new ArrayList<String>(); //holds F6 type cells

		String temp = null;
		int[] coords = new int[comSize]; // current candidate coords
		int attempts = 0;
		boolean success = false; // found a good location
		int location = 0; // current starting location

		comCount++; // index of dot com to place
		int incr = 1;  // horizontal increment
		if ((comCount % 2) == 1) { // if odd dot com, place it vertically
			incr = gridLength;
		}

		while ( !success && (attempts++ < 200)) {

			location = (int)(Math.random() * gridSize); // get random starting point
			int x = 0; // nth position in dot com to place
			success = true;

			while (success && (x < comSize)) { // looking for adjacent unused spots

				if (grid[location] == 0) {  // if not already used

					coords[x++] = location; // save location
					location += incr; // try 'next' adjacent

					if (location >= gridSize) { // out of bounds - bottom
						success = false; // failure
						continue;
					}

					if (x>0 && (location % gridLength == 0)) { // out of bounds - right edge
						success = false; // failure
						continue;
					}

				} else {
					success = false; // already used
				}
			}

		}


		// turn location into alphabet code
		int x = 0;
		int row = 0;
		int column = 0;

		while (x < comSize) {
			grid[coords[x]] = 1; // mark master grid points as used
			row = (int) (coords[x] / gridLength); // get row value
			column = coords[x] % gridLength; // get column value
			temp = String.valueOf(alphabet.charAt(column));

			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;
		}

		return alphaCells;

	}


}