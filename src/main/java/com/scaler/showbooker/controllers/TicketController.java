package com.scaler.showbooker.controllers;

import com.scaler.showbooker.dtos.BookTicketResponseDto;
import com.scaler.showbooker.dtos.BookicketRequestDto;
import com.scaler.showbooker.exceptions.InvalidArgumentsException;
import com.scaler.showbooker.exceptions.SeatNotAvailableException;
import com.scaler.showbooker.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.concurrent.TimeoutException;

@Controller
public class TicketController {
   private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public BookicketRequestDto bookTicket(BookicketRequestDto request) {
        BookTicketResponseDto response = new BookTicketResponseDto();

       try {
            ticketService.bookTicket(request.getSeatIds(),request.getShowId(), request.getUserId());
        }
       catch (SeatNotAvailableException | InvalidArgumentsException e) {
           throw new RuntimeException(e);
       }

        return null;
    }
}
