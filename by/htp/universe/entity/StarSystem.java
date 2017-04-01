package by.htp.universe.entity;

import by.htp.universe.logic.SpaceObject;

public class StarSystem extends SpaceObject {
	private String name;
	
	public StarSystem() {}
	
	public StarSystem(String name) {
		this.name = name;
	}
	public StarSystem(String name, long mass) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "The Star system name: " + name;
	}
}
