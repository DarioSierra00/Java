package com.edu.listas.ejercicio5;

public class MensajeException extends Exception {

	public MensajeException() {
	}

	public MensajeException(String message) {
		super(message);
	}

	public MensajeException(Throwable cause) {
		super(cause);
	}

	public MensajeException(String message, Throwable cause) {
		super(message, cause);
	}

	public MensajeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
