package kosta.mvc.session;

import java.util.HashMap;
import java.util.Map;

import kosta.mvc.model.dto.Goods;
/**
 * 사용자 객체
 * */
public class Session {
	private String sessionId;
	private Map<String,Object> attributes; //장바구니
	
	
	public Session() {}
	public Session(String sessionId) {
		this.sessionId = sessionId;
		attributes = new HashMap<>();
	}
	public String getSessionId() {
		return sessionId;
	}
	
	//추가
	public void setAttribute(String name, Object value) {
		attributes.put(name,value);
	}
	
	//조회
	public Object getAttribute(String name) {//cart
		return attributes.get(name);
	}
	
	//제거
	public void removeAttribute(String name) {
		attributes.remove(name);
	}
	
	
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	public Map<String, Object> getAttributes() {
		return attributes;
	}
	
	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}
	
	
	@Override
	public String toString() {
		return "Session [sessionId=" + sessionId + ", attributes=" + attributes + "]"+"\n";
	}
	
	
	@Override
	public int hashCode() {
		return sessionId.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Session other = (Session) obj;
		if(sessionId.equals(other.sessionId)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((sessionId == null) ? 0 : sessionId.hashCode());
//		return result;
//	}
//	
	/**
	 * 같은 객체라는 뜻은 HashCode가 같아야 하고 ,
	 *  equlas의 결과가 true여야 한다.
	 *  
	 *  	hash코드가 다르면 무조건 다른 객체
	 *  	hash코드가 같으면 같은 객체일 수도, 다른 객체일 수도 있다.
	 * */
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Session other = (Session) obj;
//		if (sessionId == null) {
//			if (other.sessionId != null)
//				return false;
//		} else if (!sessionId.equals(other.sessionId))
//			return false;
//		return true;
//	}
	
	
	
	
	
}
