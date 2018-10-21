package com.application.haominwu.httplibrary.util;

import com.google.gson.Gson;

public class GsonUtil {

    private GsonUtil(){

    }

    private static class GsonHolder{
        private static final Gson INSTANCE = new Gson();
    }


    public static Gson getInstance()
    {
        return GsonHolder.INSTANCE;
    }

}