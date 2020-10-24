package com.example.wypozyczalnia.Controller;

import com.example.wypozyczalnia.model.Client;

import com.example.wypozyczalnia.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveClient(@ModelAttribute("client") Client client) {
        clientService.save(client);
        return "redirect:client/clientList";
    }

}
