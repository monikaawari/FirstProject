package com.velocity;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
public static void main(String[] args) {

	String s="avali lovely kohali";
	char[]ch=s.toCharArray();
Set<Character>set=new HashSet<Character>();
Set<Character>duplicates=new LinkedHashSet<Character>();
for(char c:ch) {
	if(!set.add(c)&& c!=' ') {
		duplicates.add(c);
	}
}
System.out.println(duplicates);
}
}
