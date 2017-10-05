package com.yeon.practice.criminalintent;

import android.content.Context;

/**
 * Created by Jaeho on 2017. 10. 5..
 */

public class CrimeLab {

    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {

    }
}
