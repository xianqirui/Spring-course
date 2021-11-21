package com.xqr.excep;

public class NotEnougEcpection extends RuntimeException {
    //运行时异常
    public NotEnougEcpection(){
    }
    public NotEnougEcpection(String message){
        super(message);
    }
}
