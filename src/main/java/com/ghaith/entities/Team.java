package com.ghaith.entities;

import java.util.Date;
import java.util.List;
//import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 @Temporal(TemporalType.DATE)
 @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Long idTeam;
	private String teamName;
	private String description;
	private Date dateCreation;
	 @ElementCollection
	 private List<String> participatingTournaments;

		// Assuming Player is an entity with its own table
	/*    @ElementCollection
	    private Map<Player, String> rolesAndResponsibilities;
		*/

    public Long getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(Long idTeam) {
		this.idTeam = idTeam;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public List<String> getParticipatingTournaments() {
		return participatingTournaments;
	}

	public void setParticipatingTournaments(List<String> participatingTournaments) {
		this.participatingTournaments = participatingTournaments;
	}

	/*public Map<Player, String> getRolesAndResponsibilities() {
		return rolesAndResponsibilities;
	}

	public void setRolesAndResponsibilities(Map<Player, String> rolesAndResponsibilities) {
		this.rolesAndResponsibilities = rolesAndResponsibilities;
	}
*/
	
	
	
}
