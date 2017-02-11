package libraray.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateGenration {

	public static Date getDate()
	{
		SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh");
		Date date =new Date();
		
		return date;
		
	}
	
}
