package com.mt.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	

//private static int sumStream(List<Integer> list) {
//	return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
//}
//public static void main(String args[])
//{
	List<Integer> input = new ArrayList<Integer>();
	input.add(89);
	input.add(15);
	input.add(45);
	input.add(2);
	input.add(1);
	int res =sumStream(input);
	System.out.println("Result: "+res);

    List<Integer> even = input.stream().map(s -> Integer.valueOf(s)).filter(number -> number % 2 == 0)
                                .collect(Collectors.toList());
    System.out.println(even);

}

}
