package com.amjadprojects.project.Controller;


import com.amjadprojects.project.InputModel.InputModel;
import com.amjadprojects.project.Service.OcrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ocr")
public class ApiController {


    final
    OcrService ocrService;


    public ApiController(OcrService ocrService) {
        this.ocrService = ocrService;
    }


    @GetMapping("/extract")
    public String getText(@RequestBody InputModel inputModel){
       try {
           System.out.println("Enter The Method here :-");
           return ocrService.getOcr(inputModel);
       }catch (Exception e){
           return e.getMessage();
       }
    }


}
