package cap12;

enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

class ShowEnum {
    public static void main(String args[]) {
        for(Tools d : Tools.values())
            System.out.print(d + " has ordinal value of " +
                    d.ordinal() + '\n');
    }
}
