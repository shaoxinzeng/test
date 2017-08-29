package weightCalculation;

public class WeightCalculation {
	
	public String weightCalculation(String sex,Integer height){
		double weight = 0.00;
		if(sex.equals("男")){
			 weight = (height - 80) * 0.7 ;
		}else{
			 weight = (height - 80) * 0.7 ;
		}
		String result = String .format("%.2f",weight);
		System.out.println("您对应的标准体重为："+ result+"kg;");
		return result;
	}

}
