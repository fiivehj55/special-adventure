package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dto.Question;

public interface QuestionDao {
	
	List<Question> selectAllQuestion(SqlSession session);
	
	Question selectByQuestNo(SqlSession session, int questNo);
	
	int insertQuestion(SqlSession session, Question question);
	
	int updateQuestion(SqlSession session, Question question);
	
	int deleteQuestion(SqlSession session, int questNo);
	
}
