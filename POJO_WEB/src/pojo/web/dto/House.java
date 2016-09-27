package pojo.web.dto;
import java.io.Serializable;
import java.util.Set;

/**
 * HOUSE 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class House implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** HOUSE_NO. */
	private Integer houseNo;

	/** HOUSE_NAME. */
	private String houseName;

	/** HOUSE_ADDR. */
	private String houseAddr;

	/** HOUSE_PRICE. */
	private Integer housePrice;

	/** HOUSE_SCORE. */
	private Integer houseScore;

	/** HOUSE_INFO. */
	private String houseInfo;
	
	/** REGISTER_DETAIL */
	private RegisterDetail registerDetail;
	
	private Set<RegisterDetail> registerDetailSet;
	
	public RegisterDetail getRegisterDetail() {
		return registerDetail;
	}

	public void setRegisterDetail(RegisterDetail registerDetail) {
		this.registerDetail = registerDetail;
	}

	public Set<RegisterDetail> getRegisterDetailSet() {
		return registerDetailSet;
	}

	public void setRegisterDetailSet(Set<RegisterDetail> registerDetailSet) {
		this.registerDetailSet = registerDetailSet;
	}

	/**
	 * 생성자.
	 */
	public House() {
	}

	/**
	 * HOUSE_NO을 설정합니다..
	 * 
	 * @param houseNo
	 *            HOUSE_NO
	 */
	public void setHouseNo(Integer houseNo) {
		this.houseNo = houseNo;
	}

	/**
	 * HOUSE_NO을 가져옵니다..
	 * 
	 * @return HOUSE_NO
	 */
	public Integer getHouseNo() {
		return this.houseNo;
	}

	/**
	 * HOUSE_NAME을 설정합니다..
	 * 
	 * @param houseName
	 *            HOUSE_NAME
	 */
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	/**
	 * HOUSE_NAME을 가져옵니다..
	 * 
	 * @return HOUSE_NAME
	 */
	public String getHouseName() {
		return this.houseName;
	}

	/**
	 * HOUSE_ADDR을 설정합니다..
	 * 
	 * @param houseAddr
	 *            HOUSE_ADDR
	 */
	public void setHouseAddr(String houseAddr) {
		this.houseAddr = houseAddr;
	}

	/**
	 * HOUSE_ADDR을 가져옵니다..
	 * 
	 * @return HOUSE_ADDR
	 */
	public String getHouseAddr() {
		return this.houseAddr;
	}

	/**
	 * HOUSE_PRICE을 설정합니다..
	 * 
	 * @param housePrice
	 *            HOUSE_PRICE
	 */
	public void setHousePrice(Integer housePrice) {
		this.housePrice = housePrice;
	}

	/**
	 * HOUSE_PRICE을 가져옵니다..
	 * 
	 * @return HOUSE_PRICE
	 */
	public Integer getHousePrice() {
		return this.housePrice;
	}

	/**
	 * HOUSE_SCORE을 설정합니다..
	 * 
	 * @param houseScore
	 *            HOUSE_SCORE
	 */
	public void setHouseScore(Integer houseScore) {
		this.houseScore = houseScore;
	}

	/**
	 * HOUSE_SCORE을 가져옵니다..
	 * 
	 * @return HOUSE_SCORE
	 */
	public Integer getHouseScore() {
		return this.houseScore;
	}

	/**
	 * HOUSE_INFO을 설정합니다..
	 * 
	 * @param houseInfo
	 *            HOUSE_INFO
	 */
	public void setHouseInfo(String houseInfo) {
		this.houseInfo = houseInfo;
	}

	/**
	 * HOUSE_INFO을 가져옵니다..
	 * 
	 * @return HOUSE_INFO
	 */
	public String getHouseInfo() {
		return this.houseInfo;
	}


}
