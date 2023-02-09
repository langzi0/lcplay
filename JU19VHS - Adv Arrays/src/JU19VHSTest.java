import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

@Timeout(3)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class JU19VHSTest
{

  @Test
  void test01dumpNamesForReg1()
  {
    String[] words = {"Grace", "Ada"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("Start:<Grace><Ada>:Finish", JU19VHS.dumpNamesForReg(words));
    });
  }

  @Test
  void test01dumpNamesForReg2()
  {
    String[] words = {"Elvis", "Paul", "Mariah", "Michael"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("Start:<Elvis><Paul><Mariah><Michael>:Finish",
                   JU19VHS.dumpNamesForReg(words));
    });
  }

  @Test
  void test01dumpNamesForReg3()
  {
    String[] words = {"Sarah", "Kim", "Amy", "Jenn", "Jane"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("Start:<Sarah><Kim><Amy><Jenn><Jane>:Finish",
                   JU19VHS.dumpNamesForReg(words));
    });
  }

  @Test
  void test02dumpNamesForEach1()
  {
    String[] words = {"Grace", "Ada"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("Start:<Grace><Ada>:Finish",
                   JU19VHS.dumpNamesForEach(words));
    });
  }

  @Test
  void test02dumpNamesForEach2()
  {
    String[] words = {"Elvis", "Paul", "Mariah", "Michael"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("Start:<Elvis><Paul><Mariah><Michael>:Finish",
                   JU19VHS.dumpNamesForEach(words));
    });
  }

  @Test
  void test02dumpNamesForEach3()
  {
    String[] words = {"Sarah", "Kim", "Amy", "Jenn", "Jane"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("Start:<Sarah><Kim><Amy><Jenn><Jane>:Finish",
                   JU19VHS.dumpNamesForEach(words));
    });
  }

  @Test
  void test03tally42sForReg1()
  {
    int[] numbers = {9, 42, 42, 42, 42, 8};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(4, JU19VHS.tally42sForReg(numbers));
    });
  }

  @Test
  void test03tally42sForReg2()
  {
    int[] numbers = {42, 0, 0, 42, 1};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(2, JU19VHS.tally42sForReg(numbers));
    });
  }

  @Test
  void test03tally42sForReg3()
  {
    int[] numbers = {42, 0, 0, 42, 1, 7, 9, -4, 42, 7, 42, 42, 42, 9, 42};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(7, JU19VHS.tally42sForReg(numbers));
    });
  }

  @Test
  void test04tally42sForEach1()
  {
    int[] numbers = {9, 42, 42, 42, 42, 8};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(4, JU19VHS.tally42sForEach(numbers));
    });
  }

  @Test
  void test04tally42sForEach2()
  {
    int[] numbers = {42, 0, 0, 42, 1};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(2, JU19VHS.tally42sForEach(numbers));
    });
  }

  @Test
  void test04tally42sForEach3()
  {
    int[] numbers = {42, 0, 0, 42, 1, 7, 9, -4, 42, 7, 42, 42, 42, 9, 42};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(7, JU19VHS.tally42sForEach(numbers));
    });
  }

  @Test
  void test05SpellCheck1()
  {
    String[] oxford =
      {"the", "of", "and", "a", "to", "in", "is", "you", "that", "it", "he",
       "was", "for", "on", "are", "as", "with", "his", "they", "I", "at", "be",
       "this", "have", "from", "or", "one", "had", "by", "word", "but", "not",
       "what", "all", "were", "we", "when", "your", "can", "said", "there",
       "use", "an", "each", "which", "she", "do", "how", "their", "if", "will",
       "up", "other", "about", "out", "many", "then", "them", "these", "so",
       "some", "her", "would", "make", "like", "him", "into", "time", "has",
       "look", "two", "more", "write", "go", "see", "number", "no", "way",
       "could", "people", "my", "than", "first", "water", "been", "call", "who",
       "oil", "its", "now", "find", "long", "down", "day", "did", "get", "come",
       "made", "may", "cat", "dog", "cats", "dogs"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertTrue(JU19VHS.spellCheck(oxford, new String("the")));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertFalse(JU19VHS.spellCheck(oxford, new String("teh")));
    });
  }

  @Test
  void test05SpellCheck2()
  {
    String[] oxford =
      {"the", "of", "and", "a", "to", "in", "is", "you", "that", "it", "he",
       "was", "for", "on", "are", "as", "with", "his", "they", "I", "at", "be",
       "this", "have", "from", "or", "one", "had", "by", "word", "but", "not",
       "what", "all", "were", "we", "when", "your", "can", "said", "there",
       "use", "an", "each", "which", "she", "do", "how", "their", "if", "will",
       "up", "other", "about", "out", "many", "then", "them", "these", "so",
       "some", "her", "would", "make", "like", "him", "into", "time", "has",
       "look", "two", "more", "write", "go", "see", "number", "no", "way",
       "could", "people", "my", "than", "first", "water", "been", "call", "who",
       "oil", "its", "now", "find", "long", "down", "day", "did", "get", "come",
       "made", "may", "cat", "dog", "cats", "dogs"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertTrue(JU19VHS.spellCheck(oxford, new String("number")));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertFalse(JU19VHS.spellCheck(oxford, new String("nummber")));
    });
  }

  @Test
  void test05SpellCheck3()
  {
    String[] oxford =
      {"the", "of", "and", "a", "to", "in", "is", "you", "that", "it", "he",
       "was", "for", "on", "are", "as", "with", "his", "they", "I", "at", "be",
       "this", "have", "from", "or", "one", "had", "by", "word", "but", "not",
       "what", "all", "were", "we", "when", "your", "can", "said", "there",
       "use", "an", "each", "which", "she", "do", "how", "their", "if", "will",
       "up", "other", "about", "out", "many", "then", "them", "these", "so",
       "some", "her", "would", "make", "like", "him", "into", "time", "has",
       "look", "two", "more", "write", "go", "see", "number", "no", "way",
       "could", "people", "my", "than", "first", "water", "been", "call", "who",
       "oil", "its", "now", "find", "long", "down", "day", "did", "get", "come",
       "made", "may", "cat", "dog", "cats", "dogs"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertTrue(JU19VHS.spellCheck(oxford, new String("dogs")));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertFalse(JU19VHS.spellCheck(oxford, new String("dogss")));
    });
  }

  @Test
  void test05SpellCheck4()
  {
    String[] oxford = new String[100];
    oxford[4] = "number";
    oxford[88] = "water";
    oxford[40] = "dogs";
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertTrue(JU19VHS.spellCheck(oxford, new String("dogs")));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertFalse(JU19VHS.spellCheck(oxford, new String("dogss")));
    });
  }

  @Test
  void test05SpellCheck5()
  {
    String[] oxford = new String[100];
    oxford[8] = "cat";
    oxford[2] = "water";
    oxford[47] = "dogs";
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertTrue(JU19VHS.spellCheck(oxford, new String("cat")));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertFalse(JU19VHS.spellCheck(oxford, new String("cta")));
    });
  }

  @Test
  void test06countTheIngs1()
  {
    String[] words = {"ing", "fencng", "dancing", "running", "leapin"};
    assertTimeoutPreemptively(Duration.ofSeconds(30000), () -> {
      assertEquals(2, JU19VHS.countTheIngs(words));
    });
  }

  @Test
  void test06countTheIngs2()
  {
    String[] words =
      {"ng", "fencng", "dancing", "running", "leapin", "writing"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(3, JU19VHS.countTheIngs(words));
    });
  }

  @Test
  void test06countTheIngs3()
  {
    String[] words =
      {"ng", "fencng", "c", "running", "leapin", "writing", "ab", "f", "ing",
       "listening"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(3, JU19VHS.countTheIngs(words));
    });
  }

  @Test
  void test06countTheIngs4()
  {
    String[] words =
      {"ng", "fencng", "c", "runnig", "leapin", "writin", "ab", "f", "ingg",
       "listenng"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(0, JU19VHS.countTheIngs(words));
    });
  }

  @Test
  void test07ShiftThemToTheRight1()
  {
    int[] nums = {6, 2, 1, 7, 12, 5};
    JU19VHS.shiftThemToTheRight(nums);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[5, 6, 2, 1, 7, 12]", Arrays.toString(nums));
    });
  }

  @Test
  void test07ShiftThemToTheRight2()
  {
    int[] nums = {42, 8, 0, -5, 3, 22, 7, 99, 91, 8, 2};
    JU19VHS.shiftThemToTheRight(nums);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[2, 42, 8, 0, -5, 3, 22, 7, 99, 91, 8]",
                   Arrays.toString(nums));
    });
  }

  @Test
  void test07ShiftThemToTheRight3()
  {
    int[] nums = {87};
    JU19VHS.shiftThemToTheRight(nums);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[87]", Arrays.toString(nums));
    });
  }

  @Test
  void test07ShiftThemToTheRight4()
  {
    int[] nums = {1, 2, 3};
    JU19VHS.shiftThemToTheRight(nums);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[3, 1, 2]", Arrays.toString(nums));
    });
  }

  @Test
  void test08CreateArrayOfWholeNumbers1()
  {
    int[] wholeNumbers = JU19VHS.createArrayOfWholeNumbers(5);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[0, 1, 2, 3, 4, 5]", Arrays.toString(wholeNumbers));
    });
  }

  @Test
  void test08CreateArrayOfWholeNumbers2()
  {
    int[] wholeNumbers = JU19VHS.createArrayOfWholeNumbers(20);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]",
                   Arrays.toString(wholeNumbers));
    });
  }

  @Test
  void test08CreateArrayOfWholeNumbers3()
  {
    int[] wholeNumbers = JU19VHS.createArrayOfWholeNumbers(13);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]",
                   Arrays.toString(wholeNumbers));
    });
  }

  @Test
  void test09AppendArrays1()
  {
    int[] myArray = {1, 5, 6};
    int[] yourArray = {2, 3, 4, 5};
    int[] actual = JU19VHS.appendArrays(myArray, yourArray);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[1, 5, 6, 2, 3, 4, 5]", Arrays.toString(actual));

    });
  }

  @Test
  void test09AppendArrays2()
  {
    int[] myArray = {1, 5, 6, 10, 43, 32};
    int[] yourArray = {2};
    int[] actual = JU19VHS.appendArrays(myArray, yourArray);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[1, 5, 6, 10, 43, 32, 2]", Arrays.toString(actual));
    });
  }

  @Test
  void test09AppendArrays3()
  {
    int[] myArray = {1, 5, 6, 10, 43, 32};
    int[] yourArray = {2, 3, 4, 9, 10, 44};
    int[] actual = JU19VHS.appendArrays(myArray, yourArray);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[1, 5, 6, 10, 43, 32, 2, 3, 4, 9, 10, 44]",
                   Arrays.toString(actual));
    });
  }

  @Test
  void test10fourSame1()
  {
    int[] nums1 = {42, 42, 42, 42};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertTrue(JU19VHS.fourSame(nums1));
    });
    int[] nums2 = {42, 42, 7, 42};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertFalse(JU19VHS.fourSame(nums2));
    });
  }

  @Test
  void test10fourSame2()
  {
    int[] nums1 = {8, 8, 8, 8, 3};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertTrue(JU19VHS.fourSame(nums1));
    });
    int[] nums2 = {8, 8, 8, 2, 3, 8, 8, 8, 3};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertFalse(JU19VHS.fourSame(nums2));
    });
  }

  @Test
  void test10fourSame3()
  {
    int[] nums1 = {33, 2, 2, 3, 8, 8, 8, 8};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertTrue(JU19VHS.fourSame(nums1));
    });
    int[] nums2 = {33, 2, 2, 3, 8, 8, 5, 8};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertFalse(JU19VHS.fourSame(nums2));
    });
  }

  @Test
  void test10IsConsecutiveFour4()
  {
    int[] nums1 = {33, 2, 2, 3, 3, 3, 3, 9, 9, 9};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertTrue(JU19VHS.fourSame(nums1));
    });
    int[] nums2 = {33, 2, 2, 3, 3, 0, 3, 9, 9, 9};

    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertFalse(JU19VHS.fourSame(nums2));
    });
  }

  @Test
  void test11switchEm1()
  {
    int[] original = {20, 10, 5, 90, 7};
    JU19VHS.switchEm(original, 0, 2);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[5, 10, 20, 90, 7]", Arrays.toString(original));
    });
  }

  @Test
  void test11switchEm2()
  {
    int[] original = {1, 2, 3, 19, 30, 50};
    JU19VHS.switchEm(original, 5, 6);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[1, 2, 3, 19, 30, 50]", Arrays.toString(original));
    });
    int[] check = {5, 2};
    JU19VHS.switchEm(check, 0, 1);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[2, 5]", Arrays.toString(check));
    });
  }

  @Test
  void test11switchEm3()
  {
    int[] original = {100, 2, 3, 19, 30, 50, 88, 66};
    JU19VHS.switchEm(original, 3, 6);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[100, 2, 3, 88, 30, 50, 19, 66]",
                   Arrays.toString(original));
    });
  }

  @Test
  void test11switchEm4()
  {
    int[] original1 = {100, 2, 3, 19, 30, 50, 88, 66};
    JU19VHS.switchEm(original1, -1, -8);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[100, 2, 3, 19, 30, 50, 88, 66]",
                   Arrays.toString(original1));
    });
    int[] original2 = {100, 2, 3, 19, 30, 50, 88, 66, 9};
    JU19VHS.switchEm(original2, 8, 7);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[100, 2, 3, 19, 30, 50, 88, 9, 66]",
                   Arrays.toString(original2));
    });
  }

  @Test
  void test12gimmeBig1()
  {
    int[] arr = {20, 10, 5, 90, 7};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("For the array [20, 10, 5, 90, 7], the largest value 90 can be found at index 3",
                   JU19VHS.gimmeBig(arr));
    });
  }

  @Test
  void test12gimmeBig2()
  {
    int[] arr = {5, 3, 2, 1, -4, -9, -100};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("For the array [5, 3, 2, 1, -4, -9, -100], the largest value 5 can be found at index 0",
                   JU19VHS.gimmeBig(arr));
    });
  }

  @Test
  void test12gimmeBig3()
  {
    int[] arr = {5, 3, 2, 43, -4, -9, -100};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("For the array [5, 3, 2, 43, -4, -9, -100], the largest value 43 can be found at index 3",
                   JU19VHS.gimmeBig(arr));
    });
  }

  @Test
  void test12gimmeBig4()
  {
    int[] arr = {43};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("For the array [43], the largest value 43 can be found at index 0",
                   JU19VHS.gimmeBig(arr));
    });
  }

  @Test
  void test12gimmeBig5()
  {
    int[] arr = {12, 4, 99, 100, 8, 102};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("For the array [12, 4, 99, 100, 8, 102], the largest value 102 can be found at index 5",
                   JU19VHS.gimmeBig(arr));
    });
  }

  @Test
  void test13mostPopular1()
  {
    String[] arr = {"Lisa", "Lisa", "Lisa", "Grace", "Lisa", "Grace", "Grace"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("The most popular name was Lisa with 4 occurances.",
                   JU19VHS.mostPopular(arr));
    });
  }

  @Test
  void test13mostPopular2()
  {
    String[] arr =
      {"Grace", "Lisa", "Grace", "Lisa", "Grace", "Lisa", "Grace",
       new String("Grace")};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("The most popular name was Grace with 5 occurances.",
                   JU19VHS.mostPopular(arr));
    });
  }

  @Test
  void test13mostPopular3()
  {
    String[] arr = {"Bill", "Steve", "Grace"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("No name occured more than once.", JU19VHS.mostPopular(arr));
    });
  }

  @Test
  void test13mostPopular4()
  {
    String[] arr =
      {"Bill", "Steve", "Grace", "Bill", "Steve", "Grace", "Bill", "Bill",
       "Grace", new String("Bill"), "Steve", "Grace"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("The most popular name was Bill with 5 occurances.",
                   JU19VHS.mostPopular(arr));
    });
  }

  @Test
  void test13mostPopular5()
  {
    String[] arr =
      {"Bill", "Steve", "Grace", "Bill", new String("Steve"), "Grace", "Bill",
       "Bill", "Grace", "Bill", "Steve", "Grace", "Steve", "Steve", "Steve"};
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("The most popular name was Steve with 6 occurances.",
                   JU19VHS.mostPopular(arr));
    });
  }

  // Copyright VHSLearning.org 2022+

}