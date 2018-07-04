import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huanle.bao on 25/06/2018.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MainLauncher {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainLauncher.class, args);
    }

    //output list: ["three","two","one"]
    public List<String> reverseList(List<String> list){
        ArrayList<String> finalList = new ArrayList<String>();
        for(int i = list.size() - 1; i >=0; i--){
            finalList.add(list.get(i));
        }
        return finalList;
    }

    //output list: ["ONE","TWO","THREE"]
    public List<String> toUppercaseList(List<String> list){
        ArrayList<String> finalList = new ArrayList<String>();
        for(String s: list){
            finalList.add(s.toUpperCase());
        }
        return finalList;
    }

    //output string: "one,two,three"
    public String concatList(List<String> list){
       String sf = "";
        for(String s : list){
            sf = sf + s + ',';
        }
        return sf.substring(0, sf.length() - 1);
    }

}


@RestController
class GreetingController {

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
        return "Hello, " + name + "!!!";
    }
}