package pojo.web.service;

import java.util.List;

import pojo.web.dto.Question;

//1:1 문의 게시판
public interface QuestionService {
	//문의 게시글 전체 긁어오기
	public List<Question> selectById(int questNo);
	//문의 게시글 추가
	public int add(Question question);
	//문의 게시글 삭제 관리자만
	public int delete(int questNo);
	
}
