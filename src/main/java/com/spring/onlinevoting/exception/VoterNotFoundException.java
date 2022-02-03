package com.spring.onlinevoting.exception;

public class VoterNotFoundException extends RuntimeException {
	public VoterNotFoundException(String message) {
		super(message);
	}

}
