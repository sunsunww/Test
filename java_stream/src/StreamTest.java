import java.util.HashMap;
import java.util.Map;

/**
 * @Project Name:java_jdk8
 * @File Name:null.java
 * @Package Name:PACKAGE_NAME
 * @description: stream
 * @author: sunpei
 * @create: 2021-05-22 11:02
 */
public class StreamTest {
    public static void main(String[] args) {

        Map<String, Integer> items = new HashMap<String, Integer>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);


        items.entrySet().stream().filter(n->n.getValue()>20).forEach(System.out::println);


    }

}