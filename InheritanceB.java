class InheritanceB extends InheritanceA {
	int k;
	
	void showb() {
		System.out.println("k: " + k);
	}
	
	void sum() {
		System.out.println("i+j+k: " +(i+j+k));
	}
	
	public static void main(String args []) {
		
		InheritanceB obj = new InheritanceB();
		
		obj.i=1;
		obj.j=2;
		obj.k=3;
		
		
		obj.showa();
		obj.showb();
		obj.sum();
		
		
		
	}
}
