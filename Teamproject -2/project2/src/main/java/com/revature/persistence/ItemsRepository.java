package com.revature.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
