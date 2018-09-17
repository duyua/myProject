package com.song.Repository;
import com.song.Entity.AddressManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AddressManagerRepositoty  extends JpaRepository<AddressManager,Long>{

}
