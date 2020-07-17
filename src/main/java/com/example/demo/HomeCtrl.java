package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;

@Controller
public class HomeCtrl {
    public ArrayList<Employee> allEmployees = new ArrayList<>();

    @GetMapping("/employee")
    public String loadFormPage(Model model){
        model.addAttribute("employee", new Employee());
        return "employee";
    }
    @PostMapping("/employee")
    public String loadFromPage(@ModelAttribute Employee employee, Model model) {
        model.addAttribute("employee, employee");
        allEmployees.add(employee);
            return "redirect:/list";
        }
    @GetMapping("/list")
    public String listAll(@ModelAttribute Employee employee, Model model){
        model.addAttribute("allEmployees", allEmployees);
        return "list";


    }
}