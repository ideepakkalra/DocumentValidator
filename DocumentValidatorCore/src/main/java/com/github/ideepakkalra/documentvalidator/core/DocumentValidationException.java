/**
 * 
 */
package com.github.ideepakkalra.documentvalidator.core;

/**
 * @author Deepak
 *
 */
public class DocumentValidationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DocumentValidationException(String errorMessage) {
		super(errorMessage);
	}
}
