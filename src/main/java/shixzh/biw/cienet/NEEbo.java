package shixzh.biw.cienet;

import java.util.Date;

public class NEEbo {

	private String name;
	private Date date = new Date();

	public NEEbo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
