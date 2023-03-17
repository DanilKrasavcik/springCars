package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {



    private CarServiceImpl carService;

    @Autowired
    public CarsController (CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCountController(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars",
                carService.carCounter(count));
        return "cars";
    }

}
