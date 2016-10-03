package pojo.web.service;

import java.util.List;

import pojo.web.dto.Member;

public interface MemberService {
	public Member login(String id,String password);
	public int join(Member member);
	public int update(Member member);
	public int delete(String id,String password);
	public List<Member> allMember();
	
}
