package by.htp.universe.entity;

public class Moon  extends Planet {
	private String name;
	public Moon(String name) {
		super(name);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("The moon's name is the %s.", name);
	}
}
