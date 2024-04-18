public class ProgramThree{


	public static void main(String[] args){

		System.out.println("Hello");
		System.out.print(Thread.currentThread().getName());
		Thread.currentThread().setName("Pradeep");
		System.out.print(Thread.currentThread().getName());

	}
}