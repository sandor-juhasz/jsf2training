package hu.sjuhasz.jsftraining.copymyname.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CopyBean {

	private String name;
	
	private String copyText;

	public String submit() {
		copyText = String.format("You have submitted: %s.", name);
		name = "";
		
		return "";
	}
	
	public boolean isCopyTextRendered() {
		return copyText != null && !copyText.equals("");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCopyText() {
		return copyText;
	}

	public void setCopyText(String copyText) {
		this.copyText = copyText;
	}

}
