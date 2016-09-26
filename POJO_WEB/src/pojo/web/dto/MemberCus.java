package pojo.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberCus {
	private Integer memId;
	private String memName;
	private Integer memPhone;
	private Integer memPass;
	private Integer cusId;
	private String cusEmail;
	private String cusGender;
	private String cusImg;
	private String cusIntro;
}
