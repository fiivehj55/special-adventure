package pojo.test.dao;

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
import pojo.web.dao.MemberDetailDao;
import pojo.web.dao.MemberDetailDaoImpl;
import pojo.web.dao.QuestionDao;
import pojo.web.dao.QuestionDaoImpl;
import pojo.web.dao.RegistHouseDao;
import pojo.web.dao.RegistHouseDaoImpl;
import pojo.web.dao.ReplyDao;
import pojo.web.dao.ReplyDaoImpl;
import pojo.web.dao.ReportDao;
import pojo.web.dao.ReportDaoImpl;
import pojo.web.dto.House;
import pojo.web.dto.Member;
import pojo.web.dto.MemberDetail;
import pojo.web.dto.Question;
import pojo.web.dto.RegistHouse;
import pojo.web.dto.Reply;
import pojo.web.dto.Report;
import pojo.web.util.DBUtil;

public class DaoTest {
	
	static Logger logger = LoggerFactory.getLogger(DaoTest.class);
	
	MemberDao mdao = MemberDaoImpl.getInstance();
	HouseDao hdao = HouseDaoImpl.getInstance();
	RegistHouseDao rhdao = RegistHouseDaoImpl.getInstance();
	QuestionDao qdao = QuestionDaoImpl.getInstance();
	ReplyDao rdao = ReplyDaoImpl.getInstance();
	ReportDao rpdao = ReportDaoImpl.getInstance();
	MemberDetailDao mddao = MemberDetailDaoImpl.getInstance();

