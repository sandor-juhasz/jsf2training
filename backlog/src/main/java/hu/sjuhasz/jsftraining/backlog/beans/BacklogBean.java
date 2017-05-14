package hu.sjuhasz.jsftraining.backlog.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import hu.sjuhasz.jsftraining.backlog.domain.UserStory;

@ManagedBean
@RequestScoped
public class BacklogBean {

	private UserStory userStory = new UserStory();
	
	@ManagedProperty(value="#{sessionBean}")
	private SessionBean sessionBean;
	
	public String add() {
		sessionBean.add(userStory);
		userStory = new UserStory();
		return null;
	}
	
	public UserStory getUserStory() {
		return userStory;
	}

	public void setUserStory(UserStory userStory) {
		this.userStory = userStory;
	}
	
	public List<UserStory> getUserStories() {
		return sessionBean.getUserStories();
	}

	public SessionBean getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}
		
}
