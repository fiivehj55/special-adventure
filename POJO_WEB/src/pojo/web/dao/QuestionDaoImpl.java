package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dto.Question;

public class QuestionDaoImpl implements QuestionDao {

	@Override
	public List<Question> selectAllQuestion(SqlSession session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question selectByQuestNo(SqlSession session, int questNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertQuestion(SqlSession session, Question question) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateQuestion(SqlSession session, Question question) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteQuestion(SqlSession session, int questNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
