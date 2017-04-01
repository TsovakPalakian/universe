package by.htp.universe.entity;

import by.htp.universe.logic.SpaceObject;

public class Star extends SpaceObject {
	private String name;
	
	public Star() {}
	
	public Star(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "The name of the star: " + name;
	}
}
