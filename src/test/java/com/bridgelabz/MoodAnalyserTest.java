package com.bridgelabz;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void moodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String mood = moodAnalyser.analyseMood("This is a sad message");

        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
}
