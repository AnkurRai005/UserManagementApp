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
public class MinimumAgeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8205997374083059340L;
	String message;
}
