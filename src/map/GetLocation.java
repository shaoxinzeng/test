package map;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;







import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class GetLocation {
      
    /**
     * @param lat 纬度
     * @param log 经度
     * @return
     */
	public String getAdd(String lat ,String log){  
    	//lat 纬度 log 经度
        //参数解释: 纬度,经度 type 001 (100代表道路，010代表POI，001代表门址，111可以同时显示前三项)  
        String urlString = "http://gc.ditu.aliyun.com/regeocoding?l="+lat+","+log+"&type=010";  
        String res = "";
        String allAdd = "";
        BufferedReader in = null;
        HttpURLConnection conn = null;
        try {     
            URL url = new URL(urlString);    
            conn = (HttpURLConnection)url.openConnection();    
            conn.setDoOutput(true);    
            conn.setRequestMethod("POST");    
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));    
            String line;    
           while ((line = in.readLine()) != null) {    
               res += line+"\n";   
               JSONObject jsonObject = JSONObject.fromObject(res);  
               JSONArray jsonArray = JSONArray.fromObject(jsonObject.getString("addrList"));  
               JSONObject j_2 = JSONObject.fromObject(jsonArray.get(0));  
               allAdd = j_2.getString("admName");  
         }    
           // in.close();    
        } catch (Exception e) { 
            System.out.println("error in wapaction,and e is " + e.getMessage());    
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
        System.out.println(res);  
        
        return allAdd;    
    }  

}
