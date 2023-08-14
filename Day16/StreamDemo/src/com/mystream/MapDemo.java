package com.mystream;

import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream <Integer> str=Stream.of(10,15,23,45,25);
		str.map((e)->e*e).forEach(System.out::println);
		
		

	}

}
