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
	private String challangeQue;
	private String challangeAns;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Document [id=" + id + ", code=" + code + ", type=" + type + ", name=" + name + ", description="
				+ description + ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", challangeQue="
				+ challangeQue + ", challangeAns=" + challangeAns + ", metadata=" + metadata + "]";
	}
}
