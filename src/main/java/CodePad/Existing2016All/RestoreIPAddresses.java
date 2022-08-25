package CodePad.Existing2016All;

import java.util.ArrayList;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

/**
 * Given a string containing only digits, restore it by returning all possible valid IP address
 * combinations.
 *
 * For example: Given "25525511135",
 *
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 */

public class RestoreIPAddresses extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public ArrayList<String> restoreIpAddresses(String s) {
    ArrayList<String> ips = new ArrayList<String>();
    StringBuffer sb = new StringBuffer();
    restoreIpAddresses(s, 0, ips, sb, 0);
    return ips;
  }

  private void restoreIpAddresses(String s, int i, ArrayList<String> ips,
                                  StringBuffer ip, int step) {
    if ((step >= 4 && i < s.length()) || (step < 4 && i >= s.length())) {
      return;
    }
    if (step >= 4 && i >= s.length()) {
      ips.add(ip.substring(0, ip.length() - 1));
    } else {
      if (s.charAt(i) == '0') {
        ip.append('0');
        ip.append('.');
        restoreIpAddresses(s, i + 1, ips, ip, step + 1);
        ip.deleteCharAt(ip.length() - 1);
        ip.deleteCharAt(ip.length() - 1);
      } else {
        for (int j = 1; j <= 3 && i + j <= s.length(); j++) {
          StringBuffer nextSeg = new StringBuffer();
          nextSeg.append(s.substring(i, i + j));
          int n = Integer.parseInt(nextSeg.toString());
          if (n > 0 && n <= 255) {
            ip.append(nextSeg.toString());
            ip.append('.');
            restoreIpAddresses(s, i + j, ips, ip, step + 1);
            ip.deleteCharAt(ip.length() - 1);
            for (int k = 0; k < nextSeg.length(); k++) {
              ip.deleteCharAt(ip.length() - 1);
            }
          } else {
            break;
          }
        }
      }
    }
  }
}