package org.jayjariwala.timestampMicrservice.Tmicorservice.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.jayjariwala.timestampMicrservice.Tmicorservice.model.timestampModel;

public class timestampService {

	timestampModel model=new timestampModel();
	
	
	public timestampModel dateconvert(long data)
	{
		long unixSeconds = 1450137600;
		Date date = new Date(unixSeconds*1000);
		SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z"); 
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		String formattedDate = sdf.format(date);
		model.setNatural(formattedDate);
		model.setUnix(""+data);
		return model;

	}
	
	public timestampModel unixconvert(String data) throws ParseException
	{
		System.out.println(data);
		String dateString = data+" 12:00:00 UTC";
		DateFormat dateFormat = new SimpleDateFormat("dd MMM ,yyyy hh:mm:ss z");
		Date date = dateFormat.parse(dateString);
		long unixTime = (long)date.getTime()/1000;
		model.setNatural(data);
		model.setUnix(""+unixTime);
		return model;
	}
}
