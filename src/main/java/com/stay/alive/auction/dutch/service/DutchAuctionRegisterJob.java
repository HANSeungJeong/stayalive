package com.stay.alive.auction.dutch.service;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.stay.alive.auction.dutch.vo.DutchAuction;

import lombok.Data;

public class DutchAuctionRegisterJob extends QuartzJobBean {
	@Autowired
	private DutchauctionService dutchauctionService;
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
		DutchAuction dutchAuction = (DutchAuction)jobDataMap.get("dutchauction");
		
		System.out.println(String.format("Hello %s!", dutchAuction.getAccommodationNo()));
	}

}