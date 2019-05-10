package eu.larkc.plugin.reason.pion;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StopRules {
	
	
	static long last_increment = 0;
	static long increment = 0;
	static long last_size = 0;
	
	static long max_time_cost = 1000000000;
	static long last_time_cost;
	static long current_time_cost;
	
	static long currentTime;
	static long lastTime; 
	
	public static void CardinalityCheckingRuleInit()
	{
		last_increment = 0;
		increment = 0;
		last_size = 0;
	}
	
	public static void TimeCostCheckingRuleInit()
	{
		last_increment = 0;
		increment = 0;
		last_size = 0;
		
		Date currentDate = new Date();

	    lastTime = currentDate.getTime();
	    
	    last_time_cost = max_time_cost;
	}
	
	
	public StopRules()
	{
		
	}
	
	

	public boolean CardinalityCheckingRule(long s) {
		// TODO Auto-generated method stub
		Logger log = LoggerFactory.getLogger(StopRules.class);
		boolean answer= false;
		last_increment = increment;	
		increment = s - last_size;
		log.info( "increment = " + increment);
		
		last_size = s; 
		
		if ((increment > last_increment)&&(increment > 0))
		{answer= false;}else {answer= true;};
		
		return answer;
	}
	
	public boolean TimeCostCheckingRule( long s)
	{
		Logger log = LoggerFactory.getLogger(StopRules.class);
		boolean answer= false;
		last_increment = increment;	
		increment = s - last_size;
		log.info( "increment = " + increment);
		
		last_size = s; 
		
		Date currentDate = new Date();

	    currentTime = currentDate.getTime();
	    
	    long total_time_cost = currentTime - lastTime;
	    
	    
		if (increment> 0)
		{
		current_time_cost = total_time_cost/increment;
		
		log.info( "current time cost per newly selected axiom  = " + current_time_cost);
				
		if (current_time_cost > last_time_cost)
		{answer= true;} else {answer=false;};
		
		}
		else {answer= true;};
		
		lastTime = currentTime;
		last_time_cost = current_time_cost;
		
		
		
		return answer;	
		
		
	}
	
	
	}


