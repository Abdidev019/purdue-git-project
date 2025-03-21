package basic;

public class HelloWorld {
//from dev1 (conflict management) dev2 (conflict) demo
	public static void main(String[] args) {
		System.out.println("Hello Abdi");

	}

	// from b1 branch | stash form dev 2 and demo from x1
	public void m1(){
		System.out.println("from m1");
	}
	public void m2(){
		System.out.println("from m2");
}
	public void m3(){
<<<<<<< Updated upstream
		System.out.println("from y11")
=======
		System.out.println("from x11")
>>>>>>> Stashed changes
}
