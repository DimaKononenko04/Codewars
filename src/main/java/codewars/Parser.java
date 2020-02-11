package codewars;

import java.util.HashMap;
import java.util.Map;

public class Parser {

    public static int parseInt(String numStr) {
        Map<String,Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        map.put("ten",10);
        map.put("eleven",11);
        map.put("twelve",12);
        map.put("thirteen",13);
        map.put("fourteen",14);
        map.put("fifteen",15);
        map.put("sixteen",16);
        map.put("seventeen",17);
        map.put("eighteen",18);
        map.put("nineteen",19);
        map.put("twenty",20);
        map.put("thirty",30);
        map.put("forty",40);
        map.put("fifty",50);
        map.put("sixty",60);
        map.put("seventy",70);
        map.put("eighty",80);
        map.put("ninety",90);
        // add 2 zeroes
        map.put("hundred",100);
        // add 3 zeroes
        map.put("thousand",1000);
        // add 6 zeroes
        map.put("million",1000000);

        // Your code here!
        return -1;
    }
}
