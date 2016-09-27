package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dto.Member;

public interface MemberDao {
	List<Member> selectAllMember(SqlSession session);
}
