import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckOperation {

    public static boolean checkOperation(String o) {
        Pattern p = Pattern.compile("[-|\\+|\\*|\\/]");
        Matcher m = p.matcher(o);
        if (!m.matches()) {
            System.out.println("The Selected Operation is not valid - '" + o + "'! Please try again!");
            return false;
        } else return true;
    }
}
