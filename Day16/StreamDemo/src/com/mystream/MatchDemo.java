package com.mystream;
import java.util.stream.*;
import java.util.function.*;
public class MatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream=Stream.of(10,12,13,22);
		//System.out.println(stream.allMatch((e)->e%2==0));
		System.out.println(stream.anyMatch((e)->e%2==0));
		
	}

}
