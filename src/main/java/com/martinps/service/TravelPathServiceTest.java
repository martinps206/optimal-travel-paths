package com.martinps.service;

import com.martinps.model.Path;
import com.martinps.model.Station;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TravelPathServiceTest {

    private TravelPathService travelPathService;

    @BeforeEach
    void setUp() {
        travelPathService = new TravelPathService();
    }

    @Test
    void testFindOptimalPath() {
        Station origin = new Station("A");
        Station destination = new Station("B");
        Path optimalPath = travelPathService.findOptimalPath(origin.getName(), destination.getName());

        assertEquals(origin.getName(), optimalPath.getOrigin().getName());
        assertEquals(destination.getName(), optimalPath.getDestination().getName());
    }

}
