package pojo.test.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.web.dao.MemberDao;
import pojo.web.dao.MemberDaoImpl;
import pojo.web.dto.Member;
import pojo.web.util.DBUtil;

public class DaoTest {
	
	static Logger logger = LoggerFactory.getLogger(DaoTest.class);
	
	MemberDao dao = MemberDaoImpl.getInstance();

	@Test
	public void testTemplate() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSelectAllMember() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			List<Member> member = dao.selectAllMember(session);
			logger.trace("List: {}", member);
		}
	}

}
