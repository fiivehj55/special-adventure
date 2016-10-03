package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.web.dto.MemberDetail;

public class MemberDetailDaoImpl implements MemberDetailDao {
	
	static Logger logger = LoggerFactory.getLogger(MemberDetailDaoImpl.class);

	private MemberDetailDaoImpl() {
	}

	private static MemberDetailDaoImpl instance = new MemberDetailDaoImpl();

	public static MemberDetailDaoImpl getInstance() {
		return instance;
	}
	
	private final String MEMBER_DETAIL_MAP = "pojo.web.dao.MemberDetailMapper.";
	
	@Override
	public List<MemberDetail> selectAllMemberDetail(SqlSession session) {
		String stmt = MEMBER_DETAIL_MAP + "selectAllMemberDetail";
		return session.selectList(stmt);
	}

	@Override
	public MemberDetail selectByMemberDetail(SqlSession session, int detailId) {
		String stmt = MEMBER_DETAIL_MAP + "selectByMemberDetail";
		return session.selectOne(stmt, detailId);
	}

	@Override
	public int insertMemberDetail(SqlSession session, MemberDetail mDetail) {
		String stmt = MEMBER_DETAIL_MAP + "insertMemberDetail";
		return session.insert(stmt, mDetail);
	}

	@Override
	public int updateMemberDetail(SqlSession session, MemberDetail mDetail) {
		String stmt = MEMBER_DETAIL_MAP + "updateMemberDetail";
		return session.update(stmt, mDetail);
	}

	@Override
	public int deleteMemberDetail(SqlSession session, int deltailId) {
		String stmt = MEMBER_DETAIL_MAP + "deleteMemberDetail"; 
		return session.delete(stmt, deltailId);
	}
	
}
