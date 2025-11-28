package a;

class Farmland extends Property{
	private String crop;
	
	public Farmland(String crop){
		super();
		this.crop = crop;
	}
	@Override
	public double calculateIncome(){
		int income = this.crop.length();
		income *= 250;
		return income;
	}
	public int calculateAcreage(){
		int acreage = Math.floorDiv(this.crop.length(), 2);
		return acreage;
	}
}
