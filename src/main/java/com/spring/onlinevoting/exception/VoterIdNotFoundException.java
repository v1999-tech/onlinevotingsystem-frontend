package com.spring.onlinevoting.exception;

public class VoterIdNotFoundException extends RuntimeException {
	public VoterIdNotFoundException(String message) {
		super(message);
	}


}
