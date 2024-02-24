package com.ghaith.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghaith.entities.Club;


public interface ClubRepository extends JpaRepository<Club, Long> {
	
	    List<Club> findByClubNameContainingIgnoreCase(String clubName);
	
}
