package com.davisassociatescpa.myApp.models.data;

import com.davisassociatescpa.myApp.models.Tasks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TasksDao extends CrudRepository <Tasks, Integer> {
}
