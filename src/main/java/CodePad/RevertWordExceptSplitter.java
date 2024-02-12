package CodePad;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import org.apache.commons.lang.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author
 * @since 10/28/15
 * This is the template for adding any new class
 */

public class RevertWordExceptSplitter extends InvokableBase {
  // Add this class to Common/Main.java
  @Override
  public Priority getRunPriority() {
    return new Priority(240201, 3, Category.LeetCode);
  }

  /*
  Find K distinct ids with highest values from a stream of data.
     input: <id1, 50>, <id2, 30>, <id3, 20>, <id2, 40>
     K = 3
   */
  @Override
  public void run() {
    //Call your test in Common/Main.java
    eq("", 1, 1);
    eq("from _ _a__ab_ _ _abc", " _ _abc__ab_ _ _a", revertWordExceptSplitter("_ _a__ab_ _ _abc", " _"));

    eq("from _ _hot_dog", "_ _dog_hot", revertWordExceptSplitter("_ _hot_dog", " _"));
    eq("from _ _dog_ hodt t", "_ _t_ hodt dog", revertWordExceptSplitter("_ _dog_ hodt t", " _"));

  }

  String revertWordExceptSplitter(String s, String splitter){

    Set set = new HashSet<Character>();
    for(char ch : splitter.toCharArray()){
      set.add(ch);
    }

    // This is will only have non empty string
    String[] ss0 = StringUtils.split(s, splitter);
    StringBuilder sb = new StringBuilder();

    int pos = 0;
    int i=0;
    char[] sarray = s.toCharArray();
    while(i< s.length()) {
      char ch = sarray[i];
      if (set.contains(ch)) {
        sb.append(ch);
        i++;
      }
      else {
        i += ss0[pos].length();
        sb.append(ss0[ss0.length - pos - 1]);
        pos ++;
      }
    }

    return sb.toString();
  }

}
