package org.scrum.domain.project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Meeting implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//
	private Integer meetingId;
	private String codeName;
	private String indicative;
	private String description;
	
	private Date publishDate;
	
	private Project project;

	private List<Topic> topics = new ArrayList<>();
	
	public Integer getMeetingId() {
		return meetingId;
	}
	public void setMeetingId(Integer meetingId) {
		this.meetingId = meetingId;
	}
	
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	
	public String getIndicative() {
		return indicative;
	}
	public void setIndicative(String indicative) {
		this.indicative = indicative;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public List<Topic> getTopics() {
		return topics;
	}
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	/* constructors*/
	public Meeting() {
		super();
	}
	
	public Meeting(Integer meetingId, String codeName, String indicative,
				   String description, Date publishDate, Project project) {
		super();
		this.meetingId = meetingId;
		this.codeName = codeName;
		this.indicative = indicative;
		this.description = description;
		this.publishDate = publishDate;
		this.project = project;
	}

	public Meeting(Integer meetingId, String indicative, Date publishDate,
				   Project project) {
		super();
		this.meetingId = meetingId;
		this.indicative = indicative;
		this.publishDate = publishDate;
		this.project = project;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((meetingId == null) ? 0 : meetingId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meeting other = (Meeting) obj;
		if (meetingId == null) {
			if (other.meetingId != null)
				return false;
		} else if (!meetingId.equals(other.meetingId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\n\tMeeting [meetingId=" + meetingId + ", codeName=" + codeName
				+ ", indicative=" + indicative + ", topics: " + topics + "]";
	}
	public void addTopic(String topic) {
		this.topics.add(new Topic(null, topic));
	}	
}