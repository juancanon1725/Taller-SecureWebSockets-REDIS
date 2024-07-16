package co.edu.escuelaing.arsw.bbapp.controllers;

import co.edu.escuelaing.arsw.bbapp.TicketRepository;
import co.edu.escuelaing.arsw.bbapp.configurators.BBConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
public class DrawingServiceController {

    @Autowired
    TicketRepository ticketRepo;

    @RequestMapping(
            value = "/status",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public String status() {
        return "{\"status\":\"Greetings from Spring Boot. "
                + java.time.LocalDate.now() + ", "
                + java.time.LocalTime.now()
                + ". " + "The server is Runnig!\"}";
    }

    @GetMapping("/getticket")
    public String getTicket() {
        return "{\"ticket\":\"" +
                ticketRepo.getTicket() + "\"}";
    }

}
