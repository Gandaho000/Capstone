package com.davisassociatescpa.myApp.models.data;

import com.davisassociatescpa.myApp.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ClientDao extends CrudRepository <Client, Integer> {
}
