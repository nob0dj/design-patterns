package com.sh.template.callback.solution3;

public interface ICalcCallback<T> {
	T doCalc(String line, T result);
}
