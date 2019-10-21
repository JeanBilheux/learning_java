public static void tryRisky(String test) {
	
	try {
		doSomethingCrazy();
		return "test passed!";
	} catch (ScaryException ex) {
	    System.out.println("catched it!")
	} finally {
	    System.out.println("done!");
	}

}

