package com.projects.f1leagueback.repository;

import com.projects.f1leagueback.model.League;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueRepository extends MongoRepository<League, Integer> {
}
