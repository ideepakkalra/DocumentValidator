/**
 * 
 */
package com.github.ideepakkalra.documentvalidator.core;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import net.glxn.qrgen.core.scheme.Url;
import net.glxn.qrgen.javase.QRCode;

/**
 * @author Deepak
 *
 */
public class DocumentQR {

	public static final String PNG_EXTENSION = ".png";
	
	private Path path;
		
	public DocumentQR(Document document) throws DocumentValidationException {
		if(document==null)
			throw new DocumentValidationException("Document is null.");
		
		if(document.getId()==null || document.getId()<=0)
			throw new DocumentValidationException("Invalid document id.");
		
		if(document.getCode()==null || document.getCode().isEmpty())
			document.setCode(document.getId() +"-" + document.getType());
		//TODO: Change this to random alphanumeric value
		
		if(document.getChallangeQue()==null || document.getChallangeQue().isEmpty())
			throw new DocumentValidationException("Invalid challange question.");
		
		if(document.getChallangeAns()==null || document.getChallangeAns().isEmpty())
			throw new DocumentValidationException("Invalid challange answer.");
		
		path = Paths.get(System.getProperty("dv.qr.dir", System.getProperty("user.home")) + File.separator + 
				document.getType().getShortCode() + "-" + document.getId() + PNG_EXTENSION);
		
		if(!Files.exists(path)) {
			try {
				QRCode.from(Url.parse(System.getProperty("dv.base.url", "http://www.deepakkalra.co.in/") + document.getId() + "/" + document.getCode()))
				.writeTo(new BufferedOutputStream(new FileOutputStream(path.toString())));
			} catch (FileNotFoundException e) {
				throw new DocumentValidationException(e.getMessage());
			}
		}
	}
	
	/**
	 * @return the path
	 */
	public Path getPath() {
		return path;
	}
	
	public InputStream getStream() {
		return null;
	}
	
	public byte[] getBytes() {
		return null;
	}
}
