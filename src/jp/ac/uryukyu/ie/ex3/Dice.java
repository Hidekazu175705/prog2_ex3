package jp.ac.uryukyu.ie.ex3.pair11;

public class Dice{
    private int value;
    public Dice(){
	play();
    }

    public int getValue(){
	return value;
	}

    public void getValue(int value){
	this.value = value;
    }

    public void play(){
	this.value = (int)(Math.random()*6)+1;
    }
}