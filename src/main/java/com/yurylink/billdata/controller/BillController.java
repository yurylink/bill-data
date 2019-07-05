package com.yurylink.billdata.controller;

import com.yurylink.billdata.data.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController("/bills")
public class BillController {

    @Autowired
    private BillRepository billRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getAllBills(){
        return ResponseEntity.ok().body(billRepository.findAll());
    }
}
