abstract class shape{
	
abstract void draw();

}

class Abstraction extends shape{

	void draw() {
	System.out.println("drawing rectangle");
	
}

	public static void main(String[] args) {
		Abstraction obj = new Abstraction();
		obj.draw();
	}

}