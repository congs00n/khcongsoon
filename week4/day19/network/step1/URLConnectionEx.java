package com.week4.day19.network.step1;

import java.net.*; 
import java.io.*; 
import java.util.*; 
class URLConnectionEx{ 
	public static void main(String[] args) throws Exception{ 
		// 해당 url 클래스를 통해서 웹을 요청할 수 있다. 
		URL url = new URL("https://api.openweathermap.org/data/2.5/weather?appid=4f9c5b0067c80f8b4d2afe3af1e611a8&q=seoul&units=metric"); 
		URLConnection urlCon = url.openConnection(); 
		urlCon.connect(); 
		Map<String , List<String>> map = urlCon.getHeaderFields(); 
		Set<String> s = map.keySet(); 
		Iterator<String> iterator = s.iterator(); 
		while(iterator.hasNext()){ 
			String name = iterator.next(); 
			System.out.print(name + ": "); 
			List<String> value = map.get(name); 
			for(String _temp : value) 
				System.out.println(_temp); 
		} 
		int len = urlCon.getContentLength(); 
		System.out.println("문서의 길이 : "+len+" 바이트"); 
		if(len>0){ 
			// 내용을 받아오기 위해서 입출력 스트림이 필요하다. 
			InputStream input = urlCon.getInputStream(); 
			int readByte; 
			System.out.println("=== 문서의 내용 ==="); 
			while(((readByte = input.read()) != -1) 
					&& (--len>0)){ 
				System.out.print((char) readByte); 
			} 
			input.close(); 
		}else{ 
			System.out.println("내용이 없음"); 
		} 
	} 
}
