package com.example.auditing.services.param;

import com.example.auditing.repositories.param.ParamTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParamType {
    @Autowired
    private ParamTypeRepository paramTypeRepository;
}