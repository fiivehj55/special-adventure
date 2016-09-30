package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.web.dto.Report;

public interface ReportDao {
	
	List<Report> selectAllReport(SqlSession session);
	
	Report selectByReport(SqlSession session, int reportNo);
	
	int insertReport(SqlSession session, Report report);
	
	int updateReport(SqlSession session, Report report);
	
	int deleteReport(SqlSession session, int reportNo);
	
}
