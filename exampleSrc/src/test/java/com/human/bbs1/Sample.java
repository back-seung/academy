package com.human.bbs1;

import java.util.ArrayList;
import java.util.HashMap;

public class Sample {
 // 웹서비스를 제공할 클래스가 아니라 문법을 공부하기 위한 클래스...
	public static void main(String[] args) {
		/** 공부 목적
		 *   List 와 Map의 특징을 이해하고 사용법을 익힌다.
		 */
		
		/**
		 *   List 특징   - List 종류 중에 하나가 ArrayList
		 *    1. 저장되는 요소가 순서가 있다..  index  가지고 있다.  
		 *    2. 같은 요소가 중복이 가능하다. 왜 가능하나면 index는 중복될 수 없다.
		 *    3. 내부적으로 배열을 이용합니다.  배열을 튜닝한 느낌의 구조
		 * 
		 */
		
		 ArrayList<Integer> a1 = new ArrayList<Integer>();  
		 a1.add(40);
		 a1.add(30);
		 a1.add(25);
		 System.out.println(a1.size());
		 for(int i=0; i < a1.size(); i++) {
			 System.out.println(a1.get(i));
		 }
		 
		 /** 
		  *  Map 
		  *   1. 키와 값을 하나의 쌍으로 저장하는 방식  key - value 구성.. (인덱스가 없습니다) 
		  *   2. 배열을 사용하지 않습니다...
		  *   3. key는 중복이 불가능. 예들어 영어 단어를  key로 설계, 한글을 value 설계한다면
		  *      같은 영어 단어를 중복되어 입력이 불가 합니다.
		  *      그러나 리스트는 객체로 영어와 한글을 만들고 인덱스를 중심으로 입력하기 때문에
		  *      중복된 영어단어 입력이 가능하다.
		  *   4. 요소의 순서가 없이 저장됩니다. 키는 중복이 불가능하지만, 요소는 중복이 가능합니다.
		  *       왜나면 키를 중심으로 저장하기 때문입니다.
		  *   5. HashMap의 특징
		  *      해시알고리즘 사용하기때문에 검색 속도가 매우 빠르다는 특징을 가지고 있습니다.
		  *      검색에 중점을 두고서 사전을 만든다면  List보다는  Map이 더 좋습니다.
		  * 
		  * 
		  */
		HashMap<String, Integer> h = new HashMap<String,Integer>();  //<key, value>
		h.put("사과",100);
		h.put("바나나",200);
		//
		// 확장된 반복문
		for(String key : h.keySet()) {
			System.out.println(key + "/" + h.get(key));
		}
		h.put("바나나",500);
		//
		// 확장된 반복문
		for(String key : h.keySet()) {
			System.out.println(key + "/" + h.get(key));
		}
		
		
		
	}

}
