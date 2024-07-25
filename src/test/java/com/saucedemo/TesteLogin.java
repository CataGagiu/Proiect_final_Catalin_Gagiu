package com.saucedemo;

import org.testng.annotations.Test;

public class TesteLogin extends LoginBazaTest
{
    @Test
    public void logareFaraCredentiale()
    {
        apasaButonLogin();
        verificareMesajDeEroareUserSiParolaLipsa();
    }
    @Test
    public void credentialeCorecteUser1()
    {
        introduUsernameStandardUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }
    @Test
    public void credentialeCorecteUser2()
    {
        introduUsernameLockedOutUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareMesajDeEroareUserBlocat();
    }
    @Test
    public void credentialeCorecteUser3()
    {
        introduUsernameProblemUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }
    @Test
    public void credentialeCorecteUser4()
    {
        introduUsernamePerformanceGlitchUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }
    @Test
    public void credentialeCorecteUser5()
    {
        introduUsernameErrorUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }
    @Test
    public void credentialeCorecteUser6()
    {
        introduUsernameVisualUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }
    @Test
    public void user1CorectSiParolaGresita()
    {
        introduUsernameStandardUser();
        introduParolaParolaGresita();
        apasaButonLogin();
        verificareMesajParolaIncorecta();
    }
    @Test
    public void userGolParolaCorecta()
    {
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareMesajDeEroareUserLipsa();
    }
    @Test
    public void user1CorectParolaLipsa()
    {
        introduUsernameStandardUser();
        apasaButonLogin();
        verificareMesajParolaIncorecta();
    }
    @Test
    public void user2CorectParolaLipsa()
    {
        introduUsernameLockedOutUser();
        apasaButonLogin();
        verificareMesajParolaIncorecta();
    }
    @Test
    public void user3CorectParolaLipsa()
    {
        introduUsernameProblemUser();
        apasaButonLogin();
        verificareMesajParolaIncorecta();
    }
    @Test
    public void user4CorectParolaLipsa()
    {
        introduUsernamePerformanceGlitchUser();
        apasaButonLogin();
        verificareMesajParolaIncorecta();
    }
    @Test
    public void user5CorectParolaLipsa()
    {
        introduUsernameErrorUser();
        apasaButonLogin();
        verificareMesajParolaIncorecta();
    }
    @Test
    public void user6CorectParolaLipsa()
    {
        introduUsernameVisualUser();
        apasaButonLogin();
        verificareMesajParolaIncorecta();
    }
}
