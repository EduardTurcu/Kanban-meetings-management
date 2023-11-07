package org.scrum.domain.project;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class TeamLeader extends Member{

	private String technologicalAbilities;

	public TeamLeader(Integer id, String name,
			String technologicalAbilities) {
		super(id, name, Role.PRESENTER);
		this.technologicalAbilities = technologicalAbilities;
	}

	@Override
	public void setAbilities(String abilities) {
		this.setTechnologicalAbilities(abilities);
	}	
	
	// Supraincarcare
	public void setAbilities(String abilities, AbilityType type) {
		if (type.equals(AbilityType.PRESENTER))
			super.setAbilities(abilities);
		
		if (type.equals(AbilityType.ORGANIZATIONAL))
			setTechnologicalAbilities(abilities);
		
	}
	public enum AbilityType {PRESENTER, ORGANIZATIONAL}
}
