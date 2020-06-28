package com.company;

public class FlowerLogicException extends Exception {
    public FlowerLogicException(){
    }
    public FlowerLogicException(String message,Throwable exception){
        super(message,exception);
    }
    public FlowerLogicException(String message){
        super(message);
    }
    public FlowerLogicException(Throwable exception){
        super(exception);
    }
}
