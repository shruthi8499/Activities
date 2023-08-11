package com.functional;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
public class RechargeConsumerData {

    public static void rechargeData(List<Recharge> rechargeList, Function<Recharge, String> consumer) {
        for (Recharge recharge : rechargeList) {
            String result = consumer.apply(recharge);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        List<Recharge> rechargeList = new ArrayList<>();
        rechargeList.add(new Recharge(1, 100, "12-08-2023"));
        rechargeList.add(new Recharge(2, 500, "18-08-2023"));
        rechargeList.add(new Recharge(3, 300, "25-08-2023"));
        Function<Recharge, String> rechargeConsumer = (recharge) ->
                "Customer ID: " + recharge.customerid + ", Recharge amount: " + recharge.amount;
        rechargeData(rechargeList, rechargeConsumer);
    }
}
