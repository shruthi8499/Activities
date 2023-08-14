package com.mystream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
public class StreamDemo {

	public static void main(String[] args) {
		//1. stream creating using builder function
		/*Stream.Builder<String> builder=Stream.Builder<String>();
		builder.add("modem");
		builder.add("connector");
		builder.add("terminal");
		Stringstream.forEach(System.out::println);
		//2. stream creation using iterate method
		Stream<Integer> intstream=Stream.iterate(1, n->n+2).limit(15);
		intstream.forEach(System.out::println);*/
		//intsream
		//1.
		/*IntStream intstream=IntStream.of(10,12,13,22);
		intstream.forEach(System.out::println);
		//2.
		IntStream intstream=IntStream.range(1, 5);
		intstream.forEach(System.out::println);
		IntStream closestream=IntStream.rangeClosed(1, 5);
		closestream.forEach(System.out::println);
		//double stream
		
		DoubleStream doublestream=DoubleStream.of(12,10,55,84);
		doublestream.forEach(System.out::println);*/
		
		//generate func
		IntStream stream=IntStream.generate(()->new Random().nextInt(10)).limit(10);
		stream.forEach(System.out::println);;
		
		

}

}
