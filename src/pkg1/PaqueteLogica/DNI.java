/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.PaqueteLogica;

/**
 *
 * @author user
 */
public class DNI {
    private int mNumeroDNI;
    private final char [] mLetras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    //contructor sin aprametros
    public DNI(){
        mNumeroDNI = 0;
    }
    public DNI(int num){
        this.mNumeroDNI = num;
    }
    public void setNumeroDNI(int nuevoNum){
        this.mNumeroDNI = nuevoNum;
    }
    public int getNumeroDNI(){
        return mNumeroDNI;
    }
    public void obtenerLetra(){
        int resto;
        resto = mNumeroDNI % 23;
        System.out.println("DNI COMPLETO: "+mNumeroDNI+mLetras[resto]);
    }
}
