package pojo.web.service;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dao.MemberDao;
import pojo.web.dao.MemberDaoImpl;
import pojo.web.dto.Member;
import pojo.web.util.DBUtil;

public class MemberServiceImp implements MemberService{
	MemberDao dao = MemberDaoImpl.getInstance();
	
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
}
