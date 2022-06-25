/**
 * 
 */
package com.github.ideepakkalra.documentvalidator.core;

/**
 * @author Deepak
 *
 */
public enum DocumentType {
	OFFER_LETTER("OL"), EXPERIENCE_LETTER("EL");
	
	private DocumentType(String shortCode) {
		this.shortCode = shortCode;
	}
	
	/**
	 * @return the shortCode
	 */
	public String getShortCode() {
		return shortCode;
	}

	private String shortCode;
}
