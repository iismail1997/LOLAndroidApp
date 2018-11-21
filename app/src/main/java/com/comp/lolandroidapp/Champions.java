package com.comp.lolandroidapp;

import java.util.HashMap;

public class Champions {

    static HashMap<Integer, String> championIdtoName = new HashMap<>();
    // works in static context if outside of main
    static {
        championIdtoName.put(1, "Annie");
        championIdtoName.put(2, "Olaf");
        championIdtoName.put(3, "Galio");
        championIdtoName.put(4, "TwistedFate");
        championIdtoName.put(5, "XinZhao");
        championIdtoName.put(6, "Urgot");
        championIdtoName.put(7, "Leblanc");
        championIdtoName.put(8, "Vladimir");
        championIdtoName.put(9, "Fiddlesticks");
        championIdtoName.put(10, "Kayle");
        championIdtoName.put(11, "MasterYi");
        championIdtoName.put(12, "Alistar");
        championIdtoName.put(13, "Ryze");
        championIdtoName.put(14, "Sion");
        championIdtoName.put(15, "Sivir");
        championIdtoName.put(16, "Soraka");
        championIdtoName.put(17, "Teemo");
        championIdtoName.put(18, "Tristana");
        championIdtoName.put(19, "Warwick");
        championIdtoName.put(20, "Nunu");
        championIdtoName.put(21, "MissFortune");
        championIdtoName.put(22, "Ashe");
        championIdtoName.put(23, "Tryndamere");
        championIdtoName.put(24, "Jax");
        championIdtoName.put(25, "Morgana");
        championIdtoName.put(26, "Zilean");
        championIdtoName.put(27, "Singed");
        championIdtoName.put(28, "Evelynn");
        championIdtoName.put(29, "Twitch");
        championIdtoName.put(30, "Karthus");
        championIdtoName.put(31, "Chogath");
        championIdtoName.put(32, "Amumu");
        championIdtoName.put(33, "Rammus");
        championIdtoName.put(34, "Anivia");
        championIdtoName.put(35, "Shaco");
        championIdtoName.put(36, "DrMundo");
        championIdtoName.put(37, "Sona");
        championIdtoName.put(38, "Kassadin");
        championIdtoName.put(39, "Irelia");
        championIdtoName.put(40, "Janna");
        championIdtoName.put(41, "Gangplank");
        championIdtoName.put(42, "Corki");
        championIdtoName.put(43, "Karma");
        championIdtoName.put(44, "Taric");
        championIdtoName.put(45, "Veigar");
        championIdtoName.put(48, "Trundle");
        championIdtoName.put(50, "Swain");
        championIdtoName.put(51, "Caitlyn");
        championIdtoName.put(53, "Blitzcrank");
        championIdtoName.put(54, "Malphite");
        championIdtoName.put(55, "Katarina");
        championIdtoName.put(56, "Nocturne");
        championIdtoName.put(57, "Maokai");
        championIdtoName.put(58, "Renekton");
        championIdtoName.put(59, "JarvanIV");
        championIdtoName.put(60, "Elise");
        championIdtoName.put(61, "Orianna");
        championIdtoName.put(62, "MonkeyKing");
        championIdtoName.put(63, "Brand");
        championIdtoName.put(64, "LeeSin");
        championIdtoName.put(67, "Vayne");
        championIdtoName.put(68, "Rumble");
        championIdtoName.put(69, "Cassiopeia");
        championIdtoName.put(72, "Skarner");
        championIdtoName.put(74, "Heimerdinger");
        championIdtoName.put(75, "Nasus");
        championIdtoName.put(76, "Nidalee");
        championIdtoName.put(77, "Udyr");
        championIdtoName.put(78, "Poppy");
        championIdtoName.put(79, "Gragas");
        championIdtoName.put(80, "Pantheon");
        championIdtoName.put(81, "Ezreal");
        championIdtoName.put(82, "Mordekaiser");
        championIdtoName.put(83, "Yorick");
        championIdtoName.put(84, "Akali");
        championIdtoName.put(85, "Kennen");
        championIdtoName.put(86, "Garen");
        championIdtoName.put(89, "Leona");
        championIdtoName.put(90, "Malzahar");
        championIdtoName.put(91, "Talon");
        championIdtoName.put(92, "Riven");
        championIdtoName.put(96, "KogMaw");
        championIdtoName.put(98, "Shen");
        championIdtoName.put(99, "Lux");
        championIdtoName.put(101, "Xerath");
        championIdtoName.put(102, "Shyvana");
        championIdtoName.put(103, "Ahri");
        championIdtoName.put(104, "Graves");
        championIdtoName.put(105, "Fizz");
        championIdtoName.put(106, "Volibear");
        championIdtoName.put(107, "Rengar");
        championIdtoName.put(110, "Varus");
        championIdtoName.put(111, "Nautilus");
        championIdtoName.put(112, "Viktor");
        championIdtoName.put(113, "Sejuani");
        championIdtoName.put(114, "Fiora");
        championIdtoName.put(115, "Ziggs");
        championIdtoName.put(117, "Lulu");
        championIdtoName.put(119, "Draven");
        championIdtoName.put(120, "Hecarim");
        championIdtoName.put(121, "Khazix");
        championIdtoName.put(122, "Darius");
        championIdtoName.put(126, "Jayce");
        championIdtoName.put(127, "Lissandra");
        championIdtoName.put(131, "Diana");
        championIdtoName.put(133, "Quinn");
        championIdtoName.put(134, "Syndra");
        championIdtoName.put(136, "AurelionSol");
        championIdtoName.put(141, "Kayn");
        championIdtoName.put(142, "Zoe");
        championIdtoName.put(143, "Zyra");
        championIdtoName.put(145, "Kaisa");
        championIdtoName.put(150, "Gnar");
        championIdtoName.put(154, "Zac");
        championIdtoName.put(157, "Yasuo");
        championIdtoName.put(161, "Velkoz");
        championIdtoName.put(163, "Taliyah");
        championIdtoName.put(164, "Camille");
        championIdtoName.put(201, "Braum");
        championIdtoName.put(202, "Jhin");
        championIdtoName.put(203, "Kindred");
        championIdtoName.put(222, "Jinx");
        championIdtoName.put(223, "TahmKench");
        championIdtoName.put(236, "Lucian");
        championIdtoName.put(238, "Zed");
        championIdtoName.put(240, "Kled");
        championIdtoName.put(245, "Ekko");
        championIdtoName.put(254, "Vi");
        championIdtoName.put(266, "Aatrox");
        championIdtoName.put(267, "Nami");
        championIdtoName.put(268, "Azir");
        championIdtoName.put(412, "Thresh");
        championIdtoName.put(420, "Illaoi");
        championIdtoName.put(421, "RekSai");
        championIdtoName.put(427, "Ivern");
        championIdtoName.put(429, "Kalista");
        championIdtoName.put(432, "Bard");
        championIdtoName.put(497, "Rakan");
        championIdtoName.put(498, "Xayah");
        championIdtoName.put(516, "Ornn");
        championIdtoName.put(555, "Pyke");

    }

}
