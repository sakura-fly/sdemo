package testmap;

import java.util.*;

public class MSS {
    private MSS() {
        ms = new HashMap<String, MSession>();
    }


    private Map<String, MSession> ms;

    private static class SingleClassMSS {
        private static final MSS mss = new MSS();
    }

    public static MSS getInstance() {
        return SingleClassMSS.mss;
    }

    public Map<String, MSession> getMs() {
        return ms;
    }

    public void add(MSession m) {
        ms.put(UUID.randomUUID().toString(), m);
    }

    public void add(String key, MSession m) {
        ms.put(UUID.randomUUID().toString(), m);
    }

    public void remove(MSession m) {
        Collection<MSession> vs = ms.values();
        vs.remove(m);
    }

    public String update(String key){
        MSession o = ms.remove(key);
        String nk = UUID.randomUUID().toString();
        ms.put(nk,o);
        return nk;
    }

}
