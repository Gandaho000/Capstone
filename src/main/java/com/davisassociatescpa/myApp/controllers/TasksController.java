package com.davisassociatescpa.myApp.controllers;

import com.davisassociatescpa.myApp.models.data.TasksDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "tasks")
public class TasksController {

    @Autowired
    TasksDao  tasksDao;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addTask(Model model) {
        model.addAttribute("title", "Add Task");
        return "tasks/addtask.html";
    }

}
