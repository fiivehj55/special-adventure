package pojo.web.exception;

public class UserNotFoundException extends ServiceFailException {
	public UserNotFoundException(int memId) {
		super(memId + "로는 로그인할 수 없습니다.");
	}
}
