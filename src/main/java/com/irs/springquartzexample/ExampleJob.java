package com.irs.springquartzexample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ExampleJob extends QuartzJobBean {

	private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	 
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		System.out.println("[" + dateFormat.format(Calendar.getInstance().getTime()) + "] Ejecutando Job de Quartz Example");
	}
}
