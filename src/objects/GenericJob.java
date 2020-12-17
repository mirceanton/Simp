package objects;

public abstract class GenericJob {
	protected double uID = 0;

	protected double getUID() { 
		if (uID == 0) {
			uID = Math.random();
		}
		return uID;
	}
}
