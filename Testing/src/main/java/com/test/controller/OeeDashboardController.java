package com.test.controller;

import java.util.List;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.summry.ProductionSummary;
import com.test.user.OeeData;

@Controller
public class OeeDashboardController {

    @GetMapping("/oee")
    public String showOeeDashboard(Model model) {
        // TODO: Retrieve the necessary data for OEE and production summaries
        OeeData oee = retrieveOeeData();
        List<ProductionSummary> productionSummaries = retrieveProductionSummaries();
        
        model.addAttribute("oee", oee);
        model.addAttribute("productionSummaries", productionSummaries);
        
        return "oee-dashboard.html"; // Return the name of the Thymeleaf template
    }

    // Method to retrieve OEE data
    private OeeData retrieveOeeData() {
        // TODO: Implement logic to fetch OEE data from the database or any other source
        // Return a dummy OeeData object for demonstration purposes
        return new OeeData(1, 85.0, 92.0, 98.5, 75.6);
    }

    // Method to retrieve production summaries
    private List<ProductionSummary> retrieveProductionSummaries() {
        // TODO: Implement logic to fetch production summaries from the database or any other source
        // Return a dummy list of ProductionSummary objects for demonstration purposes
        List<ProductionSummary> productionSummaries = new ArrayList<>();
        productionSummaries.add(new ProductionSummary(1, "2023-06-20", "Day Shift", 1000, 1200, 60));
        productionSummaries.add(new ProductionSummary(2, "2023-06-21", "Night Shift", 800, 1000, 30));
        return productionSummaries;
    }
}
