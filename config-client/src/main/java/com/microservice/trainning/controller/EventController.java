package com.microservice.trainning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.comparator.BooleanComparator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class EventController {

    @Value("${feature.x.enable}")
    String featureXEnable;

    @RequestMapping("/")
    String index(){
        if(Boolean.valueOf(featureXEnable)) {
            return "Feature X Is Enable";
        }
        return "Event Controller is handling logic without Feature X";
    }
}
