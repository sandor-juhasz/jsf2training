package hu.sjuhasz.jsftraining.navigationdemo.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ABean extends NavDemoBean {

	protected String getNextPage() {
		return "b";
	}

}
