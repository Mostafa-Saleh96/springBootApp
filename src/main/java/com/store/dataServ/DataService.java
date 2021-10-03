/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.dataServ;


import com.store.entity.Data;
import com.store.repository.DataRepo;
import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DataService {
    @Autowired
    private DataRepo dataRpo;
    public void saveData( MultipartFile file , String title,String discription){
       Data data = new Data();
      data= dataRpo.findById(1).get();
        String fileName=file.getOriginalFilename();
        if(fileName.contains("")){
            System.out.println("not avalid file");
        }
        try {
            data.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        data.setTitle(title);
        data.setDescription(discription);
       dataRpo.save(data);
        
    }
}
