package pojo.web.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.web.dao.QuestionDao;
import pojo.web.dao.QuestionDaoImpl;
import pojo.web.dto.Question;
import pojo.web.util.DBUtil;

public class QuestionServiceImp implements QuestionService {
	
	static Logger logger = LoggerFactory.getLogger(QuestionServiceImp.class);

	private QuestionServiceImp() {
	}

	private static QuestionServiceImp instance = new QuestionServiceImp();

	public static QuestionServiceImp getInstance() {
		return instance;
	}
	
	QuestionDao dao = QuestionDaoImpl.getInstance();

	@Override
	public List<Question> selectById(int questNo) {
		List<Question> question = null;
		try (SqlSession session = DBUtil.getInstance().getSession()){
			question = dao.selectAllQuestion(session);
		}
		return question;
	}

	@Override
	public int add(Question question) {
		int result = 0;
		try (SqlSession session = DBUtil.getInstance().getSession()){
			result = dao.insertQuestion(session, question);
			if(result == 1){
				session.commit();
			}
		}
		return result;
	}

	@Override
	public int delete(int questNo) {
		int result = 0;
		try (SqlSession session = DBUtil.getInstance().getSession()){
			result = dao.deleteQuestion(session, questNo);
			if(result == 1){
				session.commit();
			}
		}
		return result;
	}
	
	
}
