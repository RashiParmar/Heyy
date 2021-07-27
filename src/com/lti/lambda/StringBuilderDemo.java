package com.lti.lambda;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String str="LTI";
		str.concat("Mahape");
		System.out.println(str);
		
		StringBuilder sb=new StringBuilder("Lti");
		sb.append(" Mahape");
		System.out.println(sb);
		
		System.out.println(sb.charAt(2));
		System.out.println(sb.indexOf("ti"));
	}

}
