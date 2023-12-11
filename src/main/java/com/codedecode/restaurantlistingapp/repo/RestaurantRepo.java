package com.codedecode.restaurantlistingapp.repo;

import com.codedecode.restaurantlistingapp.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Serializable> {
}