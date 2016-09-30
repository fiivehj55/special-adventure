package pojo.test.dao;

import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.web.dao.HouseDao;
import pojo.web.dao.HouseDaoImpl;
import pojo.web.dao.MemberDao;
import pojo.web.dao.MemberDaoImpl;
import pojo.web.dao.RegistHouseDao;
import pojo.web.dao.RegistHouseDaoImpl;
import pojo.web.dto.House;
import pojo.web.dto.Member;
import pojo.web.dto.RegistHouse;
import pojo.web.util.DBUtil;

public class DaoTest {
	
	static Logger logger = LoggerFactory.getLogger(DaoTest.class);
	
	MemberDao mdao = MemberDaoImpl.getInstance();
	HouseDao hdao = HouseDaoImpl.getInstance();
	RegistHouseDao rhdao = RegistHouseDaoImpl.getInstance();

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
			Member member = new Member("yang", "양희준", "1423", "01029051216", "yang@naver.com", "male", "/index.jsp/img", "안녕하세요");
			int result = mdao.insertMember(session, member);
			logger.trace("List: {}", member);
		}
	}
	
	@Test
	public void testUpdateMember() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Member member = new Member("yang", "양희준", "1425", "01029051217", "yang1@naver.com", "male", "/index.jsp/img", "안녕하세요!!", 2, "회원");
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
	
	/** REGIST_HOUSE */
	@Test
	public void testSelectAllRegistHouse() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			List<RegistHouse> rhouse = rhdao.selectAllRegistHouse(session);
			logger.trace("List: {}", rhouse);
		}
	}
	
	@Test
	public void testSelectByIdRegistHouse() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			RegistHouse rhouse = rhdao.selectByIdRegistHouse(session, 1);
			logger.trace("List: {}", rhouse);
		}
	}
	
	// date type 넣는 Query 생각하기
	@Test
	public void testInsertRegistHouse() {
		Calendar cd = Calendar.getInstance();
		Date dd = cd.getTime();
		try(SqlSession session = DBUtil.getInstance().getSession()){
			RegistHouse rhouse = new RegistHouse(2, dd, dd);
			int result = rhdao.insertRegistHouse(session, rhouse);
			logger.trace("List: {}", rhouse);
		}
	}
	
	// date type 넣는 Query 생각하기
	@Test
	public void testUpdateRegistHouse() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			RegistHouse rHouse = new RegistHouse(2, null, null);
			int result = rhdao.updateRegistHouse(session, rHouse);
			logger.trace("List: {}", rHouse);
		}
	}
	
	@Test
	public void testDeleteRegistHouse() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			int result = rhdao.deleteRegistHouse(session, 1);
			rhdao.deleteRegistHouse(session, 1);
			logger.trace("List: {}", result);
		}
	}
	
}
