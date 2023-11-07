package org.scrum.domain.project;

import lombok.Data;

@Data
public class ProjectManager extends Member{

	private Integer managerialExperience; // in ani
	private String managerialAbilities; // agile, cascade, RUP
	
	public ProjectManager() {
		super();
		super.setRole(Role.ORGANIZER);
	}
	//
	public ProjectManager(Integer id, String name,
			Integer managerialExperience, String managerialAbilities) {
		super(id, name, Role.ORGANIZER);
		this.managerialExperience = managerialExperience;
		this.managerialAbilities = managerialAbilities;
	}

	public String getAbilities(AbilityType type) {
		if (AbilityType.MANAGERIAL.equals(type))
			return "manageriale: " + managerialAbilities;
		if (AbilityType.TECHNICAL.equals(type))
			return "tehnice: " + this.getAbilities();
		return null;
	}	
	
	// caz supra-scriere
	@Override
	public void setRole(Role role) {
		throw new Error("Proprietatea rol nu poate fi schimbata!");
	}
	
	public enum AbilityType {MANAGERIAL, TECHNICAL};
}
