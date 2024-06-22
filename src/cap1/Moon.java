package cap1;

/*
 Calcula seu peso na Lua.
 Chame este arquivo de Moon.java.
*/
class Moon {
    // qual variavel numerica podemos usar oara este number 13,170,000,000,000,000,000,000,000 (1.3 x 1025)

    public static void main(String args[]) {
        double earthweight; // peso na Terra
        double moonweight; // peso na Lua
        earthweight = 1317000000;
        moonweight = earthweight * 0.17;
        System.out.println(earthweight + " earth-pounds is equivalent to " + moonweight + " moon-pounds.");
    }
}
