package com.sh.template.callback.calculator.solution3;

public interface ICalcCallback<T> {
	T doCalc(String line, T result);
}
