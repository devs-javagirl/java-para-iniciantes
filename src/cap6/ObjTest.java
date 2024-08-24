package cap6;

class ObjTest {
    int a, b;
    ObjTest(int i, int j) {
        a = i;
        b = j;
    }
    void change(ObjTest ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

class PassObRef {
    public static void main(String[] args) {
        ObjTest ob = new ObjTest(15, 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
