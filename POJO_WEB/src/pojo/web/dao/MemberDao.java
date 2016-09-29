package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dto.Member;

public interface MemberDao {
	List<Member> selectAllMember(SqlSession session);
	
	Member selectByIdMember(SqlSession session, String memId);
	
	int insertMember(SqlSession session, Member member);
	
	int updateMember(SqlSession session, Member member);
	
	int deleteMember(SqlSession session, String memId);
	
}
