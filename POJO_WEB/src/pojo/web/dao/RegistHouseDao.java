package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dto.RegistHouse;

public interface RegistHouseDao {
	List<RegistHouse> selectAllRegistHouse(SqlSession session);
	
	RegistHouse selectByIdRegistHouse(SqlSession session, int rhId);
	
	int insertRegistHouse(SqlSession session, RegistHouse rHouse);
	
	int updateRegistHouse(SqlSession session, RegistHouse rHouse);
	
	int deleteRegistHouse(SqlSession session, int rhNo);

}
