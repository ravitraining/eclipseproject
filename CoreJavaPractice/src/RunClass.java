
public class RunClass {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setName("Ravi");
	System.out.println(Thread.currentThread().getName());
	System.out.println(10/0);
	
	
}
}
