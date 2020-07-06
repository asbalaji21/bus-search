package com.example.demo.bussearch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "BUS_INVENTORY")
public class BusSearchModel {

    @Id
    @Column(name="BUS_NUMBER")
    private String busNumber;
    @Column(name="OPERATOR_NAME")
    private String operatorName;
    @Column(name="DEPARTURE")
    private LocalDateTime departure;
    @Column(name="ARRIVAL")
    private LocalDateTime arrival;
    @Column(name="SOURCE_CITY")
    private String sourceCity;
    @Column(name="DESTINATION_CITY")
    private String destinationCity;
    @Column(name="PRICE")
    private double price;
}
