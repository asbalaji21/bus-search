package com.example.demo.bussearch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusSearchRepository extends JpaRepository<BusSearchModel, String> {

    List<BusSearchModel> findAllBySourceCityAndDestinationCityOrderByPriceAsc(String sourceCity, String destinationCity);
}
