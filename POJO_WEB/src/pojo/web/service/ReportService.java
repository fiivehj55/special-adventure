package pojo.web.service;

import java.util.List;

import pojo.web.dto.Report;
//신고게시판
public interface ReportService {
	
	List<Report> selectAllReport(String id);
	
	Report selectByReport(int reportNo);
	
	int insertReport(Report report);
	
	int updateReport(Report report);
	
	int deleteReport(int reportNo);
}
