package com.amjadprojects.project.InputModel;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InputModel {


    private String lang;

    private int pageseg;

    private int ocrenginemode;

    private String filepath;

}
