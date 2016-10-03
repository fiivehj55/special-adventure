package pojo.web.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dao.MemberDao;
import pojo.web.dao.MemberDaoImpl;
import pojo.web.dao.MemberDetailDao;
import pojo.web.dao.MemberDetailDaoImpl;
import pojo.web.dto.Member;
import pojo.web.util.DBUtil;

public class MemberServiceImp implements MemberService{
	MemberDao dao = MemberDaoImpl.getInstance();
	MemberDetailDao mddao = MemberDetailDaoImpl.getInstance();
	//singleton 처리
	private MemberServiceImp() {
	}

	private static MemberServiceImp instance = new MemberServiceImp();

	public static MemberServiceImp getInstance() {
		return instance;
	}
	@Override
	public List<Member> allMember() {
		List<Member> list = null;
		try(SqlSession session = DBUtil.getInstance().getSession()){
			list = dao.selectAllMember(session);
		}
		return list;
	}
	@Override
	public Member login(String id, String password) {
		Member user = null;
		try(SqlSession session = DBUtil.getInstance().getSession()){
			user = dao.selectByIdMember(session, id);
		}
		
		if(user.getMemPassword().equals(password))
			return user;
		else
			return null;
	}
	@Override
	public int delete(String id, String password) {
		int result = 0;
		try(SqlSession session = DBUtil.getInstance().getSession()){		
		}
		return 0;
	}
	@Override
	public int join(Member member) {	
		int result = 0;
		try(SqlSession session = DBUtil.getInstance().getSession()){
			result = dao.insertMember(session, member);
		}
		return result;
	}
	@Override
	public int update(Member member) {
		int result = 0;
		try(SqlSession session = DBUtil.getInstance().getSession()){
			result = dao.updateMember(session, member);
		}
		return result;
	}
}
