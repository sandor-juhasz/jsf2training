package hu.sjuhasz.jsftraining.backlog.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import hu.sjuhasz.jsftraining.backlog.domain.UserStory;

@ManagedBean
@SessionScoped
public class SessionBean {

	private List<UserStory> userStories = new ArrayList<>();

	public List<UserStory> getUserStories() {
		return userStories;
	}

	public void add(UserStory story) {
		userStories.add(story);
	}
}
