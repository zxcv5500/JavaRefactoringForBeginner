package ReplaceTypeCodeWithStateStrategy.enum3;

public class Logger {
//	public enum State {		
	private enum State {	// #1 enum을 내부 클래스로 선언하고 private로 접근성 수정함
//		STATE_STOPPED {
		STOPPED {		// #2 단어를 단축한다.

			@Override
			public void start() {
				System.out.println("** START LOGGING **");			
			}

			@Override
			public void stop() {
				/* 아무것도 하지 않음 */			
			}

			@Override
			public void log(String info) {
				System.out.println("Ignoring: " + info);			
			}
			
		},
//		STATE_LOGGING {
		LOGGING {		// #2 단어를 단축한다.
			@Override
			public void start() {
				/* 아무것도 하지 않음 */			
			}

			@Override
			public void stop() {
				System.out.println("** STOP LOGGING **");			
			}

			@Override
			public void log(String info) {
				System.out.println("Logging : " + info);			
			}
		};
		
		public abstract void start();
		public abstract void stop();
		public abstract void log(String info);
		
	}
	

    private State _state;
    public Logger() {
//        setState(STATE_STOPPED);			// #1 enum을 사용하도록 접근 메소드를 수정한다.
        setState(State.STOPPED);
    }
    
    /* #1 enum을 사용하도록 접근 메소드를 수정한다.
    public int getState() {
        return _state.getTypeCode();
    }
    //*/
    
    // #1 enum을 사용하도록 접근 메소드를 수정한다.
    public State getState() {
    	return _state;
    }
    

    public void setState(State state) {
        _state = state;
    }
    
    
    public void start() {
        _state.start();
        setState(State.LOGGING);
    }
    
    
    public void stop() {
    	_state.stop();
    	setState(State.STOPPED);
    }
    
    
    public void log(String info) {
        _state.log(info);
    }
}
