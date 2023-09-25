package com.interviewtest.math;

import static org.hamcrest.Matchers.matchesPattern;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class MyRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testEndpointReturnsAlphanumericValue() throws Exception {
        String endpointUrl = "/api/resource"; // Replace with your actual endpoint URL
        String requestBody = "{\"problem\": \"2,2,4\"}"; // Replace with your POST request body

        mockMvc.perform(post(endpointUrl)
                .content(requestBody)
                .contentType(MediaType.APPLICATION_JSON))
               .andExpect(status().isOk())
               .andExpect(content().string(matchesPattern("^[a-zA-Z0-9]+$"))); // Regex pattern for alphanumeric
    }
}
