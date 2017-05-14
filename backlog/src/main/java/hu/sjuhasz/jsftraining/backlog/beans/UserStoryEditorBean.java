package hu.sjuhasz.jsftraining.backlog.beans;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import hu.sjuhasz.jsftraining.backlog.domain.TShirtSize;

@ManagedBean
@ApplicationScoped
public class UserStoryEditorBean {

	public Map<String, TShirtSize> getSizes() {
		LinkedHashMap<String, TShirtSize> sizes = new LinkedHashMap<>();
		for (TShirtSize size: TShirtSize.values()) {
			sizes.put(size.toString(), size);
		}
		return sizes;		
	}
	
}
