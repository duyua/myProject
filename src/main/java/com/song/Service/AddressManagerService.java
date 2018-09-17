package com.song.Service;

import com.song.Entity.AddressManager;
import com.song.Repository.AddressManagerRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

public interface AddressManagerService {
     AddressManager toSaveAddressManager(AddressManager addressManager);

     AddressManager delAddressManager(String id) ;


     AddressManager findByid(String id) ;
}
