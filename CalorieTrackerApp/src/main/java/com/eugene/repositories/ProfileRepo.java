package com.eugene.repositories;

import com.eugene.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileRepo extends JpaRepository<Profile, Long> {
    Optional<Profile> findById(Long pId);

    Optional<Profile> findByUser_uId(Long uId);

//    List<Profile> findAll();
}
