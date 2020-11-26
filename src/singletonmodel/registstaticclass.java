package singletonmodel;

public class registstaticclass {
	private static class SingletonHolder {
		private static final registstaticclass INSTANCE = new registstaticclass();
	}

	private registstaticclass() {
	}

	public static final registstaticclass getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
