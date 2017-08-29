package sender;

public class Main {
	public static void main(String[] args) {
	HttpSender httpSender = new HttpSender();
	//已经测试能用
	boolean a = httpSender.sendSms("18616268832", "你收到狒狒人品打款30元,预计很快到账，请注意查收");
	//已经测试能用
	//boolean a = httpSender.sendSms("15802190218", "尊敬的曾先生，您的20元借款明日到期，请至APP还款，若到期未还款，平台将自动扣款，请确保尾号123546银行卡资金充足，以免产生逾期。如已还款，请忽略。");
	//已经测试能用
	//boolean a = httpSender.sendSms("15802190218", "尊敬的曾先生，您的狒狒人品借款今日到期，请至APP还款，若到期未还款，平台将自动扣款，请确保尾号123546银行卡资金充足，以免产生逾期。如已还款，请忽略。");
	//已经测试能用
	//boolean a = httpSender.sendSms("15802190218", "恭喜您已经正常还款累计30元，获得提额：30元，请继续保持良好的还款习惯！"); 
	//已经测试能用
	//boolean a = httpSender.sendSms("15802190218", "通过风控运行，您的额度更改为：50元，请保持良好的还款习惯！"); 
	//已经测试能用
	//boolean a = httpSender.sendSms("15802190218", "你收到狒狒人品打款50元,预计很快到账，请注意查收"); 
	//已经测试能用
	//boolean a = httpSender.sendSms("15802190218", "尊敬的用户，本次验证码为123456"); 
	//已经测试能用
	//boolean a = httpSender.sendSms("15802190218", "尊敬的用户，本次验证码为123456有效时间5分钟，您正在注册狒狒人品账户，如不是本人请忽略。"); 
	//已经测试能用
	//boolean a = httpSender.sendSms("15802190218", "尊敬的用户，本次验证码为132456有效时间5分钟，您正在找回156464851账户交易密码，请勿将验证码告诉他人。"); 
	//已经测试能用
	//boolean a = httpSender.sendSms("15802190218", "尊敬的用户，本次验证码为123465有效时间5分钟，您正在找回79878账户交易密码，请勿将验证码告诉他人。"); 
	System.out.println(a);
	}

}
