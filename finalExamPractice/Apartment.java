package a;

class Apartment extends Property{
	private int rentalUnits;
	private double rent;

	public Apartment(int rentalUnits, double rent){
		super();
		this.rentalUnits = rentalUnits;
		this.rent = rent;
	}
	@Override
	public double calculateIncome(){
		double income = this.rent * this.rentalUnits;
		return income;
	}
}
