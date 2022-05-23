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
public class InvalidEmailIdException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4498727064008938965L;
	String message;
}
