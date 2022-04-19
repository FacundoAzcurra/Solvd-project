package main.java.com.solvd.airportpackage.model.generic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrintDataGeneric<T>{
    private static final Logger LOGGER = LogManager.getLogger(PrintDataGeneric.class);
    private T data;
    public void ShowElement(){
        LOGGER.info(data);
    }

    public void setData(T t){
        this.data = t;
    }
    public T getData(){
        return this.data;
    }
}
