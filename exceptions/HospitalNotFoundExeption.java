package com.capgemini.coronavirustracker.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class HospitalNotFoundExeption extends RuntimeException{

    private final String resourceName;
    private final String fieldName;
    private final int fieldvalue;

    public HospitalNotFoundExeption(String resourceName, String fieldName, int hospitalId) {
        super(String.format("%s not found with %s:'%s'",resourceName,fieldName,hospitalId));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldvalue = hospitalId;
 }



   public String getResourceName() {
        return resourceName;
    }



   public String getFieldName() {
        return fieldName;
    }



   public long getFieldvalue() {
        return fieldvalue;
    }



   public static long getSerialversionuid() {
        return serialVersionUID;
    }



   /**
     *
     */
    private static final long serialVersionUID = 1970762601225780363L;



}