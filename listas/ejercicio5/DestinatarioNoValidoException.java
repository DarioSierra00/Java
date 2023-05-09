package com.edu.listas.ejercicio5;

public class DestinatarioNoValidoException extends Exception {

	public DestinatarioNoValidoException() {
	}

	public DestinatarioNoValidoException(String message) {
		super(message);
	}

	public DestinatarioNoValidoException(Throwable cause) {
		super(cause);
	}

	public DestinatarioNoValidoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DestinatarioNoValidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
