package com.amjadprojects.project.Service;


import com.amjadprojects.project.InputModel.InputModel;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLOutput;

@Service
public class OcrService {

    public String getOcr(InputModel inputModel) {


        System.out.println(inputModel.getFilepath());

        try {
            File image = new File(inputModel.getFilepath());

            System.out.println(inputModel.getFilepath());


            Tesseract tesseract = new Tesseract();


            tesseract.setDatapath("src/main/resources/tessdata");

            tesseract.setLanguage(inputModel.getLang());

            tesseract.setPageSegMode(inputModel.getPageseg());

            tesseract.setOcrEngineMode(inputModel.getOcrenginemode());

            String result = tesseract.doOCR(image);
            System.out.println("result : - ");
            System.out.println(result);
            System.out.println("******************************");

            return  result;

        }catch (Exception e){
            return e.getMessage();
        }

    }




}
