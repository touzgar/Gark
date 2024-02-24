package com.ghaith.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghaith.entities.Club;
import com.ghaith.repos.ClubRepository;

@Service
public class ClubSeriveImpl implements CLubService {
@Autowired
ClubRepository clubRepository;

@Override
public Club saveClub(Club club) {
	
	return clubRepository.save(club) ;

}

@Override
public Club UpdateClub(Club club) {
	return clubRepository.save(club) ;}

@Override
public void deleteClub(Club club) {
	clubRepository.delete(club);
	
}

@Override
public void deleteClubById(Long idClub) {
	clubRepository.deleteById(idClub);
}

@Override
public Club getClub(Long idClub) {
	return clubRepository.findById(idClub).get();
	}

@Override
public List<Club> getAllClubs() {
	
	return clubRepository.findAll();
}

@Override
public List<Club> searchByClubName(String clubName) {
    return clubRepository.findByClubNameContainingIgnoreCase(clubName);
}
}

