package com.example.demo.bussearch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusSearchResponse {

    private String busNumber;
    private String operatorName;
    private LocalDateTime departure;
    private LocalDateTime arrival;
    private String sourceCity;
    private String destinationCity;
    private long durationInMinutes;
    private double price;
}
