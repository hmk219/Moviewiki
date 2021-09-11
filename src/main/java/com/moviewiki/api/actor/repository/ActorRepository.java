package com.moviewiki.api.actor.repository;

import com.moviewiki.api.actor.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {

    // 특정 배우 찾기 -> 이름으로
    public List<Actor> findByActorName(String actorName);
}
