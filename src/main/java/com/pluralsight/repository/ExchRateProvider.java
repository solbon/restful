package com.pluralsight.repository;

import com.pluralsight.model.ExchRateLite;

import java.math.BigDecimal;

/**
 * Created by sdaribazaron on 2016-08-10.
 */
public class ExchRateProvider {


    public void add(ExchRateLite rate) {
        System.out.println(rate);
        System.out.println("rate.getBuyRate() = " + rate.getBuyRate());
        System.out.println("rate.getSellRate() = " + rate.getSellRate());
        System.out.println("rate.getAvgRate() = " + rate.getAvgRate());
        if (rate.getAvgRate() instanceof BigDecimal)
            System.out.println("avgRate is BigDecimal");
        // insert into DB
    }
}
