package model.strategy;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : strategy.DefLearn.java
//  @ Date : 2022. 03. 23.
//  @ Author : 
//
//


import model.Virologist;
import model.codes.GeneticCode;
import test.Tester;

/**
 * Alapértelmezett tanulási stratégia, ami által a virológus megtanulja a mezőn lévő genetikai kódot, ha van.
 */
public class DefLearn implements ILearnStr
{
	/**
	 * A stratégia alkalmazásakor hívott metódus.
	 * Megtanulja a virológus a mezőn lévő genetikai kódot, ha van ott olyan.
	 * @param v A virológus, aki tanulni próbál.
	 */
	public void Learn(Virologist v)
	{
		Tester.methodStart(new Object(){}.getClass().getEnclosingMethod());

		GeneticCode code = v.getField().LearnGeneticCode(v);
		v.AddGeneticCode(code);

		Tester.methodEnd(new Object(){}.getClass().getEnclosingMethod());
	}
}
