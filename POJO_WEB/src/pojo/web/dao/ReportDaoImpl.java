package pojo.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.web.dto.Report;

public class ReportDaoImpl implements ReportDao {
	
	static Logger logger = LoggerFactory.getLogger(ReportDaoImpl.class);

	private ReportDaoImpl() {
	}

	private static ReportDaoImpl instance = new ReportDaoImpl();

	public static ReportDaoImpl getInstance() {
		return instance;
	}
	
	private final String REPORT_MAP = "pojo.web.dao.ReportMapper.";

	@Override
	public List<Report> selectAllReport(SqlSession session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Report selectByReport(SqlSession session, int reportNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertReport(SqlSession session, Report report) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateReport(SqlSession session, Report report) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteReport(SqlSession session, int reportNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
