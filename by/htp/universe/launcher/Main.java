package by.htp.universe.launcher;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import by.htp.universe.entity.Moon;
import by.htp.universe.entity.Planet;
import by.htp.universe.entity.Star;
import by.htp.universe.entity.StarSystem;
import by.htp.universe.logic.SpaceObject;

public class Main {
	public static void main(String ...strings) {
		StarSystem starSystem = new StarSystem("The Solar System");
		SpaceObject.add(starSystem);
		Star sun = new Star("Sun");
		SpaceObject.add(sun);
		
		Planet mercury = new Planet("Mercury");
		SpaceObject.add(mercury);
		
		Planet venys = new Planet("Venys");
		SpaceObject.add(venys);

		
		
		Planet earth = new Planet("Earth");
		SpaceObject.add(earth);
		Moon moon = new Moon("Moon");
		earth.add(moon);
		
		
		
		Planet mars = new Planet("Mars");
		SpaceObject.add(mars);
		Moon phobos = new Moon("Phobos");
		Moon deimos = new Moon("Deimos");
		mars.add(phobos);
		mars.add(deimos);
		
		
		
		Planet jupiter = new Planet("Jupiter");
		SpaceObject.add(jupiter);
		Moon io = new Moon("Io");
		Moon europa = new Moon("Europa");
		Moon ganymede = new Moon("Ganymede");
		Moon callisto = new Moon("Callisto");
		jupiter.add(io);
		jupiter.add(europa);
		jupiter.add(ganymede);
		jupiter.add(callisto);
			
		Planet saturn = new Planet("Saturn");
		SpaceObject.add(saturn);
		Moon mimas = new Moon("Mimas");
		Moon enceladus = new Moon("Enceladus");
		Moon tethys = new Moon("Tethys");
		Moon dione = new Moon("Dione");
		Moon rhea = new Moon("Rhea");
		Moon titan = new Moon("Titan");
		Moon iapetus = new Moon("Iapetus");
		saturn.add(mimas);
		saturn.add(enceladus);
		saturn.add(tethys);
		saturn.add(dione);
		saturn.add(rhea);
		saturn.add(titan);
		saturn.add(iapetus);
		
		Planet uranus = new Planet("Uranus");
		SpaceObject.add(uranus);
		Moon miranda = new Moon("Miranda");
		Moon ariel = new Moon("Ariel");
		Moon umbriel = new Moon("Umbriel");
		Moon titania = new Moon("Titania");
		Moon oberon = new Moon("Oberon");
		uranus.add(miranda);
		uranus.add(ariel);
		uranus.add(umbriel);
		uranus.add(titania);
		uranus.add(oberon);
			
		Planet neptune = new Planet("Neptune");
		SpaceObject.add(neptune);
		Moon triton = new Moon("Triton");
		Moon nereid = new Moon("Nereid");
		Moon halimede = new Moon("Halimede");
		Moon sao = new Moon("Sao");
		Moon laomedeia = new Moon("Laomedeia");
		Moon psamathe = new Moon("Psamathe");
		Moon neso = new Moon("Neso");
		neptune.add(triton);
		neptune.add(nereid);
		neptune.add(halimede);
		neptune.add(sao);
		neptune.add(laomedeia);
		neptune.add(psamathe);
		neptune.add(neso);
		
		
		for (int i = 0; i < SpaceObject.getSpaceObjects().length; i++) {
			//System.out.println(SpaceObject.getSpaceObjects()[i].getClass().hashCode());
		}
	      int a1 = 10;
	      int b1 = 24;
	      System.out.printf("Число 3 в квадрате равно %.0f \n", 5.97237 * Math.pow(a1, b1));
	}
}
