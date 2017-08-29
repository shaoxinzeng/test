package sender;

import com.bcloud.msg.http.HttpSender;

public class HttpSenderTest {

	public static void main(String[] args) {
		//String uri = "http://xxx.xxx.xxx.xx/msg/";//应用地址
		String uri = "http://116.62.64.214/msg/";
		String account = "ffrp88";//账号
		String pswd = "45AZbmBp";//密码
		//String mobiles = "13800210021,13800138000";//手机号码，多个号码使用","分割
		String mobiles ="18616268832";
		String var = "曾先生";
		int a = 456789;
		//String msg = "${"+var+"}"+"您好，您的验证码是"+a;//短信内容
		String msg = "尊敬的曾先生，您的20元借款明日到期，请至APP还款，若到期未还款，平台将自动扣款，请确保尾号123546银行卡资金充足，以免产生逾期。如已还款，请忽略。";//短信内容
		boolean needstatus = true;//是否需要状态报告，需要true，不需要false
		String product = null;//产品ID
		//String content ="短信测试内容";
/*		try {
			String returnString = HttpSender.send(uri, account, pswd, mobiles, content, needstatus, product);
			System.out.println(returnString);
			//TODO 处理返回值,参见HTTP协议文档
		} catch (Exception e) {
			//TODO 处理异常
			e.printStackTrace();
		}*/
		try {
			String returnString = HttpSender.batchSend(uri, account, pswd, mobiles, msg, needstatus, product);
			System.out.println(returnString);
			//TODO 处理返回值,参见HTTP协议文档
		} catch (Exception e) {
			//TODO 处理异常
			e.printStackTrace();
		}
	}
}
