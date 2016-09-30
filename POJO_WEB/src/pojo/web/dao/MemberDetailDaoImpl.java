package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dto.MemberDetail;

public class MemberDetailDaoImpl implements MemberDetailDao {

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
