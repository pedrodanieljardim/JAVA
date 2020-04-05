package principal;

public class Main {

	public static void main(String[] args) {
		
		area_circle a = new area_circle(10);
		System.out.println(a.area());
		
		area_circle.PI=3.145;
		
		area_circle b = new area_circle(10);
		System.out.println(b.area());
		
	}

}
