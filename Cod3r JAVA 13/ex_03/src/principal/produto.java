package principal;

public class produto {
	String name;
	double price;
	double descount;
	
	produto(){
		
	}
	produto(String n,double p,double d){
		this.name=n;
		this.price=p;
		this.descount=d;
	}
	
	double final_price() {
		double price_discounter = price*descount;
		return price-price_discounter;
	}
	
}
