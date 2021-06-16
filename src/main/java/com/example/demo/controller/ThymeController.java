package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeController {

    @RequestMapping("/")
    String indexPage(Model model){
        List<Board> list = new ArrayList<>();
        for(int i=0; i<5; i++) {
            Board board = new Board(i, "테스트 제목 " + i, "wind", "2021061510101" + i );
            list.add(board);
        }

        model.addAttribute("list", list);
        return "index";
    }

}
