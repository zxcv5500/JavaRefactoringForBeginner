package ReplaceTypeCodeWithStateStrategy.step1;

public class Logger {
	
	public static final int STATE_STOPPED = 0;
	public static final int STATE_LOGGING = 1;
	private int _state;
	
	public Logger() {
//		_state = STATE_STOPPED;		
		setState(STATE_STOPPED);		//#2 자기 캡슐화 필드 기법 적용
	}
	
	//* #1 getter , setter 메서드 작성해서 자기 캡슐화 필드 기법 준비
	public int getState() {
		return _state;
	}
	
	public void setState(int state) {
		_state = state;
	}
	
	
	//*/
	public void start() {
//		switch (_state) {
		switch (getState()) {			//#2 자기 캡슐화 필드 기법 적용 
		case STATE_STOPPED:
			System.out.println("** START LOGGING **");
//			_state = STATE_LOGGING;
			setState(STATE_LOGGING);	//#2 자기 캡슐화 필드 기법 적용
			break;
		case STATE_LOGGING:
			/* 아무것도 하지 않음 */
			break;
		default:
				System.out.println("Invalid state : " + _state);
		}
	}
	
	public void stop() {
		switch (getState()) {			//#2 자기 캡슐화 필드 기법 적용
		case STATE_STOPPED:
			
			/* 아무것도 하지 않음 */
			break;
		case STATE_LOGGING:
			System.out.println("** STOPLOGGING **");
//			_state = STATE_STOPPED;
			setState(STATE_STOPPED);	//#2 자기 캡슐화 필드 기법 적용
			break;
			default:
//				System.out.println("Invalid state : " + _state);
				System.out.println("Invalid state : " + getState());		//#2 자기 캡슐화 필드 기법 적용
		}
	}
	
	public void log(String info) {
//		switch (_state) {
		switch (getState()) {				//#2 자기 캡슐화 필드 기법 적용
		case STATE_STOPPED:
			System.out.println("Ignoring: " + info);
			break;
		case STATE_LOGGING:
			System.out.println("Logging: " + info);
			break;
		default:
//			System.out.println("Invalid state : " + _state);
			System.out.println("Invalid state : " + getState());		//#2 자기 캡슐화 필드 기법 적용
		}
	}
	
}
