/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan09

import org.codehaus.groovy.runtime.InvokerHelper

class Robot {
	// ------------ START EDITING HERE ----------------------
	def x = 0
	def y = 0

	void left() {
		x -= 1
	}

	void right() {
		x += 1
	}

	void up() {
		y += 1
	}

	void down() {
		y -= 1
	}

	def invokeMethod(String name, Object args) {
		String nomeMetodo = "$name"
		def (intLeft, intRight, intUp, intDown) = identificaComando(nomeMetodo)
		realizaMovimentos(intLeft, intRight, intUp, intDown)
	}

	def identificaComando(String nomeMetodo) {
		int qtdAparecimentoRight = nomeMetodo.count('Right')
		int qtdAparecimentoLeft = nomeMetodo.count('Left')
		int qtdAparecimentoUp = nomeMetodo.count('Up')
		int qtdAparecimentoDown = nomeMetodo.count('Down')
		[qtdAparecimentoLeft, qtdAparecimentoRight, qtdAparecimentoUp, qtdAparecimentoDown]
	}

	def realizaMovimentos(int left, int right, int up, int down) {
		for (int i = 0; i < left; i ++){
			x -= 1
		}
		for (int i = 0; i < right; i ++){
			x += 1
		}
		for (int i = 0; i < up; i ++){
			y += 1
		}
		for (int i = 0; i < down; i ++){
			y -= 1
		}
	}
	// ------------ STOP EDITING HERE  ----------------------
}
