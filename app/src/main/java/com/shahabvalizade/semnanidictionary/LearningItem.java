package com.shahabvalizade.semnanidictionary;
/**
 * Created by Rabo on 6/26/2018.
 */

public class LearningItem {
    //states
    private int mImageSrc;
    private String mLearningTitle;
    //constructor
    public LearningItem(String learningTitle,int imageSrc){
        mImageSrc = imageSrc;
        mLearningTitle = learningTitle;
    }
    //methods
    public int getImageSrc(){
        return mImageSrc;
    }
    public String getLearningTitle(){
        return mLearningTitle;
    }

}
