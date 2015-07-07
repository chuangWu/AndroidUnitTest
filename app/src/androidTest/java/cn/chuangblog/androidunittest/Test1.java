package cn.chuangblog.androidunittest;

import android.test.InstrumentationTestCase;
import android.util.Log;

/**
 * Created by Administrator on 2015/7/7.
 */
public class Test1 extends InstrumentationTestCase {

    public void test() throws Exception {
        final int expected = 1;
        final int reality = 3;
        Log.d("TAG",expected+"");
        assertEquals(expected, reality);
    }
}
