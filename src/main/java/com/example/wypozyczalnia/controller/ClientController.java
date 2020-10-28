package com.example.wypozyczalnia.controller;

import com.example.wypozyczalnia.model.Client;

import com.example.wypozyczalnia.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;
    @RequestMapping("/clientList")
    public String viewClientList(Model model) {
        List<Client> clientList = clientService.listAll();
        model.addAttribute("clientList", clientList);
        return "client/clientList";
    }

    @RequestMapping("client/addNewClient")
    public String addNewClientForm(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "client/addNewClient";
    }



}
