package com.mkyong.web.exception;

public class CustomGenericException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String errCode;
	private String errMsg;

	public CustomGenericException(String errCode, String msg) {
		this.setErrCode(errCode);
		this.setErrMsg(msg);
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
