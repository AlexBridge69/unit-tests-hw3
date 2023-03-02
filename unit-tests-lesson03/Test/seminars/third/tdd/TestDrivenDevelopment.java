package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestDrivenDevelopment {

    /**
     * Нужно написать (TDD) класс MoodAnalyser, который оценивает фразы по настроению
     */
    @Test
    void testMoodAnalysisHappy() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String str="хорошее настроение";
        assertThat(moodAnalyser.analyze(str)).isEqualTo("happy");
    }

    @Test
    void testMoodAnalysisSad() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String str="плохое настроение";
        assertThat(moodAnalyser.analyze(str)).isEqualTo("sad");
    }

    @Test
    void testMoodAnalysisSoSo() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String str="нейтральное настроение";
        assertThat(moodAnalyser.analyze(str)).isEqualTo("so so");
    }
}