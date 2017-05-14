package hu.sjuhasz.jsftraining.backlog.domain;

public class UserStory {

	private String name;
	private TShirtSize size;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public TShirtSize getSize() {
		return size;
	}
	
	public void setSize(TShirtSize size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return String.format("[User story: %s, size: %s]", name, size);
	}
	
}
