package com.functional;
import java.util.function.Predicate;
public class PredicateAge {
	public static void main(String[] args) {
		int[] agearray={12,23,11,19,35,22};
		Candidate obj=new Candidate();
		Predicate<Integer> agecheck =a->(a>18);
		for (int age:agearray)
		{
			System.out.println(agecheck.test(age));
			obj.checkAge(age);
		}
		

	}

}
