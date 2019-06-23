package com.davisassociatescpa.myApp.controllers;

import com.davisassociatescpa.myApp.models.Client;
import com.davisassociatescpa.myApp.models.data.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.Errors;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping(value = "admin")
public class ClientController {

    @Autowired
    private ClientDao clientDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayNewClientForm(Model model) {
        model.addAttribute("client", new Client());
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

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public String displayListOfClients(Model model) {
        model.addAttribute("title", "Clients");
        model.addAttribute("clients", clientDao.findAll());
        return "admin/clientsData";

    }

    @RequestMapping(value = "clients/clientID", method = RequestMethod.GET)

    public String getID(Model model, @RequestParam int clientID) {

        Client client = clientDao.findById(clientID).get();

        model.addAttribute("client", client);


        return "admin/clientsDataSingle";
    }

}


