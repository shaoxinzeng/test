package map;

import org.apache.commons.lang.StringUtils;

public class Main {
	public static void main(String[] args) {
		
		String companyProvince = "";
		String companyCity = "";
		String companyArea = "";
		GetLocation getLocation = new GetLocation();
		for(int i =1; i<=1;i++){
			String add = getLocation.getAdd("22.64840711805556", "113.2078466796875");	
			if(StringUtils.isNotBlank(add)){
	            String arr[] = add.split(",");  
	            if(arr.length>=1){
	            	 companyProvince = arr[0];
	            }
	            if(arr.length>=2){
	            	 companyCity = arr[1];
	            }
	            if(arr.length>=3){
	            	companyArea = arr[2];
	            }
	            System.out.println("省："+companyProvince+"\n市："+companyCity+"\n区："+companyArea);
	    	}else {
				System.out.println("请输入正确的经纬度");
			}
		}
	}
}
