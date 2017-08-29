package riskPolicy;

public class Education {
	private Integer value = 0;
	
	private Result result = new MiddleSchool();
	
	public void count(Integer value){
		this.value = value;
		result =  EducationFactory.getInstance().createResult(this);
	}
	
	public int lastResult(){
		return result.result(value);
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	

}
