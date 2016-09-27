package pojo.web.dto;
import java.io.Serializable;

/**
 * ADMIN_DETAIL 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class AdminDetail implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ADMIN_ID. */
	private Integer adminId;

	/** ADMIN_GRADE. */
	private String adminGrade;
	
	/** MEMBER */
	private Member member;

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	/**
	 * 생성자.
	 */
	public AdminDetail() {
	}

	/**
	 * ADMIN_ID을 설정합니다..
	 * 
	 * @param adminId
	 *            ADMIN_ID
	 */
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	/**
	 * ADMIN_ID을 가져옵니다..
	 * 
	 * @return ADMIN_ID
	 */
	public Integer getAdminId() {
		return this.adminId;
	}

	/**
	 * ADMIN_GRADE을 설정합니다..
	 * 
	 * @param adminGrade
	 *            ADMIN_GRADE
	 */
	public void setAdminGrade(String adminGrade) {
		this.adminGrade = adminGrade;
	}

	/**
	 * ADMIN_GRADE을 가져옵니다..
	 * 
	 * @return ADMIN_GRADE
	 */
	public String getAdminGrade() {
		return this.adminGrade;
	}


}
