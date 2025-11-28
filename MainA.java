package a;

import java.util.*;

public class MainA{
	public static void main(String[] args){
		ArrayList<Property> Properties = new ArrayList<Property>();
		Properties.add(new Apartment(8, 525.75));
		Farmland farm = new Farmland("pumpkin");
		Properties.add(farm);
		System.out.println("[Property Manager]");
		for(int i = 0; i < Properties.size(); i++){
			System.out.println(Properties.get(i).toString());
		}
		System.out.println("Total acreage required: " + farm.calculateAcreage());
	}
}
