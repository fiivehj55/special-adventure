package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.web.dto.Member;

public class MemberDaoImpl implements MemberDao {

	static Logger logger = LoggerFactory.getLogger(MemberDaoImpl.class);

	private MemberDaoImpl() {
	}

	private static MemberDaoImpl instance = new MemberDaoImpl();

	public static MemberDaoImpl getInstance() {
		return instance;
	}
	
	private final String MEMBER_MAP = "pojo.web.dao.memberMapper.";
	
	@Override
	public List<Member> selectAllMember(SqlSession session) {
		String stmt = MEMBER_MAP + "selectAllMember";
		return session.selectList(stmt);
	}

	@Override
	public Member selectByIdMember(SqlSession session, String memId) {
		String stmt = MEMBER_MAP + "selectByIdMember";
		return session.selectOne(stmt, memId);
	}

	@Override
	public int insertMember(SqlSession session, Member member) {
		String stmt = MEMBER_MAP + "insertMember";
		return session.update(stmt, member);
	}

	@Override
	public int updateMember(SqlSession session, Member member) {
		String stmt = MEMBER_MAP + "updateMember";
		return session.update(stmt, member);
	}

	@Override
	public int deleteMember(SqlSession session, String memId) {
		String stmt = MEMBER_MAP + "deleteMember";
		return session.update(stmt, memId);
	}
	
}