	/** MEMBER TEST */	
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
			Member member = new Member("yang", "양희준", "1423", "01029051216", "yang@naver.com", "male", "/index.jsp/img", "안녕하세요", 2, "회원");
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
	public void testSelectByNoHouse() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			House house = hdao.selectByNoHouse(session, 1);
			logger.trace("List: {}", house);
		}
	}
	@Test
	public void testSelectByIdHouse() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			List<House> house = hdao.selectByIdHouse(session, "hong");
			logger.trace("List: {}", house);
		}
	}
	@Test
	public void testInsertHouse() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			House house = new House(2, "대전빌라", "대전시 유성구 장대동", 400000, 7, "hello", "hong", 2);
			int result = hdao.insertHouse(session, house);
			logger.trace("List: {}", house);
		}
	}
	
	@Test
	   public void testUpdateHouse() {
	      try(SqlSession session = DBUtil.getInstance().getSession()){
	         House house = new House(1, "빌라", "대전시 유성구 장대동", 400000, 7, "hello", "hong", 2);
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
		Calendar cd = Calendar.getInstance();
		Date dd = cd.getTime();
		try(SqlSession session = DBUtil.getInstance().getSession()){
			RegistHouse rHouse = new RegistHouse(2, dd, dd);
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
	
	/** QUESTION_TEST */
	@Test
	public void testSelectAllQuestion() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			List<Question> question = qdao.selectAllQuestion(session);
			logger.trace("List: {}", question);
		}
	}
	
	@Test
	public void testSelectByQuestNo() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Question question = qdao.selectByQuestNo(session, 1);
			logger.trace("List: {}", question);
		}
	}
	
	@Test
	public void testInsertQuestion() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Calendar cd = Calendar.getInstance();
			Date dd = cd.getTime();
			Question question = new Question(2, "신고합니다.", "예약자가 입금을 하지 않습니다.", dd, "hong", 2);
			int result = qdao.insertQuestion(session, question);
			logger.trace("List: {}", question);
		}
	}
	
	@Test
	public void testUpdateQuestion() {
		Calendar cd = Calendar.getInstance();
		Date dd = cd.getTime();
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Question question = new Question(2, "신고합니다.", "예약자가 입금을 하지 않습니다. 조치를 취해주세요.", null, "hong", 2);
			int result = qdao.updateQuestion(session, question);
			logger.trace("List: {}", question);
		}
	}
	
	@Test
	public void testDeletQuestion() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			int result = qdao.deleteQuestion(session, 1);
			qdao.deleteQuestion(session, 1);
			logger.trace("List: {}", result);
		}
	}
	
	/** REPLY_TEST */
	@Test
	public void testSelectAllReply() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			List<Reply> reply = rdao.selectAllReply(session);
			logger.trace("List: {}", reply);
		}
	}
	
	@Test
	public void testSelectByReplyNo() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Reply reply = rdao.selectByIdReplyNo(session, 1);
			logger.trace("List: {}", reply);
		}
	}
	
	@Test
	public void testInsertReply() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Calendar cd = Calendar.getInstance();
			Date dd = cd.getTime();
			Reply reply = new Reply(2, "정말 깨끗하고 좋았어요.", dd, "hong", 2);
			int result = rdao.insertReply(session, reply);
			logger.trace("List: {}", reply);
		}
	}
	
	@Test
	public void testUpdateReply() {
		Calendar cd = Calendar.getInstance();
		Date dd = cd.getTime();
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Reply reply = new Reply(2, "정말 깨끗하고 좋았어요. 쾌적합니다.", dd, "hong", 2);
			int result = rdao.updateReply(session, reply);
			logger.trace("List: {}", reply);
		}
	}
	
	@Test
	public void testDeletReply() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			int result = rdao.deleteReply(session, 1);
			rdao.deleteReply(session, 1);
			logger.trace("List: {}", result);
		}
	}
	
	/** REPORT_TEST */
	@Test
	public void testSelectAllReport() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			List<Report> report = rpdao.selectAllReport(session);
			logger.trace("List: {}", report);
		}
	}
	
	@Test
	public void testSelectByReportNo() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Report report = rpdao.selectByReport(session, 1);
			logger.trace("List: {}", report);
		}
	}
	
	@Test
	public void testInsertReport() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Calendar cd = Calendar.getInstance();
			Date dd = cd.getTime();
			Report report = new Report(2, "블랙리스트", "이사람 신고합니다.", "이 사람 사기꾼이에여~", dd, "hong", 2);
			int result = rpdao.insertReport(session, report);
			logger.trace("List: {}", report);
		}
	}
	
	@Test
	public void testUpdateReport() {
		Calendar cd = Calendar.getInstance();
		Date dd = cd.getTime();
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Report report = new Report(2, "블랙리스트", "이사람 신고합니다.", "이 사람 사기꾼이에여~ 할아버지의 명예를 걸고 찾아낼꺼에여", dd, "hong", 2);
			int result = rpdao.updateReport(session, report);
			logger.trace("List: {}", report);
		}
	}
	
	@Test
	public void testDeletReport() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			int result = rpdao.deleteReport(session, 1);
			rpdao.deleteReport(session, 1);
			logger.trace("List: {}", result);
		}
	}
	/** MEMBERDEATIL_TEST */
	@Test
	public void testSelectAllMemberDetail() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			List<MemberDetail> memberDetail = mddao.selectAllMemberDetail(session);
			logger.trace("List: {}", memberDetail);
		}
	}
	
	@Test
	public void testSelectByMemberDetailNo() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			MemberDetail memberDetail = mddao.selectByMemberDetail(session, 1);
			logger.trace("List: {}", memberDetail);
		}
	}
	
	@Test
	public void testInsertMemberDetail() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			Calendar cd = Calendar.getInstance();
			Date dd = cd.getTime();
			MemberDetail memberDetail = new MemberDetail(3,"회원");
			int result = mddao.insertMemberDetail(session, memberDetail);
			logger.trace("List: {}", result);
		}
	}
	
	@Test
	public void testUpdateMemberDetail() {
		Calendar cd = Calendar.getInstance();
		Date dd = cd.getTime();
		try(SqlSession session = DBUtil.getInstance().getSession()){
			MemberDetail memberDetail = new MemberDetail(2,"최고관리자");
			int result = mddao.updateMemberDetail(session, memberDetail);
			logger.trace("List: {}", result);
		}
	}
	
	@Test
	public void testDeletMemberDetail() {
		try(SqlSession session = DBUtil.getInstance().getSession()){
			int result = mddao.deleteMemberDetail(session, 2);
			logger.trace("List: {}", result);
		}
	}
	
}
