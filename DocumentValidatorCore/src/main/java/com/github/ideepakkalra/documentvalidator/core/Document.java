/**
 * 
 */
package com.github.ideepakkalra.documentvalidator.core;

import java.util.Date;
import java.util.Map;

/**
 * @author Deepak
 *
 */
public class Document {
	private Integer id;
	private String key;
	private DocumentType type;
	private String name;
	private String description;
	private Date createdOn;
	private String createdBy;
	private String challangeQue;
	private String challangeAns;
	private Map<String, String> metadata;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the type
	 */
	public DocumentType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(DocumentType type) {
		this.type = type;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}
	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the challangeQue
	 */
	public String getChallangeQue() {
		return challangeQue;
	}
	/**
	 * @param challangeQue the challangeQue to set
	 */
	public void setChallangeQue(String challangeQue) {
		this.challangeQue = challangeQue;
	}
	/**
	 * @return the challangeAns
	 */
	public String getChallangeAns() {
		return challangeAns;
	}
	/**
	 * @param challangeAns the challangeAns to set
	 */
	public void setChallangeAns(String challangeAns) {
		this.challangeAns = challangeAns;
	}
	/**
	 * @return the metadata
	 */
	public Map<String, String> getMetadata() {
		return metadata;
	}
	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}
}
