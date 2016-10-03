package pojo.web.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dao.RegistHouseDao;
import pojo.web.dao.RegistHouseDaoImpl;
import pojo.web.dto.RegistHouse;
import pojo.web.util.DBUtil;

public class Regist_HouseServiceImp implements Regist_HouseService{
	RegistHouseDao dao = RegistHouseDaoImpl.getInstance();
	//singleton 처리
	private Regist_HouseServiceImp() {
	}

	private static Regist_HouseServiceImp instance = new Regist_HouseServiceImp();

	public static Regist_HouseServiceImp getInstance() {
		return instance;
	}
	@Override
	public RegistHouse selectByHouseNo(int houseNo) {
		RegistHouse list = null;
		try(SqlSession session = DBUtil.getInstance().getSession()){
			list = dao.selectByIdRegistHouse(session, houseNo);
		}
		return list;
	}
	@Override
	public int add(RegistHouse rH) {
		int result =0;
		try(SqlSession session = DBUtil.getInstance().getSession()){
			result = dao.insertRegistHouse(session, rH);
			if(result ==1)
				session.commit();
			}
		return result;
	}
	@Override
	public int update(RegistHouse rH) {
		int result =0;
		try(SqlSession session = DBUtil.getInstance().getSession()){
			result = dao.updateRegistHouse(session, rH);
			if(result ==1)
				session.commit();
			}
		return result;
	}
	public int delete(RegistHouse rH,int rhNo) {
		int result =0;
		try(SqlSession session = DBUtil.getInstance().getSession()){
			result = dao.deleteRegistHouse(session, rhNo);
			if(result ==1)
				session.commit();
		}
		return result;
	}
}
