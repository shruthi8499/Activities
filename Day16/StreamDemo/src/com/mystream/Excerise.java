/*create a stream of below given value using a builder 
   "BaudeRate"
   "Ohm"
   "Kilowatt"
   "Bits"
   "Analog"
   "Digital"


Iterate through the stream using forEach loop */



package com.mystream;

import java.util.stream.Stream;

public class Excerise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream = Stream.<String>builder()
                .add("BaudeRate")
                .add("Ohm")
                .add("Kilowatt")
                .add("Bits")
                .add("Analog")
                .add("Digital")
                .build();
        stream.forEach(System.out::println);
	}

}
