package oopWithNLayaredApp.entities;

public class Product {
	private int id;
	private String name;
	private double unitPrace;
	public Product() {
		super();
	}
	public Product(int id, String name, double unitPrace) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrace = unitPrace;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrace() {
		return unitPrace;
	}
	public void setUnitPrace(double unitPrace) {
		this.unitPrace = unitPrace;
	}
	

}
