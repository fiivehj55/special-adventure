package pojo.web.service;

import pojo.web.dto.Member;

public interface MemberService {
	public Member login(String id,String password);
}
