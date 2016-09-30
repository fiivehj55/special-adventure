package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dto.MemberDetail;

public interface MemberDetailDao {
	
	List<MemberDetail> selectAllMemberDetail(SqlSession session);
	
	MemberDetail selectByMemberDetail(SqlSession session, int detailId);
	
	int insertMemberDetail(SqlSession session, MemberDetail mDetail);
	
	int updateMemberDetail(SqlSession session, MemberDetail mDetail);
	
	int deleteMemberDetail(SqlSession session, int deltailId);
	
}
