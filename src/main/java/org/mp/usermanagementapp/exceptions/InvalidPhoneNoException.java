package org.mp.usermanagementapp.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InvalidPhoneNoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8731508592205839381L;
	String message;
}
