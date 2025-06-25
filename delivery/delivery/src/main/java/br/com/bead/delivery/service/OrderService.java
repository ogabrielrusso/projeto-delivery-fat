package br.com.bead.delivery.service;
import org.springframework.stereotype.Service;
import br.com.bead.delivery.repository.OrderRepository;
import br.com.bead.delivery.model.Order;

import br.com.bead.delivery.dto.OrderDTO;
import br.com.bead.delivery.dto.OrderRequest;
import org.modelmapper.ModelMapper;


import java.time.LocalDateTime;


@Service
public class OrderService {
    private final OrderRepository repository;
    public OrderService(OrderRepository repo, ModelMapper modelmapper) {
        this.repo = repo;
        this.mapper = mapper;
   
    }

    public dto.OrderDTO createOrder(OrderRequest orderReques req) {
        
        Order order = new Order();
        order.setCustomerName(req.getCustomerName());
        order.setTotalAmount(req.getTotalAmount());
        order.setCreatedAt(LocalDataTime.now());

        order saved = repo.save(order);

        return mapper.map(saved, OrderDTO.class);
        
    }
    
    

