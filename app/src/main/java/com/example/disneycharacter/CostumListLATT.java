package com.example.disneycharacter;

public class CostumListLATT {
    private int mImgResId;
    private String mCharactersName, mPengisiSuara;

    public CostumListLATT(int imgId, String charactersN, String pengisiS) {
        mImgResId = imgId;
        mCharactersName = charactersN;
        mPengisiSuara = pengisiS;
    }

    public int getmImgResId()
    {
        return mImgResId;
    }

    public String getmCharactersName()
    {
        return mCharactersName;
    }

    public String getmPengisiSuara()
    {
        return mPengisiSuara;
    }
}
