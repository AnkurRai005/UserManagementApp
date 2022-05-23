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
public class UserNotAvailableException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8123976387776162293L;
	String message;
}
