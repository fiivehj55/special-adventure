package pojo.test.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.web.dao.HouseDao;
import pojo.web.dao.HouseDaoImpl;
import pojo.web.dao.MemberDao;
import pojo.web.dao.MemberDaoImpl;
import pojo.web.dto.House;
import pojo.web.dto.Member;
import pojo.web.util.DBUtil;

public class DaoTest {
	
	static Logger logger = LoggerFactory.getLogger(DaoTest.class);
	
	MemberDao mdao = MemberDaoImpl.getInstance();
	HouseDao hdao = HouseDaoImpl.getInstance();

	/** MEMBER TEST */
	@Test
	public void testTemplate() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSelectAllMember() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			List<Member> member = mdao.selectAllMember(session);
			logger.trace("List: {}", member);
		}
	}
	
	@Test
	public void testSelectByIdMember() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Member member = mdao.selectByIdMember(session, "hong");
			logger.trace("List: {}", member);
		}
	}
	
	@Test
	public void testInsertMember() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Member member = new Member("yang", "양희준", "1423", "01029051216", "yang@naver.com", "male", "안녕하세요");
			int result = mdao.insertMember(session, member);
			logger.trace("List: {}", member);
		}
	}
	
	@Test
	public void testUpdateMeber() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Member member = new Member("yang", "양희준", "1425", "01029051217", "yang1@naver.com", "male", "안녕하세요!!");
			int result = mdao.insertMember(session, member);
			logger.trace("List: {}", member);
		}
	}
	
	@Test
	public void testDeleteMeber() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			int result = mdao.deleteMember(session, "hong");
			mdao.deleteMember(session, "hong");
			logger.trace("List: {}", result);
		}
	}
	
	/** HOUSE TEST */
	@Test
	public void testSelectAllHouse() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			List<House> house = hdao.selectAllHouse(session);
			logger.trace("List: {}", house);
		}
	}
	
	@Test
	public void testSelectByIdHouse() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			House house = hdao.selectByIdHouse(session, 1);
			logger.trace("List: {}", house);
		}
	}
	
	@Test
	public void testInsertHouse() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			House house = new House(2, "대전빌라", "대전시 유성구 장대동", 400000, 7, "hello");
			int result = hdao.insertHouse(session, house);
			logger.trace("List: {}", house);
		}
	}
	
	@Test
	   public void testUpdateHouse() {
	      try(SqlSession session = DBUtil.getInstance().getSession()){
	         House house = new House(1, "빌라", "대전시 유성구 장대동", 400000, 7, "hello");
	         int result = hdao.updateHouse(session, house);
	         logger.trace("List: {}", house);
	      }
	   }
	   @Test
	   public void testDeleteHouse() {
	      try(SqlSession session = DBUtil.getInstance().getSession()){
	         House house = new House(2, "대전빌라", "대전시 유성구 장대동", 400000, 7, "hello");
	         int result = hdao.deleteHouse(session, 1);
	         logger.trace("List: {}", house);
	      }
	   }
	
}
