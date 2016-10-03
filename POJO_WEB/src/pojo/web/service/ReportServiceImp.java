package pojo.web.service;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.javassist.bytecode.DuplicateMemberException;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.web.dao.ReportDao;
import pojo.web.dao.ReportDaoImpl;
import pojo.web.dto.Report;
import pojo.web.exception.Exception;
import pojo.web.util.DBUtil;

public class ReportServiceImp implements ReportService {
	
	static Logger logger = LoggerFactory.getLogger(ReportServiceImp.class);

	private ReportServiceImp() {
	}

	private static ReportServiceImp instance = new ReportServiceImp();

	public static ReportServiceImp getInstance() {
		return instance;
	}
	
	ReportDao dao = ReportDaoImpl.getInstance();

	@Override
	public List<Report> selectAllReport() {
		List<Report> report = null;
		try (SqlSession session = DBUtil.getInstance().getSession()) {
			report = dao.selectAllReport(session);
		}
		return report;
	}

	@Override
	public Report selectByReportNo(int reportNo) {
		try (SqlSession session = DBUtil.getInstance().getSession()) {
			Report report = dao.selectByReport(session, reportNo);
			if(report != null){
				return report;
			}else{
				throw new NumberFormatException();
			}
		}
	}

	@Override
	public int insertReport(Report report) {
		int result = 0;
		try (SqlSession session = DBUtil.getInstance().getSession()) {
			result = dao.insertReport(session, report);
			if(result == 1){
				session.commit();
			}
		}
		return result;
	}

	@Override
	public int updateReport(Report report) {
		int result = 0;
		try (SqlSession session = DBUtil.getInstance().getSession()) {
			result = dao.updateReport(session, report);
			if(result == 1){
				session.commit();
			}
		}
		return result;
	}

	@Override
	public int deleteReport(int reportNo) {
		int result = 0;
		try (SqlSession session = DBUtil.getInstance().getSession()) {
			result = dao.deleteReport(session, reportNo);
			if(result == 1){
				session.commit();
			}
		}		
		return result;
	}
	
}
