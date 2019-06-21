package com.davisassociatescpa.myApp.controllers;

import com.davisassociatescpa.myApp.models.TaskType;
import com.davisassociatescpa.myApp.models.data.TaskTypeDao;
import com.davisassociatescpa.myApp.models.data.TasksDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "tasktypes")
public class TaskTypeController {

    @Autowired
    TaskTypeDao taskTypeDao;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addTask(Model model) {
        model.addAttribute("title", "Add Task");
        model.addAttribute("newTaskType", new TaskType());
        return "tasks/tasktype.html";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addTask(Model model) {
        model.addAttribute("title", "Add Task");
        model.addAttribute("newTaskType", new TaskType());
        return "tasks/tasktype.html";
    }

}
