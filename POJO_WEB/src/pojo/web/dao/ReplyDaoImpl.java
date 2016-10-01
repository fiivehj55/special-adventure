package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.web.dto.Reply;

public class ReplyDaoImpl implements ReplyDao {
	
	static Logger logger = LoggerFactory.getLogger(ReplyDaoImpl.class);

	private ReplyDaoImpl() {
	}

	private static ReplyDaoImpl instance = new ReplyDaoImpl();

	public static ReplyDaoImpl getInstance() {
		return instance;
	}
	
	private final String REPLY_MAP = "pojo.web.dao.ReplyMapper.";

	@Override
	public List<Reply> selectAllReply(SqlSession session) {
		String stmt = REPLY_MAP + "selectAllReply";
		return session.selectList(stmt);
	}

	@Override
	public Reply selectByIdReplyNo(SqlSession session, int replyNo) {
		String stmt = REPLY_MAP + "selectByReplyNo";
		return session.selectOne(stmt, replyNo);
	}

	@Override
	public int insertReply(SqlSession session, Reply reply) {
		String stmt = REPLY_MAP + "insertReply";
		return session.update(stmt, reply);
	}

	@Override
	public int updateReply(SqlSession session, Reply reply) {
		String stmt = REPLY_MAP + "updateReply";
		return session.update(stmt, reply);
	}

	@Override
	public int deleteReply(SqlSession session, int replyNo) {
		String stmt = REPLY_MAP + "deleteReply";
		return session.update(stmt, replyNo);
	}
	
}
