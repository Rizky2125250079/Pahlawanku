package com.if3a.pahlawanku;

import java.util.ArrayList;

public class DataPahlawan {
    public static String[][] data = new String[][]{
            {"Balmond",
                    "Balmond is the leader of the Orcs, leading the Orc army against the invasion of the Demons. During a battle, he consumed the blood of a Blood Demon and went into a rage. This aroused Alice's interest, so she signed a contract with Balmond on the condition of returning the Stormeye Wasteland. Balmond, and his Orc army have since fought for the Demons.",
                    "https://static.wikia.nocookie.net/mobile-legends/images/c/c4/Hero021-portrait.png/revision/latest?cb=20220525164249"},

            {"Gusion",
                    "Although he was born into the most powerful magic family on the continent, Gusion is not interested in magic. He is keen to draw inspiration from the holy light to develop new fighting skills. In the end, Gusion left the family",
                    "https://static.wikia.nocookie.net/mobile-legends/images/a/a2/Hero561-portrait.png/revision/latest?cb=20220909095407"},
            {"Yu Zhong",
                    "A reincarnation of the Black Dragon, but Yu Zhong had no memory of the Black Dragon at first. After the Great Dragon accepted him as an apprentice, Yu Zhong went to the Land of Dawn in search of adventure where he met Luo Yi and was awakened by her. After that Yu Zhong rushed into the Forbidden Area to get back the reverse scale [belonging] to the Black Dragon and became the complete Black Dragon.",
                    "https://static.wikia.nocookie.net/mobile-legends/images/1/10/Hero951-portrait.png/revision/latest?cb=20220525170233"},
            {"Gatotkaca",
                    "Gatotkaca \"The Man of Steel\" was the son of Bima and Arimbi from the Arcapada universe. Since his childhood, Gatotkaca has been a champion of Gods, fighting vicious enemies in his homeland. Once lost and beaten near death, Gatotkaca rose as a mighty warrior from the Pandava clan who possessed supernatural powers, which he had recieved from the ultimate training inside the cauldron of heaven, Candradimuka. With his Antakusuma armor and Brajamusti-Brajadenta twin gauntlet, he can sore across the skies like lightning and hunt down his enemies, the furious Ashuras, and their king, Martis Martis. Gatotkaca, the Knight of Priggadani, has ever since been a symbol of bravery and devotion.",
                    "https://static.wikia.nocookie.net/mobile-legends/images/3/3a/Mighty_Legend.jpg/revision/latest?cb=20171018094109"},
            {"Irihel",
                    "A jungle orphan raised by a smilodon, was rescued by Leonin Nana when she was almost caught by a human slave trader. With the help of Nana, she learned the human language and fighting skills, but she still didn't trust humans and only trusted her friend, a little tiger named Leo.",
                    "https://static.wikia.nocookie.net/mobile-legends/images/b/b8/Hero431-portrait.png/revision/latest?cb=20220525165209"},
            {"Alucard",
                    "Alucard's father was a comrade-in-arms of Tigreal who disappeared in a battle with the Demons. Therefor, he hated darkness, joined the Monastery of Light, and swore to destory all Demons. But later he learned the hidden secrets of this battle, so he left the Monastery of Light in anger and fought the darkness in his own way.",
                    "https://static.wikia.nocookie.net/mobile-legends/images/0/01/Hero071-portrait.png/revision/latest?cb=20220525164426"},
            {"Argus",
                    "Argus and Rafaela are a pair of twin angels. Yet the angels of legend are all female, making Argus something of an outcast. While the Monastery of Light utilizes his powers to eradicate all heresy, it's never even acknowledged his existence. While Argus despises humankind, holding it in the utmost disdain, he once came into possession of a demonic blade in the midst of a battle and at that moment realized that he too was a son of man. That he was orphaned when his parents were slain by other humans. Under the demonic blade's curse he was overcome by resentment, falling into a demonic state himself as he became the Dark Angel.",
                    "https://static.wikia.nocookie.net/mobile-legends/images/a/ac/Hero451-portrait.png/revision/latest?cb=20220525165226"},
            {"Rafaela",
                    "Rafaela and her elder brother Argus are both angels, but Argus was treated differently because of his status as a male target. All praise was given to Rafaela, and all criticism was left to Argus. After a series of events that were left to ferment, rifts appeared in the relationship between the two siblings. Argus finally fell into the Abyss, but was helpless to do anything about. She is an angel whom people admire, but her elder brother continues to perish in pain.",
                    "https://static.wikia.nocookie.net/mobile-legends/images/d/d0/Hero141-portrait.png/revision/latest?cb=20220525164605"},
            {"Fredrinn",
                    "Born the son of Duke Vance, Fredrinn grew up into a gifted adventurer, but also the notorious 'money-grubber' in Los Pecados. The crystal in his chest had long merged with his heart. The terrifying scar would never fade, and Fredrinn never bothered to conceal it. All he had in mind was his search for his lost friend....",
                    "https://static.wikia.nocookie.net/mobile-legends/images/7/78/Hero1171-portrait.png/revision/latest?cb=20220630130119"},
            {"Benedetta",
                    "After the rise of the Abyss, the land became plagued and the entire southern part of the Land of Dawn turned into a barren wasteland. Even though, the high ranged Lantis Mountain blocks the corruption of the Abyss, the Mother Nature in the southern realm continues to wither away. This once prosperous land is now nothing but a silent place filled with doom and death. People call it the Despair Place.",
                    "https://static.wikia.nocookie.net/mobile-legends/images/5/5d/Shadow_Ranger.jpg/revision/latest?cb=20210616160805"
            },
    };
    public static ArrayList<ModePahlawan> ambilDataPahlawan() {
        ArrayList<ModePahlawan> dataPahlawan = new ArrayList<>();
        for (String[] varData : data)
        {
            ModePahlawan model = new ModePahlawan();
            model.setNama((varData[0]));
            model.setTentang(varData[1]);
            model.setFoto(varData[2]);

            dataPahlawan.add(model);
        }
        return dataPahlawan;
    }
}
