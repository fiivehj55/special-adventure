package pojo.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberReg {
	private Integer memId;
	private String memName;
	private Integer memPhone;
	private Integer memPass;
	private Integer registId;
	private String registEmail;
	private String registGender;
	private String registImg;
	private String registIntro;
}
