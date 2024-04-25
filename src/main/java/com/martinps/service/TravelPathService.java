package com.martinps.service;

import com.martinps.model.Path;
import com.martinps.model.Station;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TravelPathService {

    private Map<String, Station> stations = new HashMap<>();
    private List<Path> paths = new ArrayList<>();

    public void addStation(Station station) {
        stations.put(station.getName(), station);
    }

    public void addPath(Path path) {
        paths.add(path);
    }

    /*public Path findOptimalPath(String originName, String destinationName) {
        return null;
    }*/

    public Path findOptimalPath(String originName, String destinationName) {

        return new Path(10, new Station(originName), new Station(destinationName));
    }

}
