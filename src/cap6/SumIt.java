package cap6;

class SumIt {
    int sum(int ... n) {
        int result = 0;
        for(int i = 0; i < n.length; i++)
            result += n[i];
        return result;
    }

    char sum(char ...c) {
        char result = 0;
        for(int i = 0; i < c.length; i++)
            result += c[i];
        return result;
    }
}
class SumDemo {
    public static void main(String args[]) {
        SumIt siObj = new SumIt();
        int total = siObj.sum(1, 2, 3);
        System.out.println("Sum is " + total);
        total = siObj.sum(1, 2, 3, 4, 5);
        System.out.println("Sum is " + total);
    }
}
