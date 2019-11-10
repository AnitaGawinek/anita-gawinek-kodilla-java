package com.kodilla.hibernate.manytomany.facade;

public class ProcessingException extends Exception {
    public static String ERR_COMPANY_SEARCH = "Company search error";
    public static String ERR_EMPLOYEE_SEARCH = "Employee search error";

    public ProcessingException(String message) {
        super(message);
    }

}
