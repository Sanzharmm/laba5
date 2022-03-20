package com.spring.mvc_hibernate_aop.dao;

import com.spring.mvc_hibernate_aop.entity.Client;

import java.util.List;


public interface ClientDAO {
    public List<Client> getAllClients();

    public void saveClient(Client client);
}

