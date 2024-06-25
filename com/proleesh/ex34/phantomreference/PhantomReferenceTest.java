package com.proleesh.ex34.phantomreference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {
    public static void main(String[] args) throws Exception {
        String str = new String("자바 마스터");
        ReferenceQueue<String> rq = new ReferenceQueue<>();
        // 패톤 레퍼런스
        PhantomReference<String> pr = new PhantomReference<>(str, rq);
        str = null;
        System.out.println(pr.get());
        System.gc();
        System.out.println(rq.poll() == pr);

    }
}
