package com.github.ideepakkalra.documentvalidator.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import org.junit.jupiter.api.Test;

class DocumentQRTest {

	@Test
	void testDocumentQRPathForOfferLetter() {
		Document document = new Document();
		document.setId(1);
		document.setCode("DocumentKey");
		document.setName("DocumentName");
		document.setType(DocumentType.OFFER_LETTER);
		document.setDescription("DocumentDescription");
		document.setCreatedOn(new Date(1655940094807L));
		document.setCreatedBy("DocumentUser");
		document.setChallengeQue("What is last 4 digit of your SSN?");
		document.setChallengeAns("1234");
		
		try {
			Path expectedPath = Paths.get(System.getProperty("user.home") + File.separator + 
				document.getType().getShortCode() + "-" + document.getId() + DocumentQR.PNG_EXTENSION);
			DocumentQR documentQR = new DocumentQR(document);
			assertEquals(expectedPath, documentQR.getPath());
			try {
				Files.delete(expectedPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (DocumentValidationException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testDocumentQRPathForExperienceLetter() {
		Document document = new Document();
		document.setId(1);
		document.setCode("DocumentKey");
		document.setName("DocumentName");
		document.setType(DocumentType.EXPERIENCE_LETTER);
		document.setDescription("DocumentDescription");
		document.setCreatedOn(new Date(1655940094807L));
		document.setCreatedBy("DocumentUser");
		document.setChallengeQue("What is last 4 digit of your SSN?");
		document.setChallengeAns("1234");

		try {
			Path expectedPath = Paths.get(System.getProperty("user.home") + File.separator +
					document.getType().getShortCode() + "-" + document.getId() + DocumentQR.PNG_EXTENSION);
			DocumentQR documentQR = new DocumentQR(document);
			assertEquals(expectedPath, documentQR.getPath());
			try {
				Files.delete(expectedPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (DocumentValidationException e) {
			e.printStackTrace();
		}
	}
}