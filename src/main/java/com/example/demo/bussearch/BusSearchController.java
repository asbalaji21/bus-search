package com.example.demo.bussearch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class BusSearchController {


    private BusSearchService busSearchService;

    public BusSearchController(BusSearchService busSearchService) {
        this.busSearchService = busSearchService;
    }

    @GetMapping("/searchBuses")
    public List<BusSearchResponse> searchBuses(@RequestParam String sourceCity, @RequestParam String destinationCity) {
        return busSearchService.searchBuses(sourceCity, destinationCity, null, null);
    }
}
