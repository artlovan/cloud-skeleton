package io.lovan.artem.msgapp.controller;

import io.lovan.artem.msgapp.service.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateTimeController {

    @Autowired
    private DateTimeService dateTimeService;

    @GetMapping("/time")
    public String getTime() {
        return dateTimeService.getDateTime();
    }
}
