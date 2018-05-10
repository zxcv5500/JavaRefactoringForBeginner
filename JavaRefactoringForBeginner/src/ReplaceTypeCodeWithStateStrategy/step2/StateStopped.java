package ReplaceTypeCodeWithStateStrategy.step2;

public class StateStopped extends State {

	@Override
	public int getTypecode() {
		return Logger.STATE_STOPPED;
	}

}
