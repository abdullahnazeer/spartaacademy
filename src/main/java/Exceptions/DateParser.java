package Exceptions;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateParser {

    public Date convertToDate(String s) {

        Date result = null;

        try {
            // ArithmeticException
            // int x = 7/0;
            result = new SimpleDateFormat("dd/MM/yyyy").parse(s);
        } catch (ParseException pe) {
            pe.printStackTrace();
            System.out.println("Please enter a valid date format: ");
            result = null;
        } catch (NullPointerException npe) {
            npe.printStackTrace();
            result = null;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will ALWAYS be printed");
            return result;
        }

    }

}
