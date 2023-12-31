package edu.escuelaing.arep.services;

import edu.escuelaing.arep.annotation.Component;
import edu.escuelaing.arep.annotation.RequestMapping;

import java.util.Date;
/**
 * @author Brayan Camilo Castiblanco
 * @version 1.0 9/20/2023
 * @project EciSpringboot
 * Class that offer a services related with dates
 */
@Component
public class DateService {
    /**
     * Method that return a html page with information of the current date
     *
     * @return String, html page with the current date
     */
    @RequestMapping("date")
    public static String date() {
        return "HTTP/1.1 200 OK\r\n"
                + "Content-Type: text/html\r\n"
                + "\r\n"
                + "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<meta charset=\"UTF-8\">"
                + "<title>Date</title>\n"
                + "</head>"
                + "<body>"
                + "<h1>Current Date</h1>"
                + "</div>"
                + "<p>"
                + new Date().toString()
                + "</p>"
                + "</body>"
                + "</html>";
    }
}
