package marker.exc;


public class Transformer {
    public void transform(Object obj) throws NotTransformableException{
        if(obj instanceof Transformer){
            System.out.println("Transformat");
        }else{
            throw new NotTransformableException("Nu poate fi transformat");
        }

    }
}