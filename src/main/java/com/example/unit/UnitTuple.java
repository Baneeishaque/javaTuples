package com.example.unit;

import org.javatuples.Pair;
import org.javatuples.Unit;

public class UnitTuple {

	public static void main(String[] args) {
		Unit<String> unit = new Unit<String>("Sajal");
		System.out.println(unit.getValue0());
		Pair<String, String> pair = unit.add(new Unit<String>("Lokesh"));
		System.out.println(unit.getSize());
		System.out.println(unit.getValue0());
		System.out.println(pair.getValue1());
	}

}
