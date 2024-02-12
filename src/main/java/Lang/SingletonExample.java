package Lang;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import Common.Util;

/**
 * Created by @author  @since 8/10/15.
 */

public class SingletonExample extends InvokableBase {

    private SingletonExample instance = null;

    synchronized
    public SingletonExample getInstance1() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }


    public SingletonExample getInstance2() {
        if (instance != null){
            return instance;
        }

        synchronized (this) {
            if (instance == null) {
                instance = new SingletonExample();
            }
        }
        return instance;
    }

    @Override
    public Priority getRunPriority() {
        return new Priority(240201/*151104*/, 01, Category.notClassified);
    }


    @Override
    public void run() {

        testlongestCommonPrefix();

    }


    void testlongestCommonPrefix() {

        //Call your test in Common/Main.java
        Util.assertEq("a", "");


    }
}