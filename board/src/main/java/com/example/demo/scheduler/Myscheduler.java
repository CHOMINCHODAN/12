package com.example.demo.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Myscheduler {
	
//	 시간은 초 분 시 일 월 요일 순으로 간다.
	@Scheduled(cron = "0/10 *  * * * *")
	public void test() {
		System.out.println("TEST");
	}
}
