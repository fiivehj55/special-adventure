package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dto.House;
import pojo.web.dto.Member;

public interface HouseDao {
	// 하우스 DAO
	
	List<House> selectAllHouse(SqlSession session);
	House selectByNoHouse(SqlSession session, int houseNo);
	List<House> selectByIdHouse(SqlSession session, String id);
	int insertHouse(SqlSession session, House house);
	int updateHouse(SqlSession session, House house);
	int deleteHouse(SqlSession session, int houseNo);
	
}
