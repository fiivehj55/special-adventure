package pojo.web.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * REGIST_HOUSE 모델 클래스.
 * 
 * @author generated by ERMaster 
 * @version $Id$
 */
public class RegistHouse implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** RH_ID. */
	private Integer rhId;

	/** CHECK_IN. */
	private Date checkIn;

	/** CHECK_OUT. */
	private Date checkOut;
	
	/** HOUSE */
	private House house;

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	/**
	 * 생성자.
	 */
	public RegistHouse() {
	}
	
	public RegistHouse(Integer rhId, Date checkIn, Date checkOut) {
		super();
		this.rhId = rhId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	/**
	 * RH_ID을 설정합니다..
	 * 
	 * @param rhId
	 *            RH_ID
	 */
	public void setRhId(Integer rhId) {
		this.rhId = rhId;
	}

	/**
	 * RH_ID을 가져옵니다..
	 * 
	 * @return RH_ID
	 */
	public Integer getRhId() {
		return this.rhId;
	}

	/**
	 * CHECK_IN을 설정합니다..
	 * 
	 * @param checkIn
	 *            CHECK_IN
	 */
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	/**
	 * CHECK_IN을 가져옵니다..
	 * 
	 * @return CHECK_IN
	 */
	public Date getCheckIn() {
		return this.checkIn;
	}

	/**
	 * CHECK_OUT을 설정합니다..
	 * 
	 * @param checkOut
	 *            CHECK_OUT
	 */
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	/**
	 * CHECK_OUT을 가져옵니다..
	 * 
	 * @return CHECK_OUT
	 */
	public Date getCheckOut() {
		return this.checkOut;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rhId == null) ? 0 : rhId.hashCode());
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
		RegistHouse other = (RegistHouse) obj;
		if (rhId == null) {
			if (other.rhId != null) {
				return false;
			}
		} else if (!rhId.equals(other.rhId)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "RegistHouse [rhId=" + rhId + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", house=" + house
				+ "]";
	}

}
