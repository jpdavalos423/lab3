import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ListTests {
    public class myStringChecker implements StringChecker {
        public boolean checkString(String s) {
            return false;
        }
    }

    @Test
    public void testList() {
        ArrayList<String> list = new ArrayList<String>();
        StringChecker checker = new myStringChecker();
        boolean result = list.filter(checker);
    }
}