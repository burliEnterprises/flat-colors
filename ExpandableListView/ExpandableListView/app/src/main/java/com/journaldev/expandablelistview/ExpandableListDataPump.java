package com.journaldev.expandablelistview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class ExpandableListDataPump {
    public static TreeMap<String, List<String>> getData() {
        TreeMap<String, List<String>> expandableListDetail = new TreeMap<>();


        // DIESE KLASSE WIRD NICTH MEHR BENÖTIGT, IST NUR ZU EIGENEN INFO ZWECKEN!!!!!!

        // QUELLE: http://www.flatcolorsui.com/
        List<String> red = new ArrayList<String>();
        red.add("#FFCCBC");
        red.add("#FFAC9C");
        red.add("#FF8C7C");
        red.add("#FF7C6C");
        red.add("#FF6C5C");
        red.add("#F75C4C");
        red.add("#E74C3C");
        red.add("#D73C2C");
        red.add("#C72C1C");
        red.add("#B71C0C");
        red.add("#A70C00");
        red.add("#870000");

        List<String> blue = new ArrayList<String>();
        blue.add("#39d5ff");
        blue.add("#29c5ff");
        blue.add("#19B5FE");
        blue.add("#22A7F0");
        blue.add("#1297e0");
        blue.add("#0287d0");
        blue.add("#0077c0");
        blue.add("#0067b0");
        blue.add("#0057a0");
        blue.add("#004790");
        blue.add("#003780");
        blue.add("#102770");

        List<String> green = new ArrayList<String>();
        green.add("#8effc1");
        green.add("#5efca1");
        green.add("#4eec91");
        green.add("#3edc81");
        green.add("#2ecc71");
        green.add("#1ebc61");
        green.add("#0eac51");
        green.add("#009c41");
        green.add("#008c31");
        green.add("#007c21");
        green.add("#006c11");
        green.add("#005c01");

        List<String> yellow = new ArrayList<String>();
        yellow.add("#FDE3A7");
        yellow.add("#ffcf4b");
        yellow.add("#F9BF3B");
        yellow.add("#f9b32f");
        yellow.add("#F5AB35");
        yellow.add("#F39C12");
        yellow.add("#f1892d");
        yellow.add("#e67e22");
        yellow.add("#d87400");
        yellow.add("#c86400");
        yellow.add("#b85400");
        yellow.add("#a84410");

        List<String> purple = new ArrayList<String>();
        purple.add("#DCC6E0");
        purple.add("#cea0e4");
        purple.add("#BE90D4");
        purple.add("#ab69c6");
        purple.add("#9b59b6");
        purple.add("#8E44AD");
        purple.add("#7e349d");
        purple.add("#6e248d");
        purple.add("#5e147d");
        purple.add("#4e046d");
        purple.add("#3e005d");
        purple.add("#1e003d");

        List<String> pink = new ArrayList<String>();
        pink.add("#ffbcd8");
        pink.add("#ff8cc8");
        pink.add("#ff7cb8");
        pink.add("#ff6ca8");
        pink.add("#fa5c98");
        pink.add("#ea4c88");
        pink.add("#da3c78");
        pink.add("#ca2c68");
        pink.add("#ba1c58");
        pink.add("#aa0c48");
        pink.add("#9a0038");
        pink.add("#8a0028");

        List<String> cyan = new ArrayList<String>();
        cyan.add("#5efaf7");
        cyan.add("#51f5ea");
        cyan.add("#47ebe0");
        cyan.add("#37dbd0");
        cyan.add("#27cbc0");
        cyan.add("#17bbb0");
        cyan.add("#07aba0");
        cyan.add("#009b90");
        cyan.add("#008b80");
        cyan.add("#007b70");
        cyan.add("#106b60");
        cyan.add("#005b50");

        List<String> brown = new ArrayList<String>();
        brown.add("#f6c4a3");
        brown.add("#eab897");
        brown.add("#dfad8c");
        brown.add("#d4a281");
        brown.add("#ce9c7b");
        brown.add("#be8c6b");
        brown.add("#ae7c5b");
        brown.add("#9e6c4b");
        brown.add("#8e5c3b");
        brown.add("#7e4c2b");
        brown.add("#6e3c1b");
        brown.add("#5e2c0b");

        List<String> puce = new ArrayList<String>();        // braunrot
        puce.add("#ffdcb5");
        puce.add("#ffc29b");
        puce.add("#ffb28b");
        puce.add("#ffa27b");
        puce.add("#ff926b");
        puce.add("#f3825b");
        puce.add("#e3724b");
        puce.add("#d3623b");
        puce.add("#c3522b");
        puce.add("#b3421b");
        puce.add("#a3320b");
        puce.add("#932210");

        List<String> slate = new ArrayList<String>();      // blaugrau
        slate.add("#c5d3e2");
        slate.add("#bccad9");
        slate.add("#acbac9");
        slate.add("#9caab9");
        slate.add("#8c9aa9");
        slate.add("#7c8a99");
        slate.add("#6C7A89");
        slate.add("#5c6a79");
        slate.add("#4c5a69");
        slate.add("#3c4a59");
        slate.add("#2c3a49");
        slate.add("#1c2a39");

        List<String> grey = new ArrayList<String>();
        grey.add("#d5e5e6");
        grey.add("#c5d5d6");
        grey.add("#b5c5c6");
        grey.add("#a5b5b6");
        grey.add("#95a5a6");
        grey.add("#859596");
        grey.add("#758586");
        grey.add("#657576");
        grey.add("#556566");
        grey.add("#455556");
        grey.add("#354546");
        grey.add("#253536");

        List<String> dark = new ArrayList<String>();
        dark.add("#e0e0e0");
        dark.add("#d0d0d0");
        dark.add("#c0c0c0");
        dark.add("#a0a0a0");
        dark.add("#909090");
        dark.add("#808080");
        dark.add("#707070");
        dark.add("#606060");
        dark.add("#505050");
        dark.add("#404040");
        dark.add("#303030");
        dark.add("#000000");

        expandableListDetail.put("RED", red);
        expandableListDetail.put("BLUE", blue);
        expandableListDetail.put("GREEN", green);
        expandableListDetail.put("YELLOW", yellow);
        expandableListDetail.put("PURPLE", purple);
        expandableListDetail.put("PINK", pink);
        expandableListDetail.put("CYAN", cyan);
        expandableListDetail.put("BROWN", brown);
        expandableListDetail.put("PUCE", puce);
        expandableListDetail.put("SLATE", slate);
        expandableListDetail.put("GREY", grey);
        expandableListDetail.put("DARK", dark);
        return expandableListDetail;
    }
}
