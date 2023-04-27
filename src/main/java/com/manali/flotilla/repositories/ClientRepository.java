package com.manali.flotilla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manali.flotilla.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}