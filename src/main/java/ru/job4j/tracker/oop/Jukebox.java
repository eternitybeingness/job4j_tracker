package ru.job4j.tracker.oop;

public class Jukebox {
    String ln = System.lineSeparator();
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже" + ln +
                    "Пешеходы по лужам" + ln +
                    "А вода по асфальту рекой." + ln +
                    "И неясно прохожим" + ln +
                    "В этот день непогожий" + ln +
                    "Почему я веселый такой?" + ln +
                    "" + ln +
                    "А я играю на гармошке" + ln +
                    "У прохожих на виду." + ln +
                    "К сожаленью, день рожденья" + ln +
                    "Только раз в году." + ln +
                    "" + ln +
                    "Прилетит вдруг волшебник" + ln +
                    "В голубом вертолете" + ln +
                    "И бесплатно покажет кино." + ln +
                    "С днем рожденья поздравит" + ln +
                    "И, наверно, оставит" + ln +
                    "Мне в подарок пятьсот эскимо." + ln +
                    "" + ln +
                    "А я играю на гармошке" + ln +
                    "У прохожих на виду." + ln +
                    "К сожаленью, день рожденья" + ln +
                    "Только раз в году." + ln);
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят." + ln +
                    "Одеяла и подушки ждут ребят." + ln +
                    "Даже сказка спать ложится," + ln +
                    "Чтобы ночью нам присниться." + ln +
                    "Ты ей пожелай:" + ln +
                    "Баю-бай." + ln +
                    "" + ln +
                    "Обязательно по дому в этот час" + ln +
                    "Тихо-тихо ходит дрёма возле нас." + ln +
                    "За окошком всё темнее," + ln +
                    "Утро ночи мудренее." + ln +
                    "Глазки закрывай," + ln +
                    "Баю-бай." + ln +
                    "" + ln +
                    "В сказке можно покататься на луне" + ln +
                    "И по радуге промчаться на коне," + ln +
                    "Со слоненком подружиться" + ln +
                    "И поймать перо Жар-птицы." + ln +
                    "Глазки закрывай," + ln +
                    "Баю-бай." + ln +
                    "" + ln +
                    "Баю-бай, должны все люди ночью спать." + ln +
                    "Баю-баю, завтра будет день опять." + ln +
                    "За день мы устали очень," + ln +
                    "Скажем всем: \"Спокойной ночи!\"" + ln +
                    "Глазки закрывай," + ln +
                    "Баю-бай." + ln +
                    "" + ln +
                    "Спят усталые игрушки, книжки спят." + ln +
                    "Одеяла и подушки ждут ребят." + ln +
                    "Даже сказка спать ложится," + ln +
                    "Чтобы ночью нам присниться." + ln +
                    "Ты ей пожелай:" + ln +
                    "Баю-бай." + ln +
                    "" + ln +
                    "Обязательно по дому в этот час" + ln +
                    "Источник teksty-pesenok.ru" + ln +
                    "Тихо-тихо ходит дрёма возле нас." + ln +
                    "За окошком всё темнее," + ln +
                    "Утро ночи мудренее." + ln +
                    "Глазки закрывай," + ln +
                    "Баю-бай." + ln +
                    "" + ln +
                    "В сказке можно покататься на луне" + ln +
                    "И по радуге промчаться на коне," + ln +
                    "Со слоненком подружиться" + ln +
                    "И поймать перо Жар-птицы." + ln +
                    "Глазки закрывай," + ln +
                    "Баю-бай." + ln +
                    "" + ln +
                    "Баю-бай, должны все люди ночью спать." + ln +
                    "Баю-баю, завтра будет день опять." + ln +
                    "За день мы устали очень," + ln +
                    "Скажем всем: \"Спокойной ночи!\"" + ln +
                    "Глазки закрывай," + ln +
                    "Баю-бай." + ln);
        } else {
            System.out.println("Песня не найдена");
        }
    }
    public static void main(String[] args) {
        Jukebox juke = new Jukebox();
        juke.music(1);
        juke.music(2);
        juke.music(100);
    }
}
