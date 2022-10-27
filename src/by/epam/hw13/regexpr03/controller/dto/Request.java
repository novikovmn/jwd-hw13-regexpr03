package by.epam.hw13.regexpr03.controller.dto;

import by.epam.hw13.regexpr03.bean.User;

public class Request {

	private String requestType;
	private User user;

	public Request(String requestType, User user) {
		super();
		this.requestType = requestType;
		this.user = user;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
