/**
 * 
 */
package com.github.ideepakkalra.documentvalidator.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.ideepakkalra.documentvalidator.core.Document;
import com.github.ideepakkalra.documentvalidator.core.DocumentType;
import com.github.ideepakkalra.documentvalidator.web.db.DocumentValidatorRepository;

/**
 * @author Deepak
 *
 */
@Controller
public class DocumentValidatorWebController {
	
	@Autowired
	DocumentValidatorRepository documentValidatorRepository;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView index() {
		Document document = new Document();
		document.setCode("DocumentCode");
		document.setName("DocumentName");
		document.setType(DocumentType.EXPERIENCE_LETTER);
		document.setDescription("DocumentDescription");
		document.setCreatedOn(new Date(1655940094807L));
		document.setCreatedBy("DocumentUser");
		document.setChallengeQue("What is last 4 digit of your SSN?");
		document.setChallengeAns("1234");
		documentValidatorRepository.save(document);
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/ValidateQR/{id}/{key}", method = RequestMethod.GET)
	public ModelAndView validateIdAndKey(ModelMap model, @PathVariable String id, @PathVariable String key) {
		Document document = documentValidatorRepository.findById(Integer.parseInt(id)).get();
		if (document.getCode().equals(key)) {
			model.addAttribute("challengeQuestion", document.getChallengeQue());
			model.addAttribute("errorMessage", "Invalid key. Please check inputs.");
		}
		return new ModelAndView("challenge");
	}
}
