package ru.job4j.tracker;

import ru.job4j.tracker.oop.Student;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже\n" +
                    "Пешеходы по лужам,\n" +
                    "А вода по асфальту рекой.\n" +
                    "И неясно прохожим\n" +
                    "В этот день непогожий,\n" +
                    "Почему я веселый такой?\n" +
                    "\n" +
                    "А я играю на гармошке\n" +
                    "У прохожих на виду.\n" +
                    "К сожаленью, день рожденья\n" +
                    "Только раз в году.\n" +
                    "\n" +
                    "Прилетит вдруг волшебник\n" +
                    "В голубом вертолете\n" +
                    "И бесплатно покажет кино.\n" +
                    "С днем рожденья поздравит\n" +
                    "И, наверно, оставит\n" +
                    "Мне в подарок пятьсот эскимо.\n" +
                    "\n" +
                    "А я играю на гармошке\n" +
                    "У прохожих на виду.\n" +
                    "К сожаленью, день рожденья\n" +
                    "Только раз в году.\n");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят.\n" +
                    "Одеяла и подушки ждут ребят.\n" +
                    "Даже сказка спать ложится,\n" +
                    "Чтобы ночью нам присниться.\n" +
                    "Ты ей пожелай:\n" +
                    "Баю-бай.\n" +
                    "\n" +
                    "Обязательно по дому в этот час\n" +
                    "Тихо-тихо ходит дрёма возле нас.\n" +
                    "За окошком всё темнее,\n" +
                    "Утро ночи мудренее.\n" +
                    "Глазки закрывай,\n" +
                    "Баю-бай.\n" +
                    "\n" +
                    "В сказке можно покататься на луне\n" +
                    "И по радуге промчаться на коне,\n" +
                    "Со слоненком подружиться\n" +
                    "И поймать перо Жар-птицы.\n" +
                    "Глазки закрывай,\n" +
                    "Баю-бай.\n" +
                    "\n" +
                    "Баю-бай, должны все люди ночью спать.\n" +
                    "Баю-баю, завтра будет день опять.\n" +
                    "За день мы устали очень,\n" +
                    "Скажем всем: \"Спокойной ночи!\"\n" +
                    "Глазки закрывай,\n" +
                    "Баю-бай.\n" +
                    "\n" +
                    "Спят усталые игрушки, книжки спят.\n" +
                    "Одеяла и подушки ждут ребят.\n" +
                    "Даже сказка спать ложится,\n" +
                    "Чтобы ночью нам присниться.\n" +
                    "Ты ей пожелай:\n" +
                    "Баю-бай.\n" +
                    "\n" +
                    "Обязательно по дому в этот час\n" +
                    "Источник teksty-pesenok.ru\n" +
                    "Тихо-тихо ходит дрёма возле нас.\n" +
                    "За окошком всё темнее,\n" +
                    "Утро ночи мудренее.\n" +
                    "Глазки закрывай,\n" +
                    "Баю-бай.\n" +
                    "\n" +
                    "В сказке можно покататься на луне\n" +
                    "И по радуге промчаться на коне,\n" +
                    "Со слоненком подружиться\n" +
                    "И поймать перо Жар-птицы.\n" +
                    "Глазки закрывай,\n" +
                    "Баю-бай.\n" +
                    "\n" +
                    "Баю-бай, должны все люди ночью спать.\n" +
                    "Баю-баю, завтра будет день опять.\n" +
                    "За день мы устали очень,\n" +
                    "Скажем всем: \"Спокойной ночи!\"\n" +
                    "Глазки закрывай,\n" +
                    "Баю-бай.\n");
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
