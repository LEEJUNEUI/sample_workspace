package co.edu.api;

import java.util.ArrayList;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = new Integer("100");
		System.out.println(i);
		
		int i2 = 100;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // 100(int) => 100(Integer) 박싱.
		list.add(200);
		list.add(new Integer(300)); // deprecated 된거 차후 사용을 지원하지 않음. 어떤 이유로든 사용하지 마십시오.
		
		for(int num : list) {
			System.out.println(num);
		}
	
		//문자열 => 숫자.
		int n1 = Integer.parseInt("1000");
		double n2 = Double.parseDouble("23.3");
		
	}
}
