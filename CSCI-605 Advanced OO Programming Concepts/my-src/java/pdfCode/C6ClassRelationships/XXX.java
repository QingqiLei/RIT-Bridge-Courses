package pdfCode.C6ClassRelationships;

public class XXX {
    int oI = 1;
    XXX aXXX = new XXX();
    public XXX(){

    }

    public static void main(String args[]){
//        XXX aaXXX = new XXX();
        Float f1 = new Float(42f);
        Integer i1 = new Integer(42);
        Double d1 = new Double(42);
//        float f = f1 + (float)i1 + ((float)d1);
        float f = f1 + (float)i1 + ((float)d1.doubleValue());
        System.out.println(f );
    }
}
