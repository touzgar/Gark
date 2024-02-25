package com.ghaith.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghaith.entities.AchivementsTeam;
import com.ghaith.repos.AchievementTeamRepository;

@Service
public class AchivementTeamServiceImpl implements AchivementTeamService {
	@Autowired
	AchievementTeamRepository achievementTeamRepository;
	@Override
	public AchivementsTeam saveAchivementsTeam(AchivementsTeam achivement) {
		return achievementTeamRepository.save(achivement);
	}

	@Override
	public AchivementsTeam UpdateAchivementsTeam(AchivementsTeam achivement) {
		return achievementTeamRepository.save(achivement);
	}

	@Override
	public void deleteAchivementsTeam(AchivementsTeam achivement) {
		achievementTeamRepository.delete(achivement);
		
	}

	@Override
	public void deleteAchivementsTeamById(Long idachivement) {
		achievementTeamRepository.deleteById(idachivement);
		
	}

	@Override
	public AchivementsTeam getAchivementsTeam(Long idachivement) {
		
		return achievementTeamRepository.findById(idachivement).get();
	}

	@Override
	public List<AchivementsTeam> getAllAchivementsTeams() {
		
		return achievementTeamRepository.findAll();
	}

}
