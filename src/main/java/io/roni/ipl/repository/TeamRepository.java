package io.roni.ipl.repository;

import org.springframework.data.repository.CrudRepository;

import io.roni.ipl.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}