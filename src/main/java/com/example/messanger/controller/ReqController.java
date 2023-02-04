package com.example.messanger.controller;

import com.example.messanger.entity.users.Users;
import com.example.messanger.entity.users.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class ReqController {
    private final UsersRepository repository;

    @GetMapping("12")
    public ModelAndView get(){
        ModelAndView modelAndView = new ModelAndView("first.html");
//        Optional<Users> byId = repository.findById(1);
        modelAndView.addObject("user",repository.findById(1).get());
        return modelAndView;
    }

}
