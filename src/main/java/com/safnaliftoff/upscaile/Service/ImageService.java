package com.safnaliftoff.upscaile.Service;

import org.springframework.stereotype.Service;

@Service
public class ImageService {



    public void storeImage(String name){
        System.out.println("This image is stored from service class of "+name);
    }


}
