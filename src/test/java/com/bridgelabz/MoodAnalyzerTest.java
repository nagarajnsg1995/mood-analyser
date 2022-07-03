package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyzer moodanalyser = new MoodAnalyzer("I am in Sad Mood");
        String actualResult = moodanalyser.analyseMood();
        Assert.assertEquals("Sad", actualResult);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyzer moodanalyser = new MoodAnalyzer("I am in happy Mood");
        String actualResult = moodanalyser.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }

    @Test
    public void givenMessage_Null_ShouldReturnExceptionHandled() {
        MoodAnalyzer moodanalyser = new MoodAnalyzer(null);
        String actualResult = moodanalyser.analyseMood();
        Assert.assertEquals("Exception Handled", actualResult);
    }
}
