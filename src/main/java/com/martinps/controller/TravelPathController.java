package com.martinps.controller;

import com.martinps.model.Path;
import com.martinps.model.Station;
import com.martinps.service.TravelPathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/travel")
public class TravelPathController {

    private final TravelPathService travelPathService;

    @Autowired
    public TravelPathController(TravelPathService travelPathService) {
        this.travelPathService = travelPathService;
    }

    @PostMapping("/station")
    public ResponseEntity<Void> addStation(@RequestBody Station station) {
        travelPathService.addStation(station);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/path")
    public ResponseEntity<Void> addPath(@RequestBody Path path) {
        travelPathService.addPath(path);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/path")
    public ResponseEntity<Path> findOptimalPath(@RequestParam String originName, @RequestParam String destinationName) {
        Path optimalPath = travelPathService.findOptimalPath(originName, destinationName);
        if (optimalPath != null) {
            return new ResponseEntity<>(optimalPath, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
