package pojo.web.service;

import java.util.List;

import pojo.web.dto.House;

public class HouseServiceImp implements HouseService{
	//singleton 처리
	private HouseServiceImp() {
	}

	private static HouseServiceImp instance = new HouseServiceImp();

	public static HouseServiceImp getInstance() {
		return instance;
	}
	@Override
	public List<House> selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public House selectByIdHouse(int houseNo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int insertHouse(House house, String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateHouse(House house) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteHouse(int houseNo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
