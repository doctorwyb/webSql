package com.doctor.dao;

import com.doctor.model.DbSourceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
@Repository
public interface DbSourceRepository extends JpaSpecificationExecutor<DbSourceModel>,JpaRepository<DbSourceModel,Long> {


}
