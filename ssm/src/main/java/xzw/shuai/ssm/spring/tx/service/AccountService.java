package xzw.shuai.ssm.spring.tx.service;

public interface AccountService {

	void transfer(String from, String to, double money);
}
