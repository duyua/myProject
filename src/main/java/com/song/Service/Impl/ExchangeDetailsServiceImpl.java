package com.song.Service.Impl;

import com.song.Repository.ExchangeDetailsRepositoty;
import com.song.Service.ExchangeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeDetailsServiceImpl implements ExchangeDetailsService{
    @Autowired
    private ExchangeDetailsRepositoty exchangeDetailsRepositoty;
}
