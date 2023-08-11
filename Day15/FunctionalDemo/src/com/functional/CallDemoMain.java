package com.functional;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class CallDemoMain {
 ArrayList<CallQualityFeedback> iArrayList=new ArrayList<>();
 public CallDemoMain() {
	// TODO Auto-generated constructor stub
	 iArrayList.add(new CallQualityFeedback(1,"124567","Excellent",5));
	 iArrayList.add(new CallQualityFeedback(2,"484567","Good",4));
	 iArrayList.add(new CallQualityFeedback(3,"78560","Average",2));
	 iArrayList.add(new CallQualityFeedback(4,"87967","Below average",1));
 }
 public void forEach(Consumer<CallQualityFeedback> c) {
	 for(CallQualityFeedback i:iArrayList) {
		 c.accept(i);
	
}
 }
 //using predict
 public void forEach(Predicate<CallQualityFeedback> c) 
 {
	 for ( CallQualityFeedback i:iArrayList)
	 {
		 if(c.test(i))
		 {
			 System.out.println("quality is good");
		 }
		 else
		 {
			 System.out.println("quality is bad");
		 }
		
	 }
 }
 //using supplier
 public void forEach(Supplier<Integer> c) 
 {
	 for ( CallQualityFeedback i:iArrayList)
	 {
		 System.out.println("quality is increased"+i+" "+(i.getRating()+c.get()));
	 }
 }
	 public static void main(String[] args) {
		 CallDemoMain obj=new CallDemoMain();
		 obj.forEach((e)->System.out.println(e));
		 obj.forEach((e)->e.getRating()>3);
		 obj.forEach(()->3);
	 
	 }
}