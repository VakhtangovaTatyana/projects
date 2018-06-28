package ru.job.condition;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Привет, Бот."), is("Привет, умник"));
    }
    @Test
    public void whenByuBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Пока"), is("До скорой встречи"));
    }
    @Test
    public void whenUnknown(){
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Просто так"), is("Это ставит меня в тупик. Спросите другой вопрос."));
    }
}
