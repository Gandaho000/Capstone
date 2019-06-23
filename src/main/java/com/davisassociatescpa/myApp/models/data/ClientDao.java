package com.davisassociatescpa.myApp.models.data;

import com.davisassociatescpa.myApp.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface ClientDao extends CrudRepository <Client, Integer> {


    @Override
    Optional<Client> findById(Integer integer);
}

