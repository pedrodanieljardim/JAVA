package mercado;

public class produto {
	String name;
	double price;
	double descount;
	
	double final_price() {
		double price_discounter = price*descount;
		return price-price_discounter;
	}
}

