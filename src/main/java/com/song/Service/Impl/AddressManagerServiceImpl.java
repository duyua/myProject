package com.song.Service.Impl;

import com.song.Entity.AddressManager;
import com.song.Repository.AddressManagerRepositoty;
import com.song.Service.AddressManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class AddressManagerServiceImpl implements AddressManagerService {

    @Autowired
    private AddressManagerRepositoty addressManagerRepositoty;


    public AddressManager toSaveAddressManager(AddressManager addressManager) {
        AddressManager manager = null;
        try {
            manager = addressManagerRepositoty.save(addressManager);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return manager;
    }

    public AddressManager delAddressManager(String id) {
        AddressManager manager = addressManagerRepositoty.findOne(Long.parseLong(id));
        manager.setStatus("1");
        AddressManager addressManager = null;
        try {
            addressManager = addressManagerRepositoty.save(manager);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return addressManager;
    }


    public AddressManager findByid(String id) {
        if (StringUtils.isEmpty(id))
            return null;
        AddressManager addressManager = null;
        try {
            addressManager=addressManagerRepositoty.findOne(Long.parseLong(id));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return addressManager;
    }
}
