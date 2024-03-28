package Common;

/**
 * @author
 * @since 10/4/15
 */
public class Priority {

  public Integer Yymmdd;
  public Integer Seq;
  public Category Cat;
  public Integer getDaySeq(){return Yymmdd* 100 + Seq;}
  public Priority(Integer yymmdd, Integer seq, Category cat)
{
  if (yymmdd / 10000 > 40 || yymmdd / 10000 < 1)
    Util.showRed("Incocrrect yymmdd format for yy" + yymmdd / 10000);
  Yymmdd = yymmdd;
  Seq = seq;
  Cat = cat;
}
}
