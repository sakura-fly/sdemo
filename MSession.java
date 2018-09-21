package testmap;

public class MSession {

    private static int index = 0;
    private int ix = 0;

    public MSession() {
        ix = ++index;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        MSession.index = index;
    }

    public int getIx() {
        return ix;
    }

    public void setIx(int ix) {
        this.ix = ix;
    }

    public void dis() {
        MSS.getInstance().remove(this);
    }

    @Override
    public String toString() {
        return ix + "";
    }
}
