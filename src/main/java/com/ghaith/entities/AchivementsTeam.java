package com.ghaith.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class AchivementsTeam {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Long idAchivementsTeam;
private String tournamentName;
private Date dateAchived;
private String Rank;
public Long getIdAchivementsTeam() {
	return idAchivementsTeam;
}
public void setIdAchivementsTeam(Long idAchivementsTeam) {
	this.idAchivementsTeam = idAchivementsTeam;
}
public String getTournamentName() {
	return tournamentName;
}
public void setTournamentName(String tournamentName) {
	this.tournamentName = tournamentName;
}
public Date getDateAchived() {
	return dateAchived;
}
public void setDateAchived(Date dateAchived) {
	this.dateAchived = dateAchived;
}
public String getRank() {
	return Rank;
}
public void setRank(String rank) {
	Rank = rank;
}
public AchivementsTeam() {
	super();
}


}
