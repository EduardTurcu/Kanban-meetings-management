package org.scrum.domain.project;

import org.scrum.domain.project.Team.Specialization;

public class TeamFactory {
	public Team buildTeam(Integer id) {
		Team team = new Team(id, Specialization.IT);
		return team;
	}
}
