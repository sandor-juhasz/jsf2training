package hu.sjuhasz.jsftraining.navigationdemo.beans;

public abstract class NavDemoBean {

	public String navigate() {
		if (Math.random() >= 0.5)
			return getNextPage()+"?faces-redirect=true";
		else
			return "fail?faces-redirect=true";
	}
	
	protected abstract String getNextPage();
	
}
