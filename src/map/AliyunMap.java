package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class AliyunMap {
	
	/**
	 * @param lat 纬度
	 * @param log 经度
	 * @return
	 */
	public String getAdd(String lat,String log){
		String urlString="http://gc.ditu.aliyun.com/regeocoding?l="+lat+","+log+"&type=010";
		String res = "";
		String allAdd = "";
		BufferedReader in = null;
		HttpURLConnection conn = null;
		try {
			URL url = new URL(urlString);
			conn = (HttpURLConnection) url.openConnection();
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			String line;
			while((line = in.readLine())!=null){
				res += line+"\n";
				JSONObject jsonObject = JSONObject.fromObject(res);
				JSONArray jsonArray = JSONArray.fromObject(jsonObject.getString("addrList"));
				JSONObject j_2 = JSONObject.fromObject(jsonArray.get(0));
				allAdd = j_2.getString("admName");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(null != in){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(null != conn){
				conn.disconnect();
			}
		}
		
		return allAdd;
	}

}
