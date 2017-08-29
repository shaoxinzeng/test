package riskPolicy;

public class Main {
	public static void main(String[] args) {
		
		Education education = new Education();
		education.count(7);
		System.out.println("返回的结果集："+education.lastResult());
		
		Education education2 = new Education();
		education2.count(6);
		System.out.println("返回的结果集："+education2.lastResult());

		Education education3 = new Education();
		education3.count(3);
		System.out.println("返回的结果集："+education3.lastResult());
		Education education4 = new Education();
		education4.count(4);
		System.out.println("返回的结果集："+education4.lastResult());
		
		education.count(2);
		System.out.println("返回的结果集："+education.lastResult());

	}

}
