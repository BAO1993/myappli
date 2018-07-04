import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by huanle.bao on 25/06/2018.
 */
public class MainLauncherTest {
    public List list = Arrays.asList(new String[]{"one","two","three"});
    public MainLauncher m = new MainLauncher();

    @Test
    public void reverseListTest(){

        List listFinal = m.reverseList(list);
        assertEquals(Arrays.asList(new String[]{"three","two","one"}), listFinal);
    }

    @Test
    public void toUppercaseListTest(){

        List listFinal = m. toUppercaseList(list);
        assertEquals(Arrays.asList(new String[]{"ONE","TWO","THREE"}), listFinal);
    }

    @Test
    public void concatListTest(){

        String s = m.concatList(list);
        assertEquals("one,two,three", s);
    }

}
