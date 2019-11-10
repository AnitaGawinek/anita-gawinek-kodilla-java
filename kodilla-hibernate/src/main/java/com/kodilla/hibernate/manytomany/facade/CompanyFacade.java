package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    public List<Company> processCompanySearch(String letters) throws ProcessingException {
        boolean wasError = false;
        LOGGER.info("Processing company search with letters: " + letters);
        List<Company> searchCompanyResult = companyDao.searchCompanyByFewLetters(letters);
        try {
            if (searchCompanyResult.size() == 0) {
                LOGGER.error(ProcessingException.ERR_COMPANY_SEARCH);
                wasError = true;
                throw new ProcessingException(ProcessingException.ERR_COMPANY_SEARCH);
            } else {
                LOGGER.info("Companies found: " + searchCompanyResult);
            }
        } finally {
            if (wasError) {
                LOGGER.info("Something went wrong, please try again.");
            }
        } return searchCompanyResult;
    }

    public List<Employee> processEmployeeSearch(String letters) throws ProcessingException {
        boolean wasError = false;
        LOGGER.info("Processing employee search with letters: " + letters);
        List<Employee> searchEmployeeResult = employeeDao.searchEmployeeByFewLetters(letters);
        try {
            if (searchEmployeeResult.size() == 0) {
                LOGGER.error(ProcessingException.ERR_EMPLOYEE_SEARCH);
                wasError = true;
                throw new ProcessingException(ProcessingException.ERR_EMPLOYEE_SEARCH);
            } else {
                LOGGER.info("Employees found: " + searchEmployeeResult);
            }
        } finally {
            if (wasError) {
                LOGGER.info("Something went wrong, please try again.");
            }
        } return searchEmployeeResult;
    }
}
