package tdd.sandbox.com.example.tdddemo;

import org.junit.Assert;
import org.junit.Test;
//TODO added comment for commit
public class TennisCourtScoreTest {

    @Test
    public void two(){
    Assert.assertEquals("00", "love", TennisCourtScore.tennisToString("love"));
    }
}
