package com.appbook.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appbook.model.PersonModel;

@Repository
public interface PersonModelRepo extends JpaRepository<PersonModel,String> {

}
