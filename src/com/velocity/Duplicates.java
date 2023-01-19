package com.velocity;

public class Duplicates {
	
	
	public static void main(String[] args) {
		String s="hello everyone";
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length-1;j++) {
				if(ch[i]==ch[j]&& ch[i]!=' ') {
					ch[j]='0';
				}
			}
			if(ch[i]!='0') {
			System.out.print(ch[i]);
		}}
		
	}

}
