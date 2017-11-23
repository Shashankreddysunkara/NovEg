package oopsPackage;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Calendar;


	public class AccurateAge {
		public static int calculateAge(Date dob) {
	        Calendar birth = Calendar.getInstance();
	        birth.setTime(dob);
	        Calendar today = Calendar.getInstance();

	        int yearDifference = today.get(Calendar.YEAR)
	                - birth.get(Calendar.YEAR);

	        if (today.get(Calendar.MONTH) < birth.get(Calendar.MONTH)) {
	            yearDifference--;
	        } else {
	            if (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH)
	                    && today.get(Calendar.DAY_OF_MONTH) < birth
	                            .get(Calendar.DAY_OF_MONTH)) {
	                yearDifference--;
	            }

	        }

	        return yearDifference;
		}

		public static void main(String[] args) throws ParseException {
			SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
			Date dob=d.parse("02/02/1974");
			System.out.println(AccurateAge.calculateAge(dob));
}
}