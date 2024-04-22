package com.cricket_action.cricket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cricket_action.cricket.entity.RawScore;
import com.cricket_action.cricket.entity.Score;
import com.cricket_action.cricket.service.ScoreService;

@Controller
public class ScoreController {

    @Autowired
    ScoreService service;

    @GetMapping("/")
    public String home() {
        return "insert_ball";
    }

    // @PostMapping("/success")
    // public String saveBall(@ModelAttribute(value = rawScore) RawScore s){
    //     return "success";}


    @RequestMapping(value = "/success", method=RequestMethod.POST)
    public String processForm(@ModelAttribute(value="rawScore") RawScore foo) {
        System.out.println(foo.toString());
        return "success";
    }
    

    @GetMapping("/ball")
    @ResponseBody
    public String getAllBall() {

        return new Score().toString();
    }

    @PostMapping("/ball")
    public String saveBall(@RequestBody RawScore score) {
        return service.saveBallDetails(score);
    }

}
