package ReplaceTypeCodeWithStateStrategy.step1;

public class StateStopped extends State {

	@Override
	public int getTypecode() {
		return Logger.STATE_STOPPED;
	}

}
