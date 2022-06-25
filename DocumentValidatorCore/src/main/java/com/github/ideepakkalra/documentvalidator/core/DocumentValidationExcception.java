/**
 * 
 */
package com.github.ideepakkalra.documentvalidator.core;

/**
 * @author Deepak
 *
 */
public class DocumentValidationExcception extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DocumentValidationExcception() {
		super("Document validation failed.");
	}
	
	public DocumentValidationExcception(String errorMessage) {
		super(errorMessage);
	}
}
