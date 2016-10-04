package pojo.web.exception;

public class DuplicateIdException extends ServiceFailException{
	public DuplicateIdException(int regionId){
		super(regionId+"는 이미 사용중입니다.");
	}

}
