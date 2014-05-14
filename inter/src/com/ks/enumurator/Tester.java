package com.ks.enumurator;

import com.ks.enumurator.Planet;
public class Tester {
	public static void main(String[] args) {
		// args[0] = "68";
		if (args.length != 1) {
			System.err.println("Usage: java Planet <earth_weight>");
			System.exit(-1);
		}
		double earthWeight = Double.parseDouble(args[0]);
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		Planet ps = Planet.valueOf(Planet.EARTH.name());
		ps.surfaceGravity();
		System.out.println(ps.surfaceWeight(33));
		for (Planet p : Planet.values())
			System.out.printf("Your weight on %s is %f%n", p,
					p.surfaceWeight(mass));
	}
}
