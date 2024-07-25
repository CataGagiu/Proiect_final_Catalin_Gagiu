package com.saucedemo;

import org.testng.annotations.Test;

public class TesteMeniuStangaSus extends MeniuBazaTest
{
    @Test
    public void verificareVizibilitateMeniuStangaSus()
    {
        verificareExistentaButonAllItem();
        verificareExistenteiLogout();
        verificareExistentaAbout();
        verificareExistentaResetAppState();
    }
    @Test
    public void verificareApasareButoanLogout()
    {
        apasaButonLogout();
    }
    @Test
    public void verificareApasareButonAbout()
    {
        apasaButonAbout();
    }
}
