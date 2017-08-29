package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
/*		Calendar c = Calendar.getInstance();
		//24小时制
		int h = c.get(Calendar.HOUR_OF_DAY);
		//12小时制
		int h2 = c.get(Calendar.HOUR);
		int m = c.get(Calendar.MINUTE);
		System.out.println("h: "+h+"h2: " +h2);
		System.out.println("m: "+m);*/
/*		String a = "12346{789{123";
		String b = a.substring(a.indexOf("{"));
		String c = a.substring(a.lastIndexOf("{"));
		System.out.println(b);
		System.out.println(c);*/
		/*
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("a", 132546);
		
		String a = param.get("a").toString();
		System.out.println(a);*/
		
		
		
/*		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -1); //得到前一天
		Date date = calendar.getTime();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));*/
		//int c = 1;
/*		int f = 3;
		float a = (float)c*100/f;
		String b = String.format("%.2f", a)+"%";
		System.out.println(b);*/
		
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
       /* Calendar calendar1 = Calendar.getInstance();
		calendar1.add(Calendar.DATE, -7); //得到前七天的数据
		Date date1 = calendar1.getTime();
		String df1 = dfm.format(date1);
		
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.add(Calendar.DATE, -6); //得到前六天的数据
		Date date2 = calendar2.getTime();
		String df2 = dfm.format(date2);
		
		
		Calendar calendar3 = Calendar.getInstance();
		calendar3.add(Calendar.DATE, -5); //得到前五天的数据
		Date date3 = calendar3.getTime();
		String df3 = dfm.format(date3);
		Calendar calendar4 = Calendar.getInstance();
		calendar4.add(Calendar.DATE, -4); //得到前四天的数据
		Date date4 = calendar4.getTime();
		String df4 = dfm.format(date4);
		Calendar calendar5 = Calendar.getInstance();
		calendar5.add(Calendar.DATE, -3); //得到前三天的数据
		Date date5 = calendar5.getTime();
		String df5 = dfm.format(date5);
		Calendar calendar6 = Calendar.getInstance();
		calendar6.add(Calendar.DATE, -2); //得到前二天的数据
		Date date6 = calendar6.getTime();
		String df6 = dfm.format(date6);
		Calendar calendar7 = Calendar.getInstance();
		calendar7.add(Calendar.DATE, -1); //得到前一天的数据
		Date date7 = calendar7.getTime();
		String df7 = dfm.format(date7);*/
		
		//String [] a  ={"df1","df2","df3","df4","df5","df6","df7"};
		
		Map<String, String> map = new HashMap<String, String>();
		
		for (int i = 1; i < 8; i++) {
			 Calendar calendari = Calendar.getInstance();
			 calendari.add(Calendar.DATE, -(8-i)); //得到前一天的数据
			 Date datei = calendari.getTime();
			 String dfi = dfm.format(datei);
			 String df = String.valueOf((8-i));
			 String da = "df"+df;
			 map.put(da, dfi);
			 System.out.println("data"+i+" = "+dfi);
		}
		String a = map.get("df1");
		System.out.println(a);
		System.out.println(map.get("df2"));
	}

}
