/**
 * 
 */
package com.github.ideepakkalra.documentvalidator.core;

import java.util.Date;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Deepak
 *
 */
@Entity
@Table (name = "document")
public class Document {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String code;
	private DocumentType type;
	private String name;
	private String description;
	private Date createdOn;
	private String createdBy;
	private String challengeQue;
	private String challengeAns;
	@ElementCollection
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
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
	 * @return the challengeQue
	 */
	public String getChallengeQue() {
		return challengeQue;
	}
	/**
	 * @param challengeQue the challengeQue to set
	 */
	public void setChallengeQue(String challengeQue) {
		this.challengeQue = challengeQue;
	}
	/**
	 * @return the challengeAns
	 */
	public String getChallengeAns() {
		return challengeAns;
	}
	/**
	 * @param challengeAns the challengeAns to set
	 */
	public void setChallengeAns(String challengeAns) {
		this.challengeAns = challengeAns;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Document [id=" + id + ", code=" + code + ", type=" + type + ", name=" + name + ", description="
				+ description + ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", challengeQue="
				+ challengeQue + ", challengeAns=" + challengeAns + ", metadata=" + metadata + "]";
	}
}
