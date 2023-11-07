package org.scrum.domain.project;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Member 
	implements Comparable<Member>, Serializable{
	@EqualsAndHashCode.Include
	private Integer memberID;
	
	private String name;
	private Role role;

	//
	public Member(Integer memberID, String name) {
		super();
		this.memberID = memberID;
		this.name = name;
	}
	public Member(Integer memberID, String name, Role role) {
		super();
		this.memberID = memberID;
		this.name = name;
		this.role = role;
	}

	private String abilities;
	
	@Override
	public int compareTo(Member other) {
		if (this.equals(other))
			return 0;
		return this.getMemberID().compareTo(other.getMemberID());
	}
	
	public enum Role{
		ORGANIZER, PRESENTER, PARTICIPANT;
	}	
}