package com.mystream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numlist=Arrays.asList(20,12,15,14);
		Stream<Integer> intstream=numlist.stream();
		System.out.println(intstream.reduce(0,(e1,e2)->e1+e2)/numlist.size());	
		}

}
