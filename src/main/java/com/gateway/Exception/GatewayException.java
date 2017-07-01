package com.gateway.Exception;


public class GatewayException extends Exception {

    private static final long serialVersionUID = -7913153372904574437L;

	private int errorCode;

	public GatewayException(String message) {
		super(message);
	}

	public GatewayException(Throwable cause) {
		super(cause);
	}


	public GatewayException(int errorCode, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

    public GatewayException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

	public GatewayException(String message, Throwable cause) {
		super(message, cause);
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
}
