package pojo.web.service;

import java.util.List;

import pojo.web.dto.RegistHouse;

//예약 관리 하우스
public interface Regist_HouseService {
	
	public RegistHouse selectByHouseNo(int houseNo);
	public int add(RegistHouse rH);
	public int update(RegistHouse rH);
	public int delete(RegistHouse rH,int rhNo);
}
