class Robot {
	
	int height;
	int width;
	int length;
	
	public Robot(char language) {
		if(language == Java) {
			height = 4
			width = 6
			length = 2
		)
		else if(language == C) {
			height = 2
			width = 5
			length = 7
		}
		else if(language == HTML) {
			height = 8
			width = height - 1
			length = height % width
		}
		else {
			height = 2
			width = 2
			length = 2
		}
	}
	
	public static void main(String[] args) {
		
		Robot volume = new Dog('HTML')
		System.out.println("The total volume of your robot is " + volume + " cubic feet."
	
	}
}