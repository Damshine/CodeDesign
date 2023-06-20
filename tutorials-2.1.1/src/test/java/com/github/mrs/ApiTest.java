package com.github.mrs;

import com.github.mrs.impl.GuestVideoUserService;

public class ApiTest {

    public static void main(String[] args) {

        IVideoUserService iVideoUserService = new GuestVideoUserService();
        iVideoUserService.definition();
        iVideoUserService.advertisement();

    }


}
