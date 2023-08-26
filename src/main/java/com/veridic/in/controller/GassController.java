package com.veridic.in.controller;

import com.veridic.in.Dao.GassTableRequest;
import com.veridic.in.Dao.GassTableRespose;
import com.veridic.in.service.GassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GassController
{
    @Autowired
   private GassService gassService;
    @PostMapping("/task")
    public GassTableRespose result(@RequestBody GassTableRequest gassTableRequest)
    {
        return gassService.resultService(gassTableRequest);
    }



}
