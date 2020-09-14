package com.example.ssm.service.impl;

import com.example.ssm.dao.ItemMapper;
import com.example.ssm.pojo.Item;
import com.example.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemMapper itemMapper;

    public Item findById(int id) {
        return itemMapper.findById(id);
    }
}

