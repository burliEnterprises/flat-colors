package com.journaldev.expandablelistview;

/**
 * Created by Matteo on 05.12.2016.
 */

public enum CustomPagerEnum {


   /*  YELLOW(R.string.YELLOW, R.layout.view_yellow),
    PUCE(R.string.PUCE, R.layout.view_puce),
    BROWN(R.string.BROWN, R.layout.view_brown),
    GREEN(R.string.GREEN, R.layout.view_green),
    CYAN(R.string.CYAN, R.layout.view_cyan),
    BLUE(R.string.BLUE, R.layout.view_blue),
    RED(R.string.RED, R.layout.view_red),
    PINK(R.string.PINK, R.layout.view_pink),
    PURPLE(R.string.PURPLE, R.layout.view_purple),
    SLATE(R.string.SLATE, R.layout.view_slate),
    GREY(R.string.GREY, R.layout.view_grey),
    DARK(R.string.DARK, R.layout.view_dark);   alte reihenfolge */

    BLUE(R.string.BLUE, R.layout.view_blue),
    BROWN(R.string.BROWN, R.layout.view_brown),
    CYAN(R.string.CYAN, R.layout.view_cyan),
    DARK(R.string.DARK, R.layout.view_dark),
    GREEN(R.string.GREEN, R.layout.view_green),
    GREY(R.string.GREY, R.layout.view_grey),
    PINK(R.string.PINK, R.layout.view_pink),
    PUCE(R.string.PUCE, R.layout.view_puce),
    PURPLE(R.string.PURPLE, R.layout.view_purple),
    RED(R.string.RED, R.layout.view_red),
    SLATE(R.string.SLATE, R.layout.view_slate),
    YELLOW(R.string.YELLOW, R.layout.view_yellow);



        private int mTitleResId;
        private int mLayoutResId;

        CustomPagerEnum(int titleResId, int layoutResId) {
            mTitleResId = titleResId;
            mLayoutResId = layoutResId;
        }

        public int getTitleResId() {
            return mTitleResId;
        }

        public int getLayoutResId() {
            return mLayoutResId;
        }
}
