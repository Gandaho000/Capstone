package com.davisassociatescpa.myApp.controllers;

import com.davisassociatescpa.myApp.models.Client;
import com.davisassociatescpa.myApp.models.data.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.Errors;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "admin")
public class AppController {

    @Autowired
    private ClientDao clientDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayNewClientForm(Model model) {
        model.addAttribute ("client", new Client());
        return "userUX/newClientForm";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String processNewClientForm(@ModelAttribute @Valid Client newClient,
                                       Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "userUX/newClientForm";
        }

        clientDao.save(newClient);
        return "userUX/newClientForm";
    }


}
