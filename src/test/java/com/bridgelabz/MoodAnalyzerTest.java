package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;



    public class MoodAnalyzerTest {

        @Test
        public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalysisException {
            MoodAnalyzer moodanalyser = new MoodAnalyzer();
            moodanalyser.setMessage("I am in sad Mood");
            String actualResult = moodanalyser.analyseMood();
            Assert.assertEquals("Sad", actualResult);
        }

        @Test
        public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalysisException {
            MoodAnalyzer moodanalyser = new MoodAnalyzer();
            moodanalyser.setMessage("I am in happy Mood");
            String actualResult = moodanalyser.analyseMood();
            Assert.assertEquals("Happy", actualResult);
        }

        @Test
        public void givenMessage_Null_ShouldReturnMessage() throws MoodAnalysisException {
            MoodAnalyzer moodanalyser = new MoodAnalyzer();
            moodanalyser.setMessage(null);
            try {
                String actualResult = moodanalyser.analyseMood();
                Assert.assertEquals("Entered Invalid Mood ", actualResult);
            } catch (MoodAnalysisException e) {
                e.printStackTrace();
            }
        }
    }