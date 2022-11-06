package com.shop.persistence;

import com.shop.domain.MemberVO;

public interface MemberDAO {
	
	//회원가입
	public void singup(MemberVO vo) throws Exception;
	
	//로그인
	public MemberVO signin(MemberVO vo) throws Exception;
}
