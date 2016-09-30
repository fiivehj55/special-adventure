package pojo.web.service;

import pojo.web.dto.Member;

public interface MemberService {
	public Member login(String id,String password);
	public int join(Member member);
	public int update(Member member, String id);
	public int delete(String id,String password);
	
}
