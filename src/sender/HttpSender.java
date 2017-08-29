package sender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import net.sf.json.JSONObject;

public class HttpSender {
	
	public boolean sendSms(String telephone,String sms){
		String uri = "http://116.62.64.214/msg/";
		String account = "ffrp88";//账号
		String pswd = "45AZbmBp";//密码
		boolean needstatus = true;//是否需要状态报告，需要true，不需要false
		String resptype = "json";
		String res = "";
		String urlString = uri+"/HttpBatchSendSM?account="+account+"&pswd="+pswd+"&mobile="+telephone+"&msg="+sms+
				"&needstatus="+needstatus+"&resptype="+resptype; 
        BufferedReader in = null;
        HttpURLConnection conn = null;
        try {
			URL url = new URL(urlString);
            conn = (HttpURLConnection)url.openConnection();    
            conn.setDoOutput(true);    
            conn.setRequestMethod("GET"); 
            conn.setRequestProperty("Charset", "UTF-8");
            conn.setRequestProperty("Content-Type", "application/json");
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));  
            String line; 
            while ((line = in.readLine()) != null) {    
                res += line+"\n";   
                System.out.println(res);
                JSONObject jsonObject = JSONObject.fromObject(res);  
                String result = jsonObject.getString("result");
                System.out.println(result);
                if(result.equals("0")){
                	return true;
                }
          }   
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
        	if(null != in){
        		try {
					in.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
        	}
        	if(null != conn){
        		conn.disconnect();
        	}
        }
        
		return false;
	}

}
