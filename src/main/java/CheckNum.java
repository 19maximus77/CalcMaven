import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNum {

    public static boolean checkNum(String num) {
        Pattern p = Pattern.compile("[+-]?([0-9]*[.])?[0-9]+");
        Matcher m = p.matcher(num);
        if (!m.matches()) {
            System.out.println("Not Number is Entered - '" + num + "'! Please try again!");
            return false;
        } else return true;
    }
}
