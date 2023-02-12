public class Main {
    public static void main(String[] args) {
        //Sign
        char fristName;   //char only one sign
        fristName = 'a';
        System.out.println(fristName);

        //String
        String zmString = "Dominik Skórka";
        System.out.println(zmString);

        //boolean
        boolean zmBoolean = true; //false
        System.out.println(zmBoolean);

        //byte
        byte zmByte = Byte.MIN_VALUE;
        byte zmByte2 = Byte.MAX_VALUE;
        System.out.println("byte: "+zmByte+" - "+ zmByte2);

        short zmShort = Short.MIN_VALUE;
        short zmShort2 = Short.MAX_VALUE;
        System.out.println("short: "+zmShort+" - "+ zmShort2);

        int zmInt = Integer.MIN_VALUE;
        int zmInt2 = Integer.MAX_VALUE;
        System.out.println("int: "+zmInt+" - "+ zmInt2);

        long zmlong = Long.MIN_VALUE;
        long zmlong2 = Long.MAX_VALUE;
        System.out.println("long: "+zmlong+" - "+ zmlong2);

        float zmFloat = 3.21123F;
        float zmfloat = Float.MIN_VALUE;
        float zmfloat2 = Float.MAX_VALUE;
        System.out.println("float: "+zmfloat+" - "+ zmfloat2);

        double zmdouble = Double.MIN_VALUE;
        double zmdouble2 = Double.MAX_VALUE;
        System.out.println("double: "+zmdouble+" - "+ zmdouble2);

        final int abc = 256;
        //error   abc = 266;
    }
}