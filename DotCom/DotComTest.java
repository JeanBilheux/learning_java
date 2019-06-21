package DotCom;


class DotComTest {
	
	public static void main(String[] args) {

		testInitialization();

	}

	public static void testInitialization() {
		DotCom one = new DotCom();
		one.setName("Pets.com");

		String testResult = "failed";

		if (one.getName().equals("Pets.com")) {
			testResult = "passed";
		}

		System.out.println(testResult);

	}

}