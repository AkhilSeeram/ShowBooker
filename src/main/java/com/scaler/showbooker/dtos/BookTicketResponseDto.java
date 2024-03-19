package com.scaler.showbooker.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookTicketResponseDto {
    private int amount;
    private Long ticketId;
    private List<String> seatNumber;
    private String auditoriumName;
    private String status;
    private String message;
}

// bookmyshow.com/pay/{ticketId}
