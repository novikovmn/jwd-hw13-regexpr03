package by.epam.hw13.regexpr03.controller.dto;

public class Response {

	private ResponseStatus responseStatus;

	public Response(ResponseStatus responseStatus) {
		super();
		this.responseStatus = responseStatus;
	}

	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

	@Override
	public String toString() {
		return "Response [responseStatus=" + responseStatus + "]";
	}

}
