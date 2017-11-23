package oopsPackage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class CalculateAge {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
Calendar todayCalendar = Calendar.getInstance();
SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
Date dob = dateFormat.parse("04/05/1994");
Calendar dobCalendar = Calendar.getInstance();
dobCalendar.setTime(dob);
int age = todayCalendar.get(Calendar.YEAR)-dobCalendar.get(Calendar.YEAR);
System.out.println("Age: "+age);

	}

}
