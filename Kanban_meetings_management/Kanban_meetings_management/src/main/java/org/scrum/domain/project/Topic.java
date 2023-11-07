package org.scrum.domain.project;

import java.io.Serializable;


public class Topic implements Comparable<Topic>, Serializable{
	private static final long serialVersionUID = 1L;
	
	//
	protected Integer topicID;
	private String name;
	private String description;

	public Integer getTopicID() {
		return topicID;
	}
	public void setTopicID(Integer topicID) {
		this.topicID = topicID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Topic() {
		super();
	}
	
	public Topic(Integer topicID, String name, String description) {
		super();
		this.topicID = topicID;
		this.name = name;
		this.description = description;
	}


	@Override
	public int compareTo(Topic other) {
		if (this.equals(other))
			return 0;
		return this.getName().compareTo(other.getName());
	}
	public Topic(Integer topicID, String name) {
		super();
		this.topicID = topicID;
		this.name = name;
	}
	@Override
	public String toString() {
		return "\n\t\tTopic [topicID=" + topicID + ", name=" + name
				+ ", description=" + description + "]";
	}	
}