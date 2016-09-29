package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.web.dto.RegistHouse;

public class RegistHouseDaoImpl implements RegistHouseDao {
	
	static Logger logger = LoggerFactory.getLogger(RegistHouseDaoImpl.class);

	private RegistHouseDaoImpl() {
	}

	private static RegistHouseDaoImpl instance = new RegistHouseDaoImpl();

	public static RegistHouseDaoImpl getInstance() {
		return instance;
	}
	
	private final String REGIST_HOUSE_MAP = "pojo.web.dao.RegistHouseMapper.";

	@Override
	public List<RegistHouse> selectAllRegistHouse(SqlSession session) {
		String stmt = REGIST_HOUSE_MAP + "selectAllRh";
		return session.selectList(stmt);
	}

	@Override
	public RegistHouse selectByIdRegistHouse(SqlSession session, int rhId) {
		String stmt = REGIST_HOUSE_MAP + "selectByIdRh";
		return session.selectOne(stmt, rhId);
	}

	@Override
	public int insertRegistHouse(SqlSession session, RegistHouse rHouse) {
		String stmt = REGIST_HOUSE_MAP + "insertRegistHouse";
		return session.update(stmt, rHouse);
	}

	@Override
	public int updateRegistHouse(SqlSession session, RegistHouse rHouse) {
		String stmt = REGIST_HOUSE_MAP + "updateRegistHouse";
		return session.update(stmt, rHouse);
	}

	@Override
	public int deleteRegistHouse(SqlSession session, int rhId) {
		String stmt = REGIST_HOUSE_MAP + "deleteRegistHouse";
		return session.update(stmt, rhId);
	}
}
