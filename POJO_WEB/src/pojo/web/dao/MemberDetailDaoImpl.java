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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDetail selectByMemberDetail(SqlSession session, int detailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertMemberDetail(SqlSession session, MemberDetail mDetail) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMemberDetail(SqlSession session, MemberDetail mDetail) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMemberDetail(SqlSession session, int deltailId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
