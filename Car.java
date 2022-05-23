package com.masai;



public class Car {

	private String model;
	private String companyName;
	private String Color;
	Engine engine;
	
	void setModel(String model) {
		this.model = model;
	}
	String getModel()
	{
		return model;
	}
	
	void setcompanyName(String companyName) {
		this.companyName = companyName;
	}
	String getcompanyName()
	{
		return companyName;
	}
	
	void setColor(String Color) {
		this.Color = Color;
	}
	String getColor()
	{
		return Color;
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car();

		
		
		Car c2 = new Car();
		c2.setModel("Harrier");
		c2.setcompanyName("Tata");
		c2.setColor("black");
		
		c2.engine = new Engine();
		
		c2.engine.rmp=10000;
		c2.engine.Power=110;
		c2.engine.manufacturer="tata";
		c2.engine.hasTurbo=true;
		
		System.out.println("Car Model:"+c2.getModel());
		System.out.println("Car companyName:"+c2.getcompanyName() );
		System.out.println("Car color:"+c2.getColor());
		System.out.println("Car RPM:"+c2.engine.rmp);
		System.out.println("Car power:"+c2.engine.Power);
		System.out.println("Car Engine Manufacture:"+c2.engine.manufacturer);
		System.out.println("Car Has Turbo:"+c2.engine.hasTurbo);

		

	}

}

