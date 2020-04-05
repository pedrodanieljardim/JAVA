package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		if(day==0 && month==0 && year==0) {
			niver n = new niver(1,1,1970);
			n.printa_data();
		}else {
			niver n = new niver(day,month,year);
			n.printa_data();
		}

		}

	}
