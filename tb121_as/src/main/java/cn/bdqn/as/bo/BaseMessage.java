package cn.bdqn.as.bo;
/**
 * ��Ϣ�� ���� ajax ����
 * @author auh
 *
 */
public class BaseMessage {
	private Integer code;
	private String message;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public BaseMessage(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public BaseMessage() {
		super();
	}
	
	//С����
	public static BaseMessage getBaseMessage(Integer code,String message){
		
		return  new BaseMessage(code, message);
	}
}
