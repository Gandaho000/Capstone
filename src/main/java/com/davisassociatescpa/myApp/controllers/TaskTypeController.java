package com.davisassociatescpa.myApp.controllers;

import com.davisassociatescpa.myApp.models.Client;
import com.davisassociatescpa.myApp.models.TaskType;
import com.davisassociatescpa.myApp.models.data.TaskTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "tasktypes")
public class TaskTypeController {

    @Autowired
    TaskTypeDao taskTypeDao;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addTask(Model model) {
        model.addAttribute("title", "Add Task");
        model.addAttribute(new TaskType());
        return "tasks/tasktype.html";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddTask(@ModelAttribute @Valid TaskType newTaskType,
                                 Errors errors, Model model) {
        model.addAttribute("title", "Add Task");
        if (errors.hasErrors()) {
            return "tasks/tasktype.html";
        }

        taskTypeDao.save(newTaskType);
        return "tasks/tasktype.html";


    }

}
