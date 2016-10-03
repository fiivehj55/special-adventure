package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.web.dto.House;
import pojo.web.dto.Member;

public class HouseDaoImpl implements HouseDao {
	// 하우스 IMPL

	static Logger logger = LoggerFactory.getLogger(HouseDaoImpl.class);

	private HouseDaoImpl() {
	}

	private static HouseDaoImpl instance = new HouseDaoImpl();

	public static HouseDaoImpl getInstance() {
		return instance;
	}
	
	private final String HOUSE_MAP = "pojo.web.dao.houseMapper.";
	
	@Override
	public List<House> selectAllHouse(SqlSession session) {
		String stmt = HOUSE_MAP + "selectAllHouse";
		return session.selectList(stmt);
	}

	@Override
	public List<House> selectByIdHouse(SqlSession session, String id) {
		String stmt = HOUSE_MAP + "selectByIdHouse";
		return session.selectList(stmt, id);
	}
	@Override
	public House selectByNoHouse(SqlSession session, int houseNo) {
		String stmt = HOUSE_MAP + "selectByNoHouse";
		return session.selectOne(stmt, houseNo);
	}

	@Override
	public int insertHouse(SqlSession session, House house) {
		String stmt = HOUSE_MAP + "insertHouse";
		return session.update(stmt, house);
	}

	@Override
	public int updateHouse(SqlSession session, House house) {
		String stmt = HOUSE_MAP + "updateHouse";
		return session.update(stmt, house);
	}

	@Override
	public int deleteHouse(SqlSession session, int houseNo) {
		String stmt = HOUSE_MAP + "deleteHouse";
		return session.update(stmt, houseNo);
	}
}
