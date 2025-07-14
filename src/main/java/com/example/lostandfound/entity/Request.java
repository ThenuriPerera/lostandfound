package com.example.lostandfound.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Item item;

    @ManyToOne
    private User requester;

    @Enumerated(EnumType.STRING)
    private RequestStatus status;
}
