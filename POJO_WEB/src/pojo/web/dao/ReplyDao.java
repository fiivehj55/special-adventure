package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dto.Reply;

public interface ReplyDao {
	List<Reply> selectAllReply(SqlSession session);
	
	Reply selectByIdReplyNo(SqlSession session, int replyNo);
	
	int insertReply(SqlSession session, Reply reply);
	
	int updateReply(SqlSession session, Reply reply);
	
	int deleteReply(SqlSession session, int replyNo);
}
