package pojo.web.dto;
import java.io.Serializable;
import java.sql.Blob;

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
	private Integer cusId;

	/** CUS_EMAIL. */
	private String cusEmail;

	/** CUS_GENDER. */
	private String cusGender;

	/** CUS_IMG. */
	private Blob cusImg;

	/** CUS_INTRO. */
	private String cusIntro;

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
	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}

	/**
	 * CUS_ID을 가져옵니다..
	 * 
	 * @return CUS_ID
	 */
	public Integer getCusId() {
		return this.cusId;
	}

	/**
	 * CUS_EMAIL을 설정합니다..
	 * 
	 * @param cusEmail
	 *            CUS_EMAIL
	 */
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}

	/**
	 * CUS_EMAIL을 가져옵니다..
	 * 
	 * @return CUS_EMAIL
	 */
	public String getCusEmail() {
		return this.cusEmail;
	}

	/**
	 * CUS_GENDER을 설정합니다..
	 * 
	 * @param cusGender
	 *            CUS_GENDER
	 */
	public void setCusGender(String cusGender) {
		this.cusGender = cusGender;
	}

	/**
	 * CUS_GENDER을 가져옵니다..
	 * 
	 * @return CUS_GENDER
	 */
	public String getCusGender() {
		return this.cusGender;
	}

	/**
	 * CUS_IMG을 설정합니다..
	 * 
	 * @param cusImg
	 *            CUS_IMG
	 */
	public void setCusImg(Blob cusImg) {
		this.cusImg = cusImg;
	}

	/**
	 * CUS_IMG을 가져옵니다..
	 * 
	 * @return CUS_IMG
	 */
	public Blob getCusImg() {
		return this.cusImg;
	}

	/**
	 * CUS_INTRO을 설정합니다..
	 * 
	 * @param cusIntro
	 *            CUS_INTRO
	 */
	public void setCusIntro(String cusIntro) {
		this.cusIntro = cusIntro;
	}

	/**
	 * CUS_INTRO을 가져옵니다..
	 * 
	 * @return CUS_INTRO
	 */
	public String getCusIntro() {
		return this.cusIntro;
	}


}
