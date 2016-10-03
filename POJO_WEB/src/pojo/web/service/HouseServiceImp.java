package pojo.web.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dao.HouseDao;
import pojo.web.dao.HouseDaoImpl;
import pojo.web.dto.House;
import pojo.web.util.DBUtil;

public class HouseServiceImp implements HouseService{
	HouseDao hdao = HouseDaoImpl.getInstance();
	
	//singleton 처리
	private HouseServiceImp() {
	}

	private static HouseServiceImp instance = new HouseServiceImp();

	public static HouseServiceImp getInstance() {
		return instance;
	}
	@Override
	public List<House> selectById(String id) {
		List<House> list =  null;
		try(SqlSession session = DBUtil.getInstance().getSession()){
			list = hdao.selectAllHouse(session);
		}
		return list;
	}
	@Override
	public House selectByNoHouse(int houseNo) {
		House house	=  null;
		try(SqlSession session = DBUtil.getInstance().getSession()){
			house = hdao.selectByNoHouse(session, houseNo);
		}
		return house;
	}
	@Override
	public int insertHouse(House house) {
		int result = 0;
		try(SqlSession session = DBUtil.getInstance().getSession()){
			result = hdao.insertHouse(session, house);
			if(result ==1)
				session.commit();
		}
		return result;
	}
	@Override
	public int updateHouse(House house) {
		int result = 0;
		try(SqlSession session = DBUtil.getInstance().getSession()){
			result = hdao.updateHouse(session, house);
			if(result ==1)
				session.commit();
		}
		return result;
	}
	@Override
	public int deleteHouse(int houseNo) {
		int result = 0;
		try(SqlSession session = DBUtil.getInstance().getSession()){
			result = hdao.deleteHouse(session, houseNo);
			if(result ==1)
				session.commit();
		} 
		return result;
	}
}
