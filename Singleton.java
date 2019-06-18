
public class Singleton {
	
	private static Singleton ms=null;
	public String s; 
	private Singleton() {
		s="Singleton through play java!!!";
	} 
	
	public static Singleton getInstance(){
		if(ms==null)ms=new Singleton();
		
		return ms;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton ms1= Singleton.getInstance();
		Singleton ms2= Singleton.getInstance();
		Singleton ms3= Singleton.getInstance();
		
		
		System.out.println(ms1.s);
		System.out.println(ms2.s);
		System.out.println(ms3.s);
	}

}
