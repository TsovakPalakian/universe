package by.htp.universe.entity;

import by.htp.universe.logic.SpaceObject;

public class Planet extends SpaceObject {
	protected String name;
	
	public Planet() {}
	
	public Planet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "The name of the planet: " + name;
	}
}
