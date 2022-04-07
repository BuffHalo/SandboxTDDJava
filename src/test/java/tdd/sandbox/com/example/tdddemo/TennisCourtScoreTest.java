package tdd.sandbox.com.example.tdddemo;

import org.junit.Assert;
import org.junit.Test;
//TODO added comment for commit

public class TennisCourtScoreTest {

    @Test
    public void two(){
    Assert.assertEquals("0-0", "Love All", TennisCourtScore.getScore("0-0"));
    Assert.assertEquals("1-0", "15-0", TennisCourtScore.getScore("1-0"));
    Assert.assertEquals("1-1", "15-15", TennisCourtScore.getScore("1-1"));
    }
}
