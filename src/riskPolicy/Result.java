package riskPolicy;

public interface Result {
	
	Integer result(Integer value);
}

@EducationRegion(education = 7)
class MiddleSchool implements Result{

	public Integer result(Integer value) {
		return 0;
	}
}
	
@EducationRegion(education = 6)
class HightSchool implements Result{

	public Integer result(Integer value) {
		return 100;
	}
}


