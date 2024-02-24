package com.ghaith.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Club {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long idClub;
private String clubName;
private String description;
private Date dateCreation;


public Long getIdClub() {
	return idClub;
}
public void setIdClub(Long idClub) {
	this.idClub = idClub;
}
public String getClubName() {
	return clubName;
}
public void setClubName(String clubName) {
	this.clubName = clubName;
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
public Club() {
	super();
	
}
@Override
public String toString() {
	return "Club [idClub=" + idClub + ", clubName=" + clubName + ", Description=" + description + ", dateCreation="
			+ dateCreation + "]";
}



}
