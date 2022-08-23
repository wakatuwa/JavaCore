package testProgram4;
/**
 * a class of Stock
 * @author wanghan
 *
 */
public class Stock {
	String symbol;
	String name;
	double previousPrice;
	double currentPrice;

	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	public void setPreviousPrice(double previousPrice) {
		this.previousPrice = previousPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getChangePercent() {
		double change = Math.abs(previousPrice - currentPrice);
		return (change/currentPrice)*100 + "%";
	}


	public static void main(String[] args) {
		Stock s1 = new Stock("60000","浦发银行");
		s1.setCurrentPrice(28.6);
		s1.setPreviousPrice(25.5);
		System.out.println(s1.getChangePercent());
	}

}
