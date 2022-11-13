package tacos.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import tacos.security.NoEncodingPasswordEncoder;

/**
 *  패스워드 인코딩을 하되 비밀번호를 암화화 하지 않음-> 테스트 용 코드
 * */
public class NoEncodingPasswordEncoder implements PasswordEncoder {
	
	@Override
	public String encode(CharSequence rawPwd) {
		return rawPwd.toString();
	}
	
	@Override
	public boolean matches(CharSequence rawPwd, String encodedPwd) {
		return rawPwd.toString().equals(encodedPwd);
	}
}