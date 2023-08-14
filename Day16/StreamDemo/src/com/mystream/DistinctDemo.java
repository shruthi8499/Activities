package com.mystream;

import java.util.stream.Stream;

public class DistinctDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream st=Stream.of("abc","abc","bcd");
		st.distinct().forEach(System.out::println);

	}

}
