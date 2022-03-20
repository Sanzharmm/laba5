package com.spring.mvc_hibernate_aop.service;

import com.spring.mvc_hibernate_aop.entity.Client;
import com.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface ServiceI {

    public List<Client> getAllClients();

    public void saveClient(Client client);

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
}
