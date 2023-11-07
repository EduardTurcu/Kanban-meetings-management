package org.scrum.domain.project;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.scrum.domain.project.Topic;
import org.scrum.domain.project.Member;
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Action implements Serializable{
	@EqualsAndHashCode.Include
	private Integer actionID;
	private String name;
	private String description;
	
	// timing
	private Date startDate;
	
	private Integer estimatedTime;
	private Integer remainingTime;
	private Integer realTime;	
	
	private ActionStatus actionStatus;
	
	private Topic topic;
	
	// assessment
	private Member responsible;
	
	private ActionCategory actionCategory;
	
	// Burn down
	private Map<Date, Integer> burnDownRecords = new HashMap<>();

	public void setRemainingTime(Integer remainingTime) {
		this.remainingTime = remainingTime;
		burnDownRecords.put(new Date(), remainingTime);
	}
	//-------------------------------------------------------------------------
	public Action(Integer actionID, String name, String description,
				  Date startDate, Integer estimatedTime, ActionStatus actionStatus,
				  ActionCategory actionCategory) {
		super();
		this.actionID = actionID;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.estimatedTime = estimatedTime;
		this.actionStatus = actionStatus;
		this.actionCategory = actionCategory;
	}
	public Action(Integer actionID, String name, Date startDate,
				  Integer estimatedTime) {
		super();
		this.actionID = actionID;
		this.name = name;
		this.startDate = startDate;
		this.estimatedTime = estimatedTime;
	}
	public Action(Integer actionID, String name,
				  Date startDate, Integer estimatedTime, Member responsible) {
		super();
		this.actionID = actionID;
		this.name = name;
		this.startDate = startDate;
		this.estimatedTime = estimatedTime;
		this.responsible = responsible;
	}
	
}
