/**
 * 
 */
package com.github.ideepakkalra.documentvalidator.core;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Deepak
 *
 */
class ExperienceLetterDocumentTest {
	
	private Document document;
	
	@BeforeEach
	void beforeEach() {
		document = new Document();
		document.setId(1);
		document.setCode("DocumentCode");
		document.setName("DocumentName");
		document.setType(DocumentType.EXPERIENCE_LETTER);
		document.setDescription("DocumentDescription");
		document.setCreatedOn(new Date(1655940094807L));
		document.setCreatedBy("DocumentUser");
		document.setChallengeQue("What is last 4 digit of your SSN?");
		document.setChallengeAns("1234");
	}

	@Test
	void testDocumentProperties() {
		assertEquals(1, document.getId());
		assertEquals("DocumentCode", document.getCode());
		assertEquals("DocumentName", document.getName());
		assertEquals(DocumentType.EXPERIENCE_LETTER, document.getType());
		assertEquals("DocumentDescription", document.getDescription());
		assertEquals(new Date(1655940094807L), document.getCreatedOn());
		assertEquals("DocumentUser", document.getCreatedBy());
		assertEquals("What is last 4 digit of your SSN?", document.getChallengeQue());
		assertEquals("1234", document.getChallengeAns());
	}
}