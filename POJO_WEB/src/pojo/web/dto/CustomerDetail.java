package pojo.web.dto;

import java.io.Serializable;
import java.util.Set;

/**
 * CUSTOMER_DETAIL 모델 클래스.
 * 
 * @author generated by ERMaster 
 * @version $Id$
 */
public class CustomerDetail implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** CUS_ID. */
	private String cusId;
	
	/** QUESTION */
	private Question question;
	
	private Set<Question> questionSet;
	
	/** REPORT */
	private Report report;
	
	private Set<Report> reportSet;
	
	/** REGIST_HOUSE */
	private RegistHouse registHouse;
	
	public RegistHouse getRegistHouse() {
		return registHouse;
	}

	public void setRegistHouse(RegistHouse registHouse) {
		this.registHouse = registHouse;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Set<Question> getQuestionSet() {
		return questionSet;
	}

	public void setQuestionSet(Set<Question> questionSet) {
		this.questionSet = questionSet;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public Set<Report> getReportSet() {
		return reportSet;
	}

	public void setReportSet(Set<Report> reportSet) {
		this.reportSet = reportSet;
	}

	/**
	 * 생성자.
	 */
	public CustomerDetail() {
	}

	/**
	 * CUS_ID을 설정합니다..
	 * 
	 * @param cusId
	 *            CUS_ID
	 */
	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	/**
	 * CUS_ID을 가져옵니다..
	 * 
	 * @return CUS_ID
	 */
	public String getCusId() {
		return this.cusId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cusId == null) ? 0 : cusId.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CustomerDetail other = (CustomerDetail) obj;
		if (cusId == null) {
			if (other.cusId != null) {
				return false;
			}
		} else if (!cusId.equals(other.cusId)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "CustomerDetail [cusId=" + cusId + ", question=" + question + ", questionSet=" + questionSet
				+ ", report=" + report + ", reportSet=" + reportSet + ", registHouse=" + registHouse + "]";
	}

}
