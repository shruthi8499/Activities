package com.mystream;
import java.util.stream.*;
public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream <Integer> str=Stream.of(10,52,2,12,23,45,67);
		//str.filter((e)->e>15).forEach(System.out::println);
		//System.out.println(str.findAny().get());
		System.out.println(str.findFirst().get());
		
		
	}

}
