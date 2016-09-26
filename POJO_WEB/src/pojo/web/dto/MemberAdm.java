package pojo.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberAdm {
	private Integer memId;
	private String memName;
	private Integer memPhone;
	private Integer memPass;
	private Integer adminId;
	private String adminGrade;
}
