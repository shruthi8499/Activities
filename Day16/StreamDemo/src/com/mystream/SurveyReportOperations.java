/*Observe class below  - 10 mins

   public class SurveyReport
 { 
   private int surveyId;
   private String employeeName;
   private String location ;
   private int total_connection_request;
   private int no_of_days_for_request_completion;
   private int average_request_per_day;
 //getter setter methods 


  }

#perform a max operation to find maximum number of requests received by adding total_connection_request 
#perform a reduce operation on no_of_days_for_request_completion for finding  average time for request completion
#find the total average_request_per_day
#find the location count for location Delhi*/
package com.mystream;
import java.util.ArrayList;
import java.util.stream.Stream;
public class SurveyReportOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SurveyReport> list=new ArrayList();
		list.add(new SurveyReport(1,"alex","hyd",5,4,2));
		list.add(new SurveyReport(1,"sam","delhi",8,3,9));
		list.add(new SurveyReport(1,"erric","mumbai",10,6,4));
		list.add(new SurveyReport(1,"john","delhi",15,4,1));
		Stream<SurveyReport> surveystream=list.stream();
		/*SurveyReport s=surveystream.max((s1,s2)->{
			if(s1.getTotal_connection_request()==s2.getTotal_connection_request())
			{
				return 0;
			}
			else if (s1.getTotal_connection_request() > s2.getTotal_connection_request())
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}).get();
		System.out.println(s);*/
		int Avg_No_of_days_for_request_completion=surveystream.map((e)->e.getNo_of_days_for_request_completion()).reduce(0,(a,b)->(a+b)/2);
		System.out.println(Avg_No_of_days_for_request_completion);
		/*int Total_Average_request_per_day =surveystream.map((e)->e.getAverage_request_per_day()).reduce(0,(a,b)->(a+b));
		System.out.println(Total_Average_request_per_day);
		/*long count_of_delhi=surveystream.filter((e)->e.getLocation().equals("delhi")).count();
		System.out.println(count_of_delhi);*/
	}

}
