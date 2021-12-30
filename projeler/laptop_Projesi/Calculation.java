package laptop_Projesi;

public class Calculation extends Data{
	
	int sumPrice;
	int indirim;
	
	
	@Override
	public String toString() {
		return "Toplam Tutar =" + sumPrice +" TL";
	}
	public int getSumPrice() {
		return sumPrice;
	}
	public void setSumPrice(int sumPrice) {
		this.sumPrice = sumPrice;
	}
	
	
}
