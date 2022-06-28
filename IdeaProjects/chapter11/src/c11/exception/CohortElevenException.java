package c11.exception;

public class CohortElevenException extends RuntimeException {
    public CohortElevenException(){
        super();
    }
    public CohortElevenException(String message){
        super(message);
    }
    public CohortElevenException(Throwable ex){
        super(ex);
    }
    public CohortElevenException(String message, Throwable ex){
        super(message, ex);
    }
}
