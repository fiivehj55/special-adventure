package pojo.web.dto;

import java.io.Serializable;

/**
 * REGISTER_DETAIL 모델 클래스.
 * 
 * @author generated by ERMaster 
 * @version $Id$
 */
public class RegisterDetail implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** REGIST_ID. */
	private String registId;

	/**
	 * 생성자.
	 */
	public RegisterDetail() {
	}

	/**
	 * REGIST_ID을 설정합니다..
	 * 
	 * @param registId
	 *            REGIST_ID
	 */
	public void setRegistId(String registId) {
		this.registId = registId;
	}

	/**
	 * REGIST_ID을 가져옵니다..
	 * 
	 * @return REGIST_ID
	 */
	public String getRegistId() {
		return this.registId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((registId == null) ? 0 : registId.hashCode());
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
		RegisterDetail other = (RegisterDetail) obj;
		if (registId == null) {
			if (other.registId != null) {
				return false;
			}
		} else if (!registId.equals(other.registId)) {
			return false;
		}
		return true;
	}
<<<<<<< HEAD
	
	@Override
	public String toString() {
		return "RegisterDetail [registId=" + registId + "]";
	}
=======
>>>>>>> branch 'master' of https://github.com/fiivehj55/special-adventure.git

}
