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
		String stmt = REPORT_MAP + "selectAllReport";
		return session.selectList(stmt);
	}

	@Override
	public Report selectByReport(SqlSession session, int reportNo) {
		String stmt = REPORT_MAP + "selectByReortNo";
		return session.selectOne(stmt, reportNo);
	}

	@Override
	public int insertReport(SqlSession session, Report report) {
		String stmt = REPORT_MAP + "insertReport";
		return session.update(stmt, report);
	}

	@Override
	public int updateReport(SqlSession session, Report report) {
		String stmt = REPORT_MAP + "updateReport";
		return session.update(stmt, report);
	}

	@Override
	public int deleteReport(SqlSession session, int reportNo) {
		String stmt = REPORT_MAP + "deleteReport";
		return session.update(stmt, reportNo);
	}

}
