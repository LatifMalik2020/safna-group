package com.safnaliftoff.upscaile.Controller;

import com.safnaliftoff.upscaile.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@CrossOrigin(origins = "http://localhost:8080")

public class ImageController {

    @Autowired
    ImageService a;

    @GetMapping("/image/store")
    public String storeImage(@RequestParam(value="name") String name){
        System.out.println("This is "+ name);
        a.storeImage(name);
        return "Image Stored of "+ name;


}

}
