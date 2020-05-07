package com.tank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String,String> hashMap = new HashMap<>();
        Student stu = new Student(12,"this are tanks",99, 123);
        System.out.println("this are students");

        // localDateTime
        LocalDateTime now = LocalDateTime.now();
        String result = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(result);
        assert (1 == 2);

        //
        int num = 0;

        while (num < 100) {
            ++num;
            if (num % 5 == 0) {
                System.out.println(num);
            }
        }
    }

    private void test(Object object) {
        if (object instanceof String) {
            String str = (String)object;
            System.out.println(str.isEmpty());
        }
    }
}
