package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dto.House;
import pojo.web.dto.Member;

public interface HouseDao {
	List<House> selectAllHouse(SqlSession session);
	
	House selectByIdHouse(SqlSession session, int houseNo);
	
	int insertHouse(SqlSession session, House house);
	
	int updateHouse(SqlSession session, House house);
	
	int deleteHouse(SqlSession session, int houseNo);
	
}
