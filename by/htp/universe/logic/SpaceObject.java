package by.htp.universe.logic;

public abstract class SpaceObject {
	private static SpaceObject[] spaceObjects = new SpaceObject[0];
	private static int index = 0;
	
	public SpaceObject() {
	}
	
	public static void add(SpaceObject obj) {
		SpaceObject[] tmp = new SpaceObject[spaceObjects.length + 1];
		for (int i = 0; i < spaceObjects.length; i++) {
			tmp[i] = spaceObjects[i];
		}
		tmp[spaceObjects.length] = obj;
		spaceObjects = tmp;
		spaceObjects[SpaceObject.index] = obj;
		SpaceObject.index++;
	}
	
	public static SpaceObject[] getSpaceObjects() {
		return spaceObjects;
	}
	public int size() {
		return this.index;
	}
}
