import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Mian {

	
	public static void main(String[] args) {
		
		
		DateFormat dfm = new SimpleDateFormat("yyyy/MM/dd");
		for(int i=1;i<8;i++){
			Calendar calendari = Calendar.getInstance();
			calendari.add(Calendar.DATE, -(8-i)); //得到前一天的数据
			Date datei = calendari.getTime();
			String df = dfm.format(datei);
			System.out.println(df);
			if(i==7){
				System.out.println("昨天的日期:"+df);
			}
	}
		
	}
}
