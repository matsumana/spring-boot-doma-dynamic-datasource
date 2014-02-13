package info.matsumana.domain.service;

import info.matsumana.domain.model.Employee;
import info.matsumana.domain.repository.EmployeeRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class EmployeeService {

    @Inject
    EmployeeRepository employeeRepository;

    public Employee findById(Integer employeeId) {
        return employeeRepository.findById(employeeId);
    }
}
