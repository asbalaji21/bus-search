package com.example.demo.bussearch;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class BusSearchService {

    private BusSearchRepository busSearchRepository;

    public BusSearchService(BusSearchRepository busSearchRepository) {
        this.busSearchRepository = busSearchRepository;
    }

    List<BusSearchResponse> searchBuses(String sourceCity,
            String destinationCity,
            LocalDate travelDate,
            LocalDate returnDate) {
        if(StringUtils.isEmpty(sourceCity) || StringUtils.isEmpty(destinationCity))
            throw new IllegalArgumentException();
        List<BusSearchModel> busSearchModels = busSearchRepository.findAllBySourceCityAndDestinationCityOrderByPriceAsc(sourceCity, destinationCity);
        return busSearchModels.stream().map(this::convertToResponse).collect(Collectors.toList());
    }

    private BusSearchResponse convertToResponse(BusSearchModel busSearchModel) {
        return BusSearchResponse.builder().busNumber(busSearchModel.getBusNumber())
                .arrival(busSearchModel.getArrival()).departure(busSearchModel.getDeparture())
                .destinationCity(busSearchModel.getDestinationCity()).operatorName(busSearchModel.getOperatorName())
                .price(busSearchModel.getPrice()).sourceCity(busSearchModel.getSourceCity())
                .durationInMinutes(busSearchModel.getDeparture().until(busSearchModel.getArrival(), ChronoUnit.MINUTES))
                .build();
    }
}
