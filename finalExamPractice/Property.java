package a;

abstract class Property{
	private int id;
	static int nextId = 1;
	
	public Property(){
		this.id = nextId;
		nextId++;
	}
	abstract double calculateIncome();
	@Override
	public String toString(){
		String info = String.format("Property #%d | Income: $%.2f", this.id, calculateIncome());
		return info;
	}
}
