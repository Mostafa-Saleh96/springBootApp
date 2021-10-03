/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.repository;

import com.store.entity.Admin;
import com.store.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HAWASEB
 */
@Repository
public interface DataRepo extends JpaRepository<Data, Integer> {

} 
