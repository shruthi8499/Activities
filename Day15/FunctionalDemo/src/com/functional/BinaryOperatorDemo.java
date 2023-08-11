package com.functional;
import java.util.*;
import java.util.function.BinaryOperator;
public class BinaryOperatorDemo {
	public static void main(String[] args) {
		Consumer item1 = new Consumer("Tea",50);
		Consumer item2 = new Consumer("Coffee",20);
		BinaryOperator<Consumer> binaryOperator = BinaryOperator.maxBy(
                (Consumer i1, Consumer i2) -> i1.getPrice() - i2.getPrice());
		Consumer maxBy = binaryOperator.apply(item1, item2);
        System.out.println(maxBy);
	}

}
