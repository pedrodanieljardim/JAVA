package principal;

public class niver {
	int day;
	int month;
	int year;
	// construtor padr�o 
	niver(){
		this.day = 1;
		this.month = 1;
		this.year = 1970;
	}
	// construtor expl�cito
	niver(int d,int m,int y){
		this.day=d;
		this.month=m;
		this.year=y;
	}
	
	void printa_data() {
		System.out.println(day+"/"+month+"/"+year);
	}
}

