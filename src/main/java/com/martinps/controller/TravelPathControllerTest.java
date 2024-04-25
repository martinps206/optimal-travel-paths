package com.martinps.controller;

import com.martinps.model.Station;
import com.martinps.service.TravelPathService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(TravelPathController.class)
public class TravelPathControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private TravelPathService travelPathService;

    @InjectMocks
    private TravelPathController travelPathController;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testAddStation() throws Exception {
        Station station = new Station("Station A");
        mockMvc.perform(MockMvcRequestBuilders.post("/api/travel/station")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"Station A\"}")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }
}
