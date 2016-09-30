package pojo.web.service;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dao.MemberDao;
import pojo.web.dao.MemberDaoImpl;
import pojo.web.dto.Member;
import pojo.web.util.DBUtil;

public class MemberServiceImp implements MemberService{
	MemberDao dao = MemberDaoImpl.getInstance();
	
	//singleton 처리
	private MemberServiceImp() {
	}

	private static MemberServiceImp instance = new MemberServiceImp();

	public static MemberServiceImp getInstance() {
		return instance;
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
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int join(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(Member member, String id) {
		// TODO Auto-generated method stub
		return 0;
	}
}
