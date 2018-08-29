package test.java.strings;

import static org.junit.Assert.assertEquals;

import main.java.strings.StringsProblems;
import org.junit.Before;
import org.junit.Test;

public class StringsProblemsTest {

  private StringsProblems stringsProblems;

  @Before
  public void setUp() {
    stringsProblems = new StringsProblems();
  }

  @Test
  public void number_of_pattern_occurance() {
    String pattern = "dna";
    String text = "gtasfb badadnas dn - gdnadna";
    int occurance = stringsProblems.findNumberOfPatternOccuranceInGivetText(pattern, text);
    assertEquals(3, occurance);
  }

}