package mercado;

public class produto {
	String name;
	double price;
	static double descount=0.25;
	
	produto(){
		
	}
	produto(String n,double p){
		this.name=n;
		this.price=p;
	}
	
	double final_price() {
		double price_discounter = price*descount;
		return price-price_discounter;
	}
	
}
