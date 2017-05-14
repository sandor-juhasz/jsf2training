package hu.sjuhasz.jsftraining.navigationdemo.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BBean extends NavDemoBean {

	protected String getNextPage() {
		return "c";
	}
	
}
